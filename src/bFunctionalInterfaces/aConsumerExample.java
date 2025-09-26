package bFunctionalInterfaces;

import java.util.function.Consumer;

public class aConsumerExample {
    public static void main(String[] args) {

        Consumer<String> c = str -> System.out.println(str.toUpperCase());
        c.accept("java");
    }
}
