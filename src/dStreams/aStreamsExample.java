package dStreams;

import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class aStreamsExample {
    public static void main(String[] args) {

        //Student name and their list of activites in a map
        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println("Student name and their activities in a Map : "+studentMap);

        //Student and their activities who belongs to grade level 3 and above

        //  .filter(student -> student.getGradeLevel()>=3)
        Predicate<Student> studentGradePredicate = (student -> student.getGradeLevel() >= 3);

        Map<String, List<String>> studentMap1 = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentGradePredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println("Student name and their activities who belongs to grade level 3 and above : "
                                    +studentMap1);

        //Student Name and their activities whose grade level >=3 && Gpa >=3.9

        Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);
        //  .filter(student -> student.getGpa() >=3.9)

        Map<String, List<String>> studentMap2 = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentGradePredicate) // Stream<Students>
                .filter(studentGpaPredicate) // Stream<Students>
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // <Map>

        System.out.println("Student Name and their activities whose gradeLevel >=3 && Gpa >=3.9 : "
                +studentMap2);
    }
}
