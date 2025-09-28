package cMethodReference;

import java.util.function.Function;

public class aFunMethodRefEx {

    static Function<String,String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("java-8"));

        System.out.println(toUpperCaseMethodReference.apply("java-8"));
    }
}
