public class local {
    public static void main(String[] args) {
        m1(); 
    }
    public static void m1() {
        int a = 10; //local variable accessible only inside the method m1
        System.out.println(a);
        //m2();
    }
   /* public static void m2() {
        System.out.println(a); //cannot access a in m2
    } */ 
}
