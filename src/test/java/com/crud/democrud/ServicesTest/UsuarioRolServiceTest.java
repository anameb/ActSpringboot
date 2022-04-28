package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.repositories.UsuarioRepository;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRolServiceTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Test
    public void testGuardarUsuarioRol(){

        UsuarioModel usuarioModel =new UsuarioModel("aquaman","aqua@gmail.com",99);
        UsuarioModel usuarioModelRegistrado = usuarioRepository.save(usuarioModel);

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol("RolTest");
        usuarioRol.setUsuario(usuarioModelRegistrado);

        UsuarioRol usuarioRolRegistrado = usuarioRolRepository.save(usuarioRol);
        assertNotNull(usuarioRolRegistrado);
    }

}
