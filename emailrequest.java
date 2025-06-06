package com.suman.www.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Version;

@Entity
public class EmailRequest {

    @Id
    private String id;

    private String toAddress;
    private String subject;
    private String body;

    @Version
    private Long version;  // for optimistic locking

    @PrePersist
    public void generateId() {
        if (this.id == null || this.id.isEmpty()) {
            this.id = UUID.randomUUID().toString();
        }
    }

    // Getters and setters

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getToAddress() { return toAddress; }
    public void setToAddress(String toAddress) { this.toAddress = toAddress; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public Long getVersion() { return version; }
    public void setVersion(Long version) { this.version = version; }
}
