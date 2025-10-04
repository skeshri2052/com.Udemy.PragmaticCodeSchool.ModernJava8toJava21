package dStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class kStreamMaxExample {
    /**
     * If you are calculating max_value.
     *  It is always recommended to use Optional as return type with reduce()
     */

    public static int findMaxValue(List<Integer> integerList){

        return integerList.stream()
                // 6 --> y
                // 7 --> y
                // 8 --> y
                // 9 --> y
                // 10 -> y
                .reduce(0, (a,b) -> a>b ? a : b);
    }
    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){

        return integerList.stream()
                .reduce((a,b) -> a>b ? a :b );
    }


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> emptyIntList = new ArrayList<Integer>();

        int maxValue = findMaxValue(integerList);
        System.out.println("Maximum value in list is: "+maxValue);
        System.out.println("***************************");

        // If list<Integer> is empty....

        System.out.println("Max value in list, Passing empty list: " +findMaxValue(emptyIntList));
        //Maximum value in list, Passing empty list : 0
        /**
         *  0 is the defalut value which is wrong.
         *
         */
        // 0 is defalut value which is wrong.
        // It should give empty list

        System.out.println("***************************");

        // Using List with value --- Using Optional
        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);

        if(maxValueOptional.isPresent()){
            System.out.println("Max value using Optional is: "+maxValueOptional.get());
        }
        else {
            System.out.println("Optional List is empty");
        }
        System.out.println("***************************");

        // Using Empty value --- Using Optional
        Optional<Integer> maxValueOptionalEmpty = findMaxValueOptional(emptyIntList);

        if(maxValueOptionalEmpty.isPresent())
        {
            System.out.println("Max value in list using Optional is: "+maxValueOptionalEmpty.get());
        }
        else
        {
            System.out.println("Input List is empty using Optional ");
        }
    }
}
