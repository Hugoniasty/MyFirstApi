package com.company;

public class Main {
    public static void main (String[] args) {
        //write your code here
        User user = new User ("8Hugo", "8Hugo@hugo.pl", "Hugo");
        UserDao userDao = new UserDao();
        userDao.create(user);
        System.out.println(user.getId());
    }
}
