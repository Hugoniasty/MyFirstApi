package com.company;

import daos.ExerciseDao;
import daos.SolutionDao;
import daos.UserGroupDao;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.TimeZone;

public class Main {
    public static void main (String[] args) {

        //create 'type' to database
     /*   UserGroup userGroup = new UserGroup ("Wyzsza szkola robienia halasu"); //nowy obiekt
        UserGroupDao userGroupDao = new UserGroupDao(); //nowy obiekt DAO który jest "łącznikiem" między obiektem Javy, a obiektem z Bazy Danych
        userGroupDao.create(userGroup); //w klasie DAO mamy metodę create, do tworzenia obiektów dla bazy danych
        System.out.println(userGroup.getId());
*/

//     _______________________________
        //read from database
    /*    UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup userGroupReadTest = userGroupDao.read(2); //UsGrpDAO ma metodę read, którą przypisujemy do obiektu UserGroup
        System.out.println(userGroupReadTest.getId()); //wypisujemy ID'ka grupy
        System.out.println(userGroupReadTest.getName()); //Wypisujemy name'a grupy
        System.out.println("________");

        if (userGroupDao.read(4) == null) {
            System.out.println("null");
        } else if (userGroupDao.read(4) != null) {
            System.out.println("not null");
        }
    */

//      _______________________________
        //update in database
/*        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup userGroupUpdater = userGroupDao.read(1);
        userGroupUpdater.setName("Mlodociani przestepcy Asterixa");
        userGroupDao.update(userGroupUpdater);
*/


//      _______________________________
        //delete from database
  /*      UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup userGroupDeleteTest = userGroupDao.read(3);
        if (userGroupDeleteTest != null) {
            System.out.println(" not null");
        } else {
            System.out.println("null");
        }

        userGroupDao.delete(3);

        UserGroup userGroupDeleteTestAfter = userGroupDao.read(3);
        if (userGroupDeleteTestAfter != null) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
*/

//     ________________________________
        //find all from dtb
        UserGroupDao userGroupDao= new UserGroupDao();

        UserGroup [] array = userGroupDao.findAll();
        System.out.println(Arrays.toString(array));

        System.out.println("\n" + array[0]);
        System.out.println(array[0].getId());
        System.out.println(array[0].getName() + "NAME");
    }
}
