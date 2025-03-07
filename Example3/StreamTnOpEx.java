import java.util.*;
import java.util.stream.Collectors;

public class StreamTnOpEx {
    public static void main(String[] args) {
        //Sample data
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "Sorting", "State");

        //forEach: Print each name
        System.out.println("forEach: ");
        names.stream().forEach(System.out::println);

        //Collect: Collect names starting with 'S' into a list
        List<String> Snames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());
        System.out.println("Collect (names starting with 'S'): ");
        Snames.forEach(System.out::println);
        
        //reduce: Concatenated all names into a single string
        String concatenatedNames = names.stream().reduce("", (partialString, element) -> partialString + " " + element);
        System.out.println("reduce (concatenated names): ");
        System.out.println(concatenatedNames.trim());

        //Count: Count the number of names
        long count = names.stream().count();
        System.out.println("Count: ");
        System.out.println(count);

        //FindFirst: find the first name
        Optional<String>  firstName = names.stream().findFirst();
        System.out.println("FindFirst: ");
        firstName.ifPresent(System.out::println);

        //allMatch: Check if any names starts with 'S'
        boolean allStartWithS = names.stream().allMatch(name -> name.startsWith("S"));
        System.out.println("allMatch (all start with 'S'): ");
        System.out.println(allStartWithS);

        //anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(name -> name.startsWith("S"));
        System.out.println("anyMatch (any starts with 'S'): ");
        System.out.println(anyStartWithS);
    }
}
