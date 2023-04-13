package com.Farzan.client.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Client
{
    private String name;
    private String family;
    @Id
    private String nationalID;
    private String email;
    @Enumerated(EnumType.STRING)
    private Country country;

    public Client(String name, String family, String nationalID, String email, Country country) {
        this.name = name;
        this.family = family;
        this.nationalID = nationalID;
        this.email = email;
        this.country = country;
    }

    public Client() {
    }

    public Client(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}