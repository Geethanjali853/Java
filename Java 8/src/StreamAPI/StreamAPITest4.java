package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamAPITest4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,7,18,34,45,66,90,32,12,31);
        long no_of_Evens = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.println(no_of_Evens);

        int no_of_EvenNumbers = 0;
        for (int i=0; i<=numbers.size()-1; i++) {
            if (numbers.get(i)%2 == 0) {
                no_of_EvenNumbers++;
            }
        }
        System.out.println(no_of_EvenNumbers);
    }
}
