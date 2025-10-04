package fTerminalOperations;

import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class fCustomizedGroupingBy2Example {

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(Student -> Student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println(studentMap);
    }
    public static void twoLevelGrouping_2(){
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks)));

        System.out.println(studentMap);
    }
    public static void twoLevelGrouping_2Name(){
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {

        //twoLevelGrouping_1();
        //twoLevelGrouping_2();
        twoLevelGrouping_2Name();
    }

}
