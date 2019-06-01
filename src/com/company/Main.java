package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main (String[] args) {
        //new user to database
/*      User user = new User ("9Hugo", "9Hugo@hugo.pl", "Hugo");
        UserDao userDao = new UserDao();
        userDao.create(user);
        System.out.println(user.getId());
*/

//     _______________________________
        //read user from database
/*        UserDao userDao = new UserDao();
        User userReadTest = userDao.read(12);
        System.out.println(userReadTest.getId());
        System.out.println(userReadTest.getUserName());
        System.out.println(userReadTest.getEmail());
        System.out.println(userReadTest.getPassword());

        System.out.println("________");

        if (userDao.read(12)==null) {
            System.out.println("null");
        } else if (userDao.read(12)!=null) {
            System.out.println("not null");
        }
*/

//      _______________________________
        //update user in database
/*        UserDao userDao = new UserDao();
        User userUpdaterTest = userDao.read(11);
        userUpdaterTest.setUserName("99");
        userUpdaterTest.setEmail("99@911.pl");
        userUpdaterTest.setPassword(userUpdaterTest.hashPassword("99"));
        userDao.update(userUpdaterTest);
*/
    }
}
