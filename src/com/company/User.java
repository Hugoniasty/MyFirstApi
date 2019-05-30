package com.company;

public class User {

    private int id;
    private String userName;
    private String email;
    private String password;
    private int group_id;

    public User (String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = hashPassword (password);
    }


    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public int getGroup_id () {
        return group_id;
    }

    public void setGroup_id (int group_id) {
        this.group_id = group_id;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

}
