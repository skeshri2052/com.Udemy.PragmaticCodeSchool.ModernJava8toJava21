package bFunctionalInterfaces;

import java.util.function.Function;

public class gFunctionExample1 {
    public static String performConcat (String str){

       return fFunctionExample.addSomeString.apply(str);
    }
    public static void main(String[] args) {

        String result = performConcat("Hello");
        System.out.println("Result : "+result);
    }
}
