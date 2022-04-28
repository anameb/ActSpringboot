package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;
    
    public ArrayList<UsuarioRol> obtenerUsuariosRol(){
        return (ArrayList<UsuarioRol>) usuarioRolRepository.findAll();
    }

    public UsuarioRol guardarUsuarioRol(UsuarioRol usuarioRol){
        return usuarioRolRepository.save(usuarioRol);
    }

    public Optional<UsuarioRol> obtenerPorId(Long id){
        return usuarioRolRepository.findById(id);
    }

    public boolean eliminarUsuarioRol(Long id) {
        try{
            usuarioRolRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}