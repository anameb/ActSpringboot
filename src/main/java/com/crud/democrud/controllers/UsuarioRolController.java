package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.services.UsuarioRolService;
import com.crud.democrud.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/usuarioRol")
public class UsuarioRolController {
    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRol> obtenerUsuariosRol() {
        return usuarioRolService.obtenerUsuariosRol();
    }

    @PostMapping()
    public UsuarioRol guardarUsuarioRol(@RequestBody UsuarioRol usuarioRol) {
        return this.usuarioRolService.guardarUsuarioRol(usuarioRol);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioRol> obtenerUsuarioRolPorId(@PathVariable("id") Long id) {
        return this.usuarioRolService.obtenerPorId(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioRolService.eliminarUsuarioRol(id);
        if (ok) {
            return "Se eliminó el usuarioRol con id " + id;
        } else {
            return "No pudo eliminar el usuarioRol con id" + id;
        }
    }

    @PutMapping()
    public UsuarioRol actualizarUsuarioRol(@RequestBody UsuarioRol usuarioRol) {
        return this.usuarioRolService.guardarUsuarioRol(usuarioRol);
    }

}