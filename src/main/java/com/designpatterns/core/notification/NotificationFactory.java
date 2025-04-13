package com.designpatterns.core.notification;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotificationFactory {

    private final EmailNotification email;
    private final SmsNotification sms;

    public NotificationFactory(EmailNotification email, SmsNotification sms) {
        this.email = email;
        this.sms = sms;
    }
    public List<Notification> getNotificationsFor(String preferencia) {
        return switch (preferencia.toLowerCase()) {
            case "email" -> List.of(email);
            case "sms" -> List.of(sms);
            case "ambos" -> List.of(email, sms);
            default -> List.of();
        };
    }
}

