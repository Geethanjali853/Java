package FI4;

import java.util.function.Function;

public class Test4 { //Predefined functional interface.
    public static void main(String[] args) {
        Function<String, String> f = name -> name.toUpperCase();
        System.out.println(f.apply("Rahul"));
    }
}
