import java.util.*;

public class LL2 {
    public static void main(String[] args) {
    LinkedList<String> enames = new LinkedList<String>();
    System.out.println(enames);
    enames.add("Rahul");
    enames.add("Sonia");
    enames.add("Priyanka");
    enames.add("Modi");
    System.out.println(enames);

    //enames.set(0, "Nehru");
    enames.addFirst("Nehru");
    System.out.println(enames);
    enames.removeFirst();
    System.out.println(enames);
    }
}
