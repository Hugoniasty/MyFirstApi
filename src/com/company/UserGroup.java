package com.company;

public class UserGroup {

    private int id;
    private String name;

    public UserGroup (String name) {
        this.name = name;
    }

    public UserGroup () {
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
