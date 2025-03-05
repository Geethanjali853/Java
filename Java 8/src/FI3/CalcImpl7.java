package FI3;

public class CalcImpl7 implements PrI{          // Implementation Class
    public boolean test (int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        PrI p = new CalcImpl7();
        System.out.println(p.test(31));
    }
}
