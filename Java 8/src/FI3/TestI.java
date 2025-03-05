package FI3;
import java.util.*;

interface TestI {
    public abstract boolean test (List, List);

}
class TestImpl1 implements TestI {
    public boolean test (List, List) {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        TestI p = new TestImpl1();
        System.out.println(p.test(enames));
    }
}
