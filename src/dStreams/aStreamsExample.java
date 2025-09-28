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

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentMap);

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentgpaPredicate = (student -> student.getGpa() >= 3.9);

        Map<String, List<String>> studentMap1 = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentPredicate) // Stream<Students>
                .filter(studentgpaPredicate) // Stream<Students>
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // <Map>

        System.out.println(studentMap1);
    }
}
