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
        UserGroupDao userGroupDao = new UserGroupDao();
        UserGroup userGroupReadTest = userGroupDao.read(2); //UsGrpDAO ma metodę read, którą przypisujemy do obiektu UserGroup
        System.out.println(userGroupReadTest.getId()); //wypisujemy ID'ka grupy
        System.out.println(userGroupReadTest.getName()); //Wypisujemy name'a grupy
        System.out.println("________");

        if (userGroupDao.read(4) == null) {
            System.out.println("null");
        } else if (userGroupDao.read(4) != null) {
            System.out.println("not null");
        }


//      _______________________________
        //update in database
       /* SolutionDao solutionDao = new SolutionDao();
        Solution solutionUpdater = solutionDao.read(1);
        solutionUpdater.setDescription("Noga motyla");
        solutionDao.update(solutionUpdater);

*/

//      _______________________________
        //delete from database
/*        SolutionDao solutionDao= new SolutionDao();
        Solution solutionDeleteTest = solutionDao.read(3);
        if (solutionDeleteTest != null) {
            System.out.println(" not null");
        } else {
            System.out.println("null");
        }

        solutionDao.delete(3);

        Solution solutionDeleteTestAfter = solutionDao.read(3);
        if (solutionDeleteTestAfter != null) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
*/

//     ________________________________
        //find all from dtb
   /*     SolutionDao solutionDao= new SolutionDao();

        Solution [] array = solutionDao.findAll();
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);

        System.out.println(array[1].getId());
        System.out.println(array[1].getUpdated() + " updated");
        System.out.println(array[1].getDescription());
        System.out.println(array[1].getCreated() + " created");
*/
    }
}
