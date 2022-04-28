package com.crud.democrud.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario-rol")
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String rol;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UsuarioModel usuarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UsuarioRol() {
    }

    public UsuarioRol(Long id, String rol) {
        this.id = id;
        this.rol = rol;
    }
}
