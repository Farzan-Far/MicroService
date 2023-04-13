package com.Farzan.client.DataModels;


public class Request
{
    private String name;
    private String family;
    private String nationalID;
    private String email;

    public Request(String name, String family, String nationalID, String email)
    {
        this.name = name;
        this.family = family;
        this.nationalID = nationalID;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", email='" + email + '\'' +
                '}';
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

