public class Test1 {
    int eid; // instances variable without value 
    int eid2 = 101; //instance variable with value

    public static void main(String[] args) {
        Test1 t1 = new Test1(); //creating object to access instance variable
        System.out.println(t1.eid); //0
        System.out.println(t1.eid2); //101
    }
}
