package FI2;

interface CalcI2 {
    public abstract int squareIt (int num);
}
class CalcImpl2 implements CalcI2 {
    public int squareIt(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        CalcI2 ci = new CalcImpl2();
        System.out.println(ci.squareIt(10));
    }
}
