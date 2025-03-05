package FI3;

interface PrI {
    public abstract boolean test (int num);

}
class CalcImpl6 {
    public static void main(String[] args) {
        PrI p = num-> num % 2 == 0;
        System.out.println(p.test(31));
    }
}
