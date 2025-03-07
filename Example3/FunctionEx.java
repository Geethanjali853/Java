import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("Mango");
        System.out.println(apply);
    }
}
