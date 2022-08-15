package com.server.app.rest.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Device {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;
}
