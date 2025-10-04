package dStreams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class iStreamReduceExample2 {

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                // Getting student one by one
                .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1 : s2);
                /*.reduce((s1,s2) -> {
                    if(s1.getGpa() > s2.getGpa())
                    {
                        return s1;
                    }
                    else
                        return s2;
                });*/
    }

    public static void main(String[] args) {

        Optional<Student> studentOptional = getHighestGPAStudent();

        studentOptional.ifPresent(student -> System.out.println("getHighestGPAStudent : " + student));

    }

}
