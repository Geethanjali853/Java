package FI3;

import java.util.ArrayList;
import java.util.List;

public class TestImpl1 implements TestI{
    public boolean test (List, List) {
        return list.isEmpty();
    }

    public static void main(String[] args) {
      ArrayList<String> enames = new ArrayList<String>();
      enames.add("Rahul");
      enames.add("Rahul");

      TestI p = new TestImpl1();
        System.out.println(p.test(enames));
    }
}
