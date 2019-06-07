package com.company;

import daos.ExerciseDao;
import daos.UserDao;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {

        //create 'type' to database
/*        Exercise exercise = new Exercise ("Exercise", "Exercise description contains description of the exercise");
        ExerciseDao exerciseDao = new ExerciseDao();
        exerciseDao.create(exercise);
        System.out.println(exercise.getId());
*/

//     _______________________________
        //read from database
/*        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exerciseReadTest = exerciseDao.read(1);
        System.out.println(exerciseReadTest.getId());
        System.out.println(exerciseReadTest.getDescription());
        System.out.println(exerciseReadTest.getTitle());

        System.out.println("________");

        if (exerciseDao.read(1)==null) {
    exerciseDao        System.out.println("null");
        } else if (exerciseDao.read(1)!=null) {
            System.out.println("not null");
        }
*/

//      _______________________________
        //update in database
/*        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exerciseUpdater = exerciseDao.read(1);
        exerciseUpdater.setTitle("99");
        exerciseUpdater.setDescription("99@911.pl");
        exerciseDao.update(exerciseUpdater);
*/

//      _______________________________
        //delete from database
/*        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exerciseDeleteTest = exerciseDao.read(1);
        if (exerciseDeleteTest != null) {
            System.out.println(" not null");
        } else {
            System.out.println("null");
        }

        exerciseDao.delete(1);

        Exercise exerciseDeleteTestAfter = exerciseDao.read(1);
        if (exerciseDeleteTestAfter != null) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
*/

//     ________________________________
        //find all from dtb
/*        ExerciseDao exerciseDao = new ExerciseDao();

        Exercise [] array = exerciseDao.findAll();
        System.out.println(Arrays.toString(array));

        System.out.println(array[0]);

        System.out.println(array[0].getId());
        System.out.println(array[0].getTitle());
        System.out.println(array[0].getDescription());
*/

    }
}
