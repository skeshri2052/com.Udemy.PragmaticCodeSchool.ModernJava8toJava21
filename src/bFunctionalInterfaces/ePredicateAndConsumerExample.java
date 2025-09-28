package bFunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ePredicateAndConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name,activities) ->
            System.out.println(name+" : "+activities);

    Consumer<Student> studentConsumer = (s-> {
        if (p1.and(p2).test(s)) {
                studentBiConsumer.accept(s.getName(),s.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> students){
            students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> stuList = StudentDataBase.getAllStudents();
        new ePredicateAndConsumerExample().printNameAndActivities(stuList);
    }
}
