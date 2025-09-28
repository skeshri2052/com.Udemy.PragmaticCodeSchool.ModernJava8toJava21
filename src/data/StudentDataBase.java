package data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
    /**
     *  Total of 6 students in the database.
     *  @return
     */
    public static List<Student> getAllStudents(){
        /**
         *  2nd Grade Students
         */
        Student student1 = new Student("Adam","male",2, 3.6, Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny","female",2,3.8, Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily","female",3,4.0, Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave","male",3,3.9, Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia","female",4,3.5, Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James","male",4,3.9, Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
