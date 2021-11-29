package com.ciclo4.account.models;

import org.springframework.data.annotation.Id;

public class Appointment {
    @Id
    private String id;
    private String username;
    private String history;

    public Appointment(String id, String history){
        this.id = id;
        this.username = username;
        this.history = history;
    }

    public String getId() {
        return id;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
