package dStreams;

import data.Student;
import data.StudentDataBase;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class eStreamFlatMapExample {
    /**
     *  flatmap() : used in the scnarios where each and every element in the stream
     *  represents list
     */
    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
    }
    public static List<String> printStudentActivitiesDistinct(){
        List<String> stuActivityDistinct = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
        return stuActivityDistinct;
    }
    public static long printStuActivityCount(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static List<String> printStudActivityCountAndSorted(){

        List<String> stuActivitySorted = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        return stuActivitySorted;
    }

    public static void main(String[] args) {

        System.out.println("printStudentActivities : "+printStudentActivities());
        System.out.println("***************************");
        System.out.println("printStudentActivitiesDistinct : "+printStudentActivitiesDistinct());
        System.out.println("***************************");
        System.out.println("printStuActivityCount : "+printStuActivityCount());
        System.out.println("***************************");
        System.out.println("printStudActivityCountAndSorted : "+printStudActivityCountAndSorted());
    }
}
