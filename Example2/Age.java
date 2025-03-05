interface Age {
    int x = 21;
    void getAge();
}
class AnonymousDemo{
    public static void main(String[] args) {
        Age obj1 = new Age() {
            @Override public void getAge() {
                System.out.println("Age is: " + x);
            }
        };
        obj1.getAge();
    }
}
