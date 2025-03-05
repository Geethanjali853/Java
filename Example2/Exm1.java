public class Exm1 {
    static int a;   // static variable
    static int b = 10; //static variable

    public static void main(String[] args) {
        System.out.println(a); //without creating object we can access static variable
        Exm1 e1 = new Exm1(); 
        System.out.println(e1.b); //with creating object also we can access static variable
    }
}
