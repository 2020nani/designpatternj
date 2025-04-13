package com.designpatterns.core.usuario;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final ApplicationEventPublisher eventPublisher;

    public UsuarioService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }


    public Usuario createUser(Usuario usuario) {
        System.out.println("Usuário cadastrado com sucesso: " + usuario.nome());
        eventPublisher.publishEvent(new UsuarioCadastradoEvent(this, usuario));
        return usuario;
    }
}

