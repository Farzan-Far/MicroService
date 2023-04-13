package com.Farzan.client.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client
{
    private String name;
    private String family;
    @Id
    private String nationalID;
    private String email;
    @Enumerated(EnumType.STRING)
    private Country country;
}
