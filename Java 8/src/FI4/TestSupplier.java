package FI4;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());
    }
}
