package FI3;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestImpl2 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        Predicate<List> p = list -> list.isEmpty();
        System.out.println(p.test(enames));
    }
}
