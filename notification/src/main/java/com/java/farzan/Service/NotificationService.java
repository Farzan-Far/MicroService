package com.java.farzan.Service;

import com.java.farzan.Domain.Notification;
import com.java.farzan.Repository.repo;
import com.java.farzan.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
                        .toClientNationalId(request.toClientNationalId())
                        .toClientEmail(request.toClientEmail())
//                        .toClientCountry(request.ClientCountry()) todo: later add this to the method
                        .message(request.message())
                        .sender("Farzan")
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
