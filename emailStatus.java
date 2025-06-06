package com.suman.www.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmailStatus {
    @Id
    private String id;
    private String status; // SENT, FAILED, RETRYING, QUEUED
    private int attempts;

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getAttempts() { return attempts; }
    public void setAttempts(int attempts) { this.attempts = attempts; }
}
