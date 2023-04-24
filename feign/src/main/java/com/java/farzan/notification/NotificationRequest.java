package com.java.farzan.notification;

public record NotificationRequest(


        String toClientNationalId,
        String clientEmail,
        com.Farzan.client.Domain.Country ClientCountry,

        String message
)
{

}
