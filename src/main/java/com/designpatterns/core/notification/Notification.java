package com.designpatterns.core.notification;

import com.designpatterns.core.usuario.Usuario;

public sealed interface Notification permits EmailNotification, SmsNotification {
    void notificate(Usuario usuario, String mensagem);
}

