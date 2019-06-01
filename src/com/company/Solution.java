package com.company;

import java.sql.Date;
import java.time.LocalDateTime;

public class Solution {

    private int id;
    private LocalDateTime created;
    private LocalDateTime updated;
    private String description;

    public Solution (int id, LocalDateTime created, LocalDateTime updated, String description) {
        this.id = id;
        this.created = created;
        this.updated = updated;
        this.description = description;
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
