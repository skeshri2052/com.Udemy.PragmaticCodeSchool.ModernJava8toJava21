package dStreams;

import data.Student;
import data.StudentDataBase;

public class jStreamMapReduceExample {

    public static int TotalNoOfNotebooks(){
        int noOfNoteBooks = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                //.reduce(0, (a,b) -> a+b);
                .reduce(0,Integer::sum);

        return noOfNoteBooks;
    }
        // Enhance the use case with more filter operation

    public static int TotalNoOfNoteBookWithFilterCondition(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(Student -> Student.getGradeLevel()>=3 && Student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("TotalNoOfNotebooks : "+TotalNoOfNotebooks());
        System.out.println("***************************");
        System.out.println("TotalNoOfNoteBooks with Filter Condition : "+TotalNoOfNoteBookWithFilterCondition());
        System.out.println("***************************");


    }
}
