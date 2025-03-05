package FI4;
@FunctionalInterface

interface Test5 {
    public abstract String apply(String name);

}
class TestImpl6  implements Test5 { // Without Lambda expressions and with user defined interface.
    public String apply (String name) {
        return name.toUpperCase();
    }
    public static void main(String[] args) {
        Test5 t = new TestImpl6();
        System.out.println(t.apply("Rahul"));
    }
}
