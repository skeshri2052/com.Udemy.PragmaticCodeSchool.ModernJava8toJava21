package aLambda;

public class RunnableLambdaExample {

    /**
     *  prior java 8
     */
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside runnable");
            }
        };
        new Thread(r).start();
        /**
         * Java 8 Lambda
         */
        Runnable runLambda = () -> System.out.println("Inside Lambda Runnable");
        new Thread(runLambda).start();

        new Thread(()-> System.out.println("Inside Lambda Exp - Optiomal way")).start();

    }
}
