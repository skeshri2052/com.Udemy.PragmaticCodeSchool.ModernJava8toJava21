package dStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class lStreamMinExample {

    /**
     * When you're calculating min_value you should not use identity approach..
     * It is always to use Optional approach.
     */

    public static int findMinValue(List<Integer> integerList){
       return integerList.stream()
               //
                .reduce(0, (a,b) -> a<b ? a:b );
    }
    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) -> a<b ? a:b);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> emptyIntList = new ArrayList<Integer>();

        int minValue = findMinValue(integerList);
        System.out.println("Min Value in list is: "+minValue); //Min Value in list is: 0
        // By using identity it's output is wrong. --> Always it's going to give (0) default value.

        System.out.println("****************************************");

        Optional<Integer> intListOptional = findMinValueOptional(integerList);
        System.out.println("Min Value in List Using Optional : "+intListOptional.get());

        System.out.println("****************************************");

        Optional<Integer> intListOptionalEmpty = findMinValueOptional(emptyIntList);
        if(intListOptionalEmpty.isPresent()){
            System.out.println("Min Value Using Optional is : "+intListOptionalEmpty.get());
        }
        else {
            System.out.println("No Input is passed");
        }


    }
}
