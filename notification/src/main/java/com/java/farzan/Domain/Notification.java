package com.java.farzan.Domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Notification
{
    @Id
    @SequenceGenerator(
            name = "notification_id_sequence",
            sequenceName = "notification_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_id_sequence"
    )
//    private Integer notificationId;
    private String toClientNationalId;
    private String toClientEmail;
    private String toClientCountry;
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}
