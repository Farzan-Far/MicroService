package com.java.farzan.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
        name = "notification",
        url = ""
)
public interface NotificationClient
{
    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest request);
}
