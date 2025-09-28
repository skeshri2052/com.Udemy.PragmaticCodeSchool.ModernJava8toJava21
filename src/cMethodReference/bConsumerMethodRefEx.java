package cMethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class bConsumerMethodRefEx {

    //static Consumer<Student> c1 = p -> System.out.println(p);
    // className::methodName
    static Consumer<Student> c1 =  System.out::println;
    // className::instanceMethodName
    static Consumer<Student> c2 = Student::printListOfActivities;
    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("***************************");
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
