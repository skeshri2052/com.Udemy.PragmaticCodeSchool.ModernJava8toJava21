package bFunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class dPredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void filterStudentsByGradeLevel(){

        System.out.println("filterStudentsByGradeLevel() ");
        List<Student> stuList = StudentDataBase.getAllStudents();
        stuList.forEach((s-> {
            if (p1.test(s)) //s.getGradeLevel()>=3
            {
                System.out.println(s);
            }
        }));
    }
    public static void filterStudentsByGpa(){

        System.out.println("filterStudentsByGpa() ");
        List<Student> stuList = StudentDataBase.getAllStudents();
        stuList.forEach((s-> {
            if(p2.test(s)) //s.getGpa()>=3.9
            {
                System.out.println(s);
            }
        }));
    }
    public static void filterStudents(){

        //Filter the students who are the grade level is 3 and GPA is 3.9
        System.out.println("filterStudents() ");
        List<Student> stuList = StudentDataBase.getAllStudents();
        stuList.forEach((s) -> { //s.getGradeLevel()>=3 && s.getGpa()>=3.9
            if(p1.and(p2).test(s)){
                System.out.println(s);
            }
        });
    }
    public static void main(String[] args) {
        System.out.println("***************************");
        filterStudentsByGradeLevel();
        System.out.println("***************************");
        filterStudentsByGpa();
        System.out.println("***************************");
        filterStudents();
        System.out.println("***************************");

    }
}
