package FI2;

 class CalcImpl3 {
    public static void main(String[] args) {
        CalcI2 ci = num-> num * num;
        System.out.println(ci.squareIt(10));

    }
}
