package com.company;

import daos.UserDao;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

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

//      _______________________________
        //delete user from database
/*        UserDao userDao = new UserDao();
        User userDeleteTest = userDao.read(12);
        if (userDeleteTest != null) {
            System.out.println(" not null");
        } else {
            System.out.println("null");
        }

        userDao.delete(12);

        User userDeleteTestAfter = userDao.read(12);
        if (userDeleteTestAfter != null) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
*/

//     ________________________________
        //find all users from dtb
/*        UserDao userDao = new UserDao();

        User [] array = userDao.findAll();
        System.out.println(Arrays.toString(array) + "  testttt");;

        System.out.println(array[0]);

        System.out.println(array[0].getId());
        System.out.println(array[1].getPassword());
        System.out.println(array[2].getUserName());
        System.out.println(array[3].getEmail());
*/

    }
}
