package com.designpatterns.core.notification;

import com.designpatterns.core.usuario.Usuario;

public class NotificationService {

    private NotificationService() {}

    private static class Holder {
        private static final NotificationService INSTANCE = new NotificationService();
    }

    public static NotificationService getInstance() {
        return Holder.INSTANCE;
    }

    public void enviar(Object notification, Usuario usuario, String mensagem) {
        if (notification instanceof Notification n) {
            System.out.println("chamando notification");
            n.notificate(usuario, mensagem);
        }
    }
}

