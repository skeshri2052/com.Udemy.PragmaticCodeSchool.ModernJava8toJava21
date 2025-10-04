package dStreams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;


public class dStreamsMapExample {

    public static List<String> nameList(){
        /**
         *  map() method is used to convert one type to another type
         */
        List<String> stuList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
        return stuList;
    }
    public static List<String> nameListUpperCase(){
        List<String> stuListUpperCase = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
        return stuListUpperCase;
    }
    public static Set<String> nameListSet(){
        Set<String> nameSet = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toSet());
        return nameSet;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println("************************");
        System.out.println(nameListUpperCase());
        System.out.println("************************");
        System.out.println(nameListSet());
    }
}
