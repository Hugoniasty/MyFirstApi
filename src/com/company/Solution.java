package com.company;

import java.time.LocalDateTime;

public class Solution {

    private int id;
    private LocalDateTime created = LocalDateTime.now();
    private LocalDateTime updated = LocalDateTime.now();
    private String description;

    public Solution (String description) {
        this.description = description;
    }

    public Solution () {
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public LocalDateTime getCreated () {
        return created;
    }

    public void setCreated (LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated () {
        return updated;
    }

    public void setUpdated (LocalDateTime updated) {
        this.updated = updated;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}
