package com.designpatterns.core.usuario;

import org.springframework.context.ApplicationEvent;

public class UsuarioCadastradoEvent extends ApplicationEvent {

    private final Usuario usuario;
    public UsuarioCadastradoEvent(Object source, Usuario usuario) {
        super(source);
        this.usuario = usuario;
    }

    public Usuario getUsuario() { return usuario; }
}
