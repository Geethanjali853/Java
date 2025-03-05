import java.util.*;

public class LL1 {
    public static void main(String[] args) {
    LinkedList<String> enames = new LinkedList<String>();
    System.out.println(enames);
    enames.add("Rahul");
    enames.add("Sonia");
    enames.add("Priyanka");
    enames.add("Modi");
    System.out.println(enames);
    //size/length
    System.out.println(enames.size());
    //is empty or not
    System.out.println(enames.isEmpty());
    //get method
    System.out.println(enames.get(1));
    //loop, while, dowhile, forEach, iterator
    //indexing is possible

    for(int i=0; i<=enames.size()-1; i++) {
        System.out.println(enames.get(i));
    }
    System.out.println("******For Loop******");

    for (String ename : enames) {
        System.out.println(ename);
    }
    System.out.println("******For Each******");

    int i=0;
    while (i<=enames.size()-1) {
        System.out.println(enames.get(i));
        i++;
    }
    System.out.println("******While Loop******");

    Iterator itr = enames.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }
    System.out.println("******Iterator******");

    Collections.sort(enames);
    System.out.println(enames);
    System.out.println("******Ascending Order******");

    Collections.shuffle(enames);
    System.out.println(enames);
    System.out.println("******Descending Order******");

    }
}