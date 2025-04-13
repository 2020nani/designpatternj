package com.designpatterns.core.usuario;

import com.designpatterns.core.notification.EmailNotification;
import com.designpatterns.core.notification.NotificationFactory;
import com.designpatterns.core.notification.SmsNotification;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UsuarioEventListener {
    private final NotificationFactory factory;

    public UsuarioEventListener(NotificationFactory factory) {
        this.factory = factory;
    }

    @EventListener
    public void handle(UsuarioCadastradoEvent event) {
        Usuario usuario = event.getUsuario();
        factory.getNotificationsFor(usuario.preferencia())
               .forEach(n -> {
                   if (n instanceof EmailNotification email) {
                       email.notificate(usuario, "E-mail: Bem-vindo, " + usuario.nome() + "!");
                   } else if (n instanceof SmsNotification sms) {
                       sms.notificate(usuario, "SMS: Bem-vindo, " + usuario.nome() + "!");
                   }
               });
    }
}