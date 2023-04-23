package com.Farzan.client.DataModels;


import com.Farzan.client.Domain.Country;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
import javax.persistence.*;
public class Request
{
    private String name;
    private String family;
    private String nationalID;
    private String email;
    @Enumerated(EnumType.STRING)
    private Country country;

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", email='" + email + '\'' +
                ", country=" + country +
                '}';
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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

    public String name() {
        return null;
    }

    public String family() {
        return null;
    }

    public String nationalID() {
        return null;
    }

    public String email() {
        return null;
    }
}

