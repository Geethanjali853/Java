public class Emp {
    static String org_Name = "TCS"; //static variable
    int eid = 101; //instance variable
    String ename;  //instance variable

    public static void main(String[] args) {
        float esal = 58000;  //local variable
        Emp e1 = new Emp();
        System.out.println(e1);
        System.out.println(e1.ename);
        System.out.println(e1.eid);
        System.out.println(esal);
        System.out.println(org_Name);
    }
}
