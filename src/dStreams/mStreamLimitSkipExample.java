package dStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class mStreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> intList){
        return intList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }
    public Optional<Integer> skip (List<Integer> intList){
        return intList.stream()
                .skip(2)
                .reduce((a,b) -> a+b);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult = limit(integerList);

        if(limitResult.isPresent()){
            System.out.println("The limit result is : "+limitResult.get());
        }
        else {
            System.out.println("No input is passed");
        }

        //Acessing non-static method to static class...
        mStreamLimitSkipExample skipExample = new mStreamLimitSkipExample();
        Optional<Integer> skipResult = skipExample.skip(integerList);

        if (skipResult.isPresent()){
            System.out.println("The Skip result is : "+skipResult.get());
        }
        else {
            System.out.println("No input is passed");
        }

    }
}
