/*interface  Bank {
    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
}
class Account implements Bank {
    public void m1() {
         System.out.println("Displaying m1");
    }
    public void m2() {
    System.out.println("Displaying m2");   
    }
    public void m3() {
        System.out.println("Displaying m3");
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.m1();
        a.m2();
        a.m3();
    }
} */

interface Bank {
    final static int price = 100;
}
class Account implements Bank {
    int price = 101;
    public static void main(String[] args) {
        Account a = new Account();
        //System.out.println(price);
        System.out.println(Bank.price);
        System.out.println(a.price);
    }
}