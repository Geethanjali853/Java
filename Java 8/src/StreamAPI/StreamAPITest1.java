package StreamAPI;

import java.util.ArrayList;

public class StreamAPITest1 {
    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(44,75,18,199,20,71,14);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(44);
        numbers.add(75);
        numbers.add(18);
        numbers.add(199);
        numbers.add(20);
        numbers.add(71);
        numbers.add(14);
        System.out.println(numbers);
        ArrayList<Integer> even_Numbers = new ArrayList<Integer>(); //without Stream.
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                even_Numbers.add(number);
            }
        }
        System.out.println(even_Numbers);
        /**List even_numbers = numbers.stream() //with Stream.
                .filter(num -> num % 2 == 0) //Operation method.
                .collect(Collectors.toList()); //Terminal method.
        System.out.println(even_numbers);**/
    }
}
