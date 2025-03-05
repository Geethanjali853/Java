//Interface
interface Age {
    void getAge();
}

//Using Anonymous inner class
public class Test {
    public static void main(String[] args) {
        Age obj = new Age() {
            public void getAge() {
                System.out.println("Age is 21");
            }
        };
        obj.getAge();
    }
}