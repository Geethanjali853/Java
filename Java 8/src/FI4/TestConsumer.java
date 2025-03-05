package FI4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestConsumer { //Predefined FI
    public static void main(String[] args) {
        List<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Modi");
        Consumer<List> cn = names -> {
            for (Object name : names){
                System.out.println(name);
            }
        };
        cn.accept(enames);
    }
}