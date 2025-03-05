interface functinterface {
    void abstractfun(int x);
    default void normalfun() {
        System.out.println("Hello");
    }
}
class Test3 {
    public static void main(String[] args) {
        functinterface fobj = (int x) -> System.out.println(2 * x);
        fobj.abstractfun(5);
    }
}

