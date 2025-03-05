package FI4;

public class testImpl7 { // With Lambda expressions.
    public static void main(String[] args) {
        Test5 t = name -> name.toUpperCase();
        System.out.println(t.apply("Rahul"));
    }
}
