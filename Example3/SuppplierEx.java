import java.util.function.Supplier;

public class SuppplierEx {
    public static void main(String[] args) {
        //This function returns a random value
        Supplier<Double> randomvalue = () -> Math.random();
        
        //Print the random value using get()
        System.out.println(randomvalue.get());
    }
}
