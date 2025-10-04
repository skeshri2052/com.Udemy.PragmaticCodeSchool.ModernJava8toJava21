package fTerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class gGroupingBy3Example {

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName ,
                        LinkedHashMap::new,
                        Collectors.toSet()));
        System.out.println(studentLinkedHashMap);
    }

    public static void main(String[] args) {

        threeArgumentGroupBy();
        System.out.println("********");
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
