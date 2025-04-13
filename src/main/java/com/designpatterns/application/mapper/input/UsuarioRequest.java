package com.designpatterns.application.mapper.input;

import com.designpatterns.core.usuario.Usuario;

public record UsuarioRequest (String nome, String email, String telefone, String preferencia){

    public Usuario converteUsuario() {
        return new Usuario(this.nome, this.email, this.telefone, preferencia);
    }
}
