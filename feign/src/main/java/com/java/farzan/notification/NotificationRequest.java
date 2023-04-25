package com.java.farzan.notification;

public record NotificationRequest(
        String toClientNationalId,
        String toClientEmail,
        String message)
{

}
