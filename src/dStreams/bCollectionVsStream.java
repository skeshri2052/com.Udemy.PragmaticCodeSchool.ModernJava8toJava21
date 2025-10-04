package dStreams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Stream;

public class bCollectionVsStream {
    /**
     *   In collection we can add, remove & modify values
     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Ram");
        names.add("Laxman");
        names.add("Shyam");
        names.add("Sita");
        System.out.println("All names"+names);
        names.remove(2);
        names.remove("Sita");
        System.out.println("After Remove name"+names);

        /**
         * But, Stream does not allow us to add, remove & modify elements from the Stream
         *     once it is created.
         */
        // names.stream().add() --> Not allowed
        // names.stream().remove() --> Not allowed

        System.out.println("**************************");
        /**
         *   Collection can be traversed 'n' no. of times.
         *   And, this is External iteration.
         */
        System.out.println("For each loop 1st Iteration");
        for (String name: names){
            System.out.println(name);
        }
        System.out.println("For each loop 2nd Iteration");
        for (String name: names){
            System.out.println(name);
        }
        System.out.println("*******************************");

        /**
         * Streams can be traversed only once.
         * And, This is internal Iteration.
         */
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //name.Stream.forEach(System.out::println);
        // This is not allow because bcoz stream has already operated

    }
}
