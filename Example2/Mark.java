public class Mark {
    int a; //instance variable
    int b; //instance variable
    static int c =  30; //static variable

    public static void main(String[] args) {
        Mark m1 = new Mark();
        System.out.println(m1.a); // default value 
        m1.a = 10; //initializing value for a and b
        m1.b = 20;
        System.out.println(m1.a + m1.b + m1.c); //using instance accessing static variable c

        Mark m2 = new Mark();
        m2.a = 55;
        m2.b = 35;
        System.out.println(m2.a + m2.b + Mark.c); //using class name accessing static variable c

        Mark.c = 85; //accessing static variable c directly 
        System.out.println(m1.b + m2.a + c);

    }
}
