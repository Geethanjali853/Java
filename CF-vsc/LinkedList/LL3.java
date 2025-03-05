import java.util.*;

public class LL3 {
    public static void main(String[] args) {
    HashSet hs1 = new HashSet(); //allowed heterogenous
    Set hs2 =  new HashSet();  //allowed heterogenous
    Set<Integer> eids = new HashSet<Integer>(); //allowed homogenous
    System.out.println(eids);
    eids.add(101);
    eids.add(102);
    eids.add(101);
    eids.add(102);
    eids.add(103);
    eids.add(104);
    eids.add(null);
    eids.add(null);
    System.out.println(eids);
    System.out.println(eids.isEmpty());
    // Using for Each and Iterator 
    System.out.println("*******For Each******");
    for (Integer eid : eids) {
        System.out.println(eid);
    }

    System.out.println("*******Iterator******");
    Iterator itr = eids.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }
    }
}