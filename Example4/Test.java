public class Test {
    static int a = 101;
    static int b;
    public static void main(String[] args) {
        System.out.println(b);
        Test t1 = new Test();
        t1.b = 38;
        System.out.println(t1.a + t1.b);
    }
}
