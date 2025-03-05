package StreamAPI;

import java.util.*;

public class StreamAPITest6 {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("rahul", "sonia", "priyanka", "swathi", "sai", "preethi", "vishnu", "swaroop", "priya", "shiva", "geethanjali", "fathima");
        System.out.println(enames);
        //Sorting.
        Collections.sort(enames);
        System.out.println(enames);
        //Converting to UpperCase.
        List<String> new_enames = new ArrayList<String>();
        for (String ename : enames) {
            new_enames.add(ename.toUpperCase());
        }
        System.out.println(new_enames);
        //How many employees names starts with "p".
        int no_of_employees = 0;
        Iterator itr = enames.iterator();
        while (itr.hasNext()) {
             if (itr.next().toString().startsWith("p")) {
                 no_of_employees++;
             }
        }
        System.out.println(no_of_employees);
    }
}
