package com.designpatterns.core.usuario;

import com.designpatterns.application.mapper.output.UsuarioResponse;

public record Usuario(String nome, String email, String telefone, String preferencia) {
    public UsuarioResponse converteResponse() {
        return new UsuarioResponse(nome,email,telefone);
    }
}

