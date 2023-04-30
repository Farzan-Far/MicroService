package com.java.farzan.Config;

import com.java.farzan.Service.NotificationService;
import com.java.farzan.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer
{
    private final NotificationService service;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consume(NotificationRequest request)
    {
        log.info("Consumed {} from queue", request);
        service.sendNotification(request);
    }
}
