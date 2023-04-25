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
    private String toClientNationalId;
    private String toClientEmail;
//    private String toClientCountry; //Todo: add this value to the table
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}
