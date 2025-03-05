import java.util.ArrayList;

public class ArrayListOne{
    public static void main(String[] args) {
        int[] eids = new int[4];
        eids[0] = 101;
        eids[1] = 102;
        eids[2] = 103;
        eids[3] = 104;
        System.out.println(eids);

        ArrayList al=new ArrayList();
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        System.out.println(al);
    }
}