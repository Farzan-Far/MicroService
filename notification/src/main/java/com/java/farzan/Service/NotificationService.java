package com.java.farzan.Service;

import com.java.farzan.Domain.Notification;
import com.java.farzan.Repository.repo;
import com.java.farzan.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService
{

    private final repo repository;
    public void sendNotification(NotificationRequest request)
    {

        repository.save(
                Notification.builder()
                        .notificationId(request.notificationId())
                        .toClientNationalId(request.toClientNationalId())
                        .toClientEmail(request.clientEmail())
                        .toClientCountry(request.ClientCountry())
                        .message(request.message())
                        .sender("Farzan")
                        .sentAt(LocalDateTime.now())
                        .build()
        );

    }
}
