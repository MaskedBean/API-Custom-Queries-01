package com.example.API.Custom.Queries1.entities;

public enum Status {

    ONTIME("ONTIME"),
    DELAYED("DELAYED"),
    CANCELLED("CANCELLED");

    private String setStatus;

    private Status(String setStatus){
        this.setStatus = setStatus;
    }

    public String getSetStatus() {
        return setStatus;
    }
}
