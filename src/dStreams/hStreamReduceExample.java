package dStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class hStreamReduceExample {

    /**
     *  .reduce() -- We can use this method in two ways..
     *  1. With initial value -- Using identity approach
     *  2. Without using initial value -- Using Optional approach
     */

    public static int performMultiplication(List<Integer> intList){

        return  intList.stream()
                //1
                //3
                //5
                //7
                //----------background operation reduce() performed :-
                // a=1, b=1(from stream) -- as result 1 is return
                // a=1, b=3(from stream) -- as result 3 is return
                // a=3, b=5(from stream) -- as result 15 is return
                //a=15, b=7(from stream) -- as result 105 is return
                .reduce(1,(a,b) -> a*b);

    }
        //Optional is introduced to handle null value exception in java 8
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> intListEmpty){

        return intListEmpty.stream()
                .reduce((a,b) -> a*b);
    }
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,3,5,7);
        List<Integer> intListEmpty = new ArrayList<>();

        System.out.println("performMultiplication : "+performMultiplication(intList));
        System.out.println("********************************");

        /**
         *  Optional is a object it introduced in java to graceful termination of null value exception.
         *  First we need to use .isPresent() -- After we will use .get() to get result in Optional
         *  If we are using Identity wala approach we will get null value exception.
         */

        Optional<Integer> result = performMultiplicationWithoutIdentity(intList);
        System.out.println(result.isEmpty()); // First we will check value is present or not
        System.out.println(result.get()); //  If value is true then only we will use .get()
                                           // Otherwise, we will get Null_Value exception..

        System.out.println("********************************");
        System.out.println("performMultiplicationWithoutIdentity : "
                    +performMultiplicationWithoutIdentity(intList));
        System.out.println("********************************");

        Optional<Integer> nullResult = performMultiplicationWithoutIdentity(intListEmpty);
        System.out.println(nullResult.isPresent());
        System.out.println(nullResult.isEmpty());

        if(nullResult.isPresent()){
            System.out.println(nullResult);
        }


    }
}
