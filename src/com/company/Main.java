package com.company;

import daos.ExerciseDao;
import daos.SolutionDao;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.TimeZone;

public class Main {
    public static void main (String[] args) {

        //create 'type' to database
     /*   Solution solution = new Solution ("3223Description of solution");
        SolutionDao solutionDao = new SolutionDao();
        solutionDao.create(solution);
        System.out.println(solution.getId());
*/

//     _______________________________
        //read from database
       /* SolutionDao solutionDao= new SolutionDao();
        Solution solutionReadTest = solutionDao.read(1);
        System.out.println(solutionReadTest.getId());
        System.out.println(solutionReadTest.getDescription());
        System.out.println(solutionReadTest.getUpdated());
        System.out.println(solutionReadTest.getCreated());

        System.out.println("________");

        if (solutionDao.read(1) == null) {
            System.out.println("null");
        } else if (solutionDao.read(1) != null) {
            System.out.println("not null");
        }*/


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
        SolutionDao solutionDao= new SolutionDao();

        Solution [] array = solutionDao.findAll();
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);

        System.out.println(array[1].getId());
        System.out.println(array[1].getUpdated() + " updated");
        System.out.println(array[1].getDescription());
        System.out.println(array[1].getCreated() + " created");

    }
}
