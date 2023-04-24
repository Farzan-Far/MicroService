package com.java.farzan.Controller;

import com.java.farzan.Service.NotificationService;
import com.java.farzan.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("api/v1/notification")
public class NotificationController
{
    private final NotificationService service;

    @PostMapping("/send")
    public void send(@RequestBody NotificationRequest request)
    {
       log.info("New Notification.... {}",request);
        service.sendNotification(request);
    }
}
