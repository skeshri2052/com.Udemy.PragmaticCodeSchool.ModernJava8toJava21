package bFunctionalInterfaces;

import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;

public class aConsumerExample {

    static Consumer<Student> c2 = stu -> System.out.println(stu);
    static Consumer<Student> c3 = stu -> System.out.print(stu.getName());
    static Consumer<Student > c4 = stu -> System.out.println(stu.getActivities());

    public static void main(String[] args) {

        Consumer<String> c1 = str -> System.out.println(str.toUpperCase());
        c1.accept("java");
        System.out.println("***************************");

        printName();
        System.out.println("***************************");
        printNameAndActivities();
        System.out.println("***************************");
        printNameAndActivitiesUsingCondition1();
        System.out.println("***************************");
        printNameAndActivitiesUsingCondition2();
        System.out.println("***************************");

        }
    public static void printName() {
        System.out.println("printName");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities");
        List<Student> studentList = StudentDataBase.getAllStudents();
       studentList.forEach(c3.andThen(c4)); // Consumer Chaining
    }
    public static void printNameAndActivitiesUsingCondition1(){
        System.out.println("printNameAndActivitiesUsingCondition1");
        List<Student> stuList = StudentDataBase.getAllStudents();

        stuList.forEach((stu -> { if (stu.getGradeLevel()>=3){ c3.andThen(c4).accept(stu);}}));
    }
    public static void printNameAndActivitiesUsingCondition2(){
        System.out.println("printNameAndActivitiesUsingCondition2");
        List<Student> stuList = StudentDataBase.getAllStudents();

        stuList.forEach((stu -> {
            if(stu.getGradeLevel()>=3 && stu.getGpa()>=3.9)
            {
                c3.andThen(c4).accept(stu);
            }
        }));
    }

}

