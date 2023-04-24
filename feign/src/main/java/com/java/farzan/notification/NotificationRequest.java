package com.java.farzan.notification;

public record NotificationRequest(

        Integer notificationId,

        String toClientNationalId,
        String clientEmail,
        String ClientCountry,

        String message
)
{
}
