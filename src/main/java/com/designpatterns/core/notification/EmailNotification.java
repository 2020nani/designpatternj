package com.designpatterns.core.notification;

import com.designpatterns.core.usuario.Usuario;
import org.springframework.stereotype.Component;

@Component
public final class EmailNotification implements Notification {
    public void notificate(Usuario usuario, String mensagem) {
        System.out.printf("Enviando EMAIL para %s (%s): %s%n",
                usuario.nome(), usuario.email(), mensagem);
    }
}

