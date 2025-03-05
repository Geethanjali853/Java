package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest5 {  //With Stream
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("rahul", "sonia", "priyanka", "swathi", "sai", "preethi", "vishnu", "swaroop", "priya", "shiva", "geethanjali", "fathima");
        System.out.println(enames);
        //Sorting and converting to UpperCase.
        List<String> new_enames = enames.stream().sorted().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(new_enames);
        //How many employees names starts with "p".
        long no_of_employees = enames.stream().filter(ename -> ename.startsWith("p") ).count();
        System.out.println(no_of_employees);
        enames.stream().filter(ename -> ename.startsWith("p")).forEach(System.out::println); // with double colon. Left handside and Right handside variable name is same then we can use double colon operator.
        enames.stream().filter(ename -> ename.startsWith("p")).forEach(ename -> System.out.println(ename)); //without double colon.

    }
}
