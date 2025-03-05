package StreamAPI;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPITest3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,19);
        List evens = numbers.stream().filter(number -> number % 2 == 0)
                                   .collect(Collectors.toList());
        System.out.println(evens);
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
    }
}
