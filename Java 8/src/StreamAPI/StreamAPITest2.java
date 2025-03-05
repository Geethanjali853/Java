package StreamAPI;

import java.util.ArrayList;

public class StreamAPITest2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(44);
        numbers.add(75);
        numbers.add(18);
        numbers.add(199);
        numbers.add(20);
        numbers.add(71);
        numbers.add(14);
        System.out.println(numbers);
        /**for (Integer number : numbers){ //without Stream.
            if (number % 2 == 0) {
                System.out.println(number);
                }
            }**/
       numbers.stream().filter(num -> num % 2 == 0)  //with Stream.
                        .forEach(num -> System.out.println(num));
        }
    }

