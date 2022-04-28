package com.crud.democrud.models;

import javax.persistence.*;

@Entity
@Table(name = "usuariorol")
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String rol;
    @ManyToOne()
    @JoinColumn(name="usuarioid")
    private UsuarioModel usuario;

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

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
}
