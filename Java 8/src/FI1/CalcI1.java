package FI1;

public interface CalcI1 { //user defined interface CalcI
    public abstract int add (int a, int b);
}
class CalcImpl1 {
    public static void main(String[] args) {
        CalcI obj = (a,b)->a+b;
        System.out.println(obj.add(10,20));
    }
}
