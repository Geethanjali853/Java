package FI;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        data.add(new ArrayList<Integer>(Arrays.asList(10,20,30)));
        System.out.println(data);
    }
}
