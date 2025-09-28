package bFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class cPredicateExample {
    static Predicate<Integer> p1 = a -> a%2 == 0;
    static Predicate<Integer> p2 = a -> a%5 == 0;

    public static void predicateAnd(){
        System.out.println("predicateAnd() ");
        // Predicate Chaining
        System.out.println("Predicate AND Result is: "+p1.and(p2).test(10));
        System.out.println("Predicate AND Result is: "+p1.and(p2).test(9));
    }
    public static void predicateOr(){
        System.out.println("predicateOR() ");
        System.out.println("Predicate OR Result is: "+p1.or(p2).test(10));
        System.out.println("Predicate OR Result is: "+p1.or(p2).test(8));
    }
    public static void predicateNegate(){
        System.out.println("predicateNegate() ");
        System.out.println("Predicate OR Result is: "+p1.negate().test(10));
        System.out.println("Predicate OR Result is: "+p1.or(p2).negate().test(8));
    }
    public static void main(String[] args) {

        System.out.println(p1.test(5));
        System.out.println("***************************");
        predicateAnd();
        System.out.println("***************************");
        predicateOr();
        System.out.println("***************************");
        predicateNegate();
        System.out.println("***************************");
    }
}
