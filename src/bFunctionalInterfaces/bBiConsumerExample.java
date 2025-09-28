package bFunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class bBiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities) ->
                System.out.println(name+" : "+activities);
        List<Student> stuList = StudentDataBase.getAllStudents();

        stuList.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
    }
    public static void main(String[] args) {

        BiConsumer<String, String> biCon = (str1,str2) ->
                System.out.println("String 1: "+str1+" String 2: "+str2);
        biCon.accept("Shubham","Keshri");
        biCon.accept("java7","java8");
        System.out.println("***************************");

        BiConsumer<Integer,Integer> multiply = (a,b) ->
                System.out.println("Multiplication is : "+(a*b));
        multiply.accept(2,3);
        System.out.println("***************************");

        BiConsumer<Integer,Integer> divide = (a,b) ->
                System.out.println("Division is : "+(a/b));
        divide.accept(4,4);
        System.out.println("***************************");

        multiply.andThen(divide).accept(10,5);
        System.out.println("***************************");

        nameAndActivities();
        System.out.println("***************************");

    }
}
