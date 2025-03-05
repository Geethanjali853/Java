package FI3;
import java.util.function.Predicate;

public class CalcImpl5 {  // Lambda with Pre-defined
    public static void main(String[] args) {
        Predicate<Integer> p = num -> num % 2 == 0; //Predicate contains only one abstract method
        System.out.println(p.test(31));
    }
}
