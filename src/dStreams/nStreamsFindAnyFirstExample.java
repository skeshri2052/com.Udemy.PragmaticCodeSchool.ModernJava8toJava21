package dStreams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class nStreamsFindAnyFirstExample {
    /**
     *  When we run the stream in parallel mode
     *  This code is crystal clear
     */
    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> stuOptionalFindAny = findAnyStudent();
        Optional<Student> studOptionalFindFirst = findFirstStudent();

        if (findAnyStudent().isPresent()){
            System.out.println("Found the student findAnyStudent(): "+stuOptionalFindAny.get());
        }else {
            System.out.println("Student Not Found !");
        }
        System.out.println("******************************");
        if (studOptionalFindFirst.isPresent()) {
            System.out.println("Found the Student studOptionalFindFirst():" + studOptionalFindFirst.get());
        }else {
            System.out.println("Student Not Found !");
        }
    }
}
