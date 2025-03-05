package FI4;

import java.util.*;
import java.util.function.Function;

public class Fun1 {
    public static void main(String[] args) {
        List<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Modi");
        Function<List, Integer> fn1 = list -> list.size();
        Function<String, Integer> fn2 = str -> str.length();
        Function<List, Boolean> fn3 = data -> data.isEmpty();
        System.out.println(fn1.apply(enames));
        System.out.println(fn2.apply("Rahul"));
        System.out.println(fn3.apply(enames));
    }
}