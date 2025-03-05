import java.util.*;

public class AL4 {
    public static void main(String[] args) {
    ArrayList<String> enames = new ArrayList<String>();
    System.out.println(enames);
    enames.add("Rahul");
    enames.add("Sonia");
    enames.add("Priyanka");
    enames.add("Modi");
    System.out.println(enames);

    Iterator itr = enames.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }

    System.out.println("******* While Loop ******");

    int i=0;
    while (i<=enames.size()-1) {
        System.out.println(enames.get(i));
        i++;
    }

    System.out.println("******* Ascending Order ******");
    
    Collections.sort(enames);
    System.out.println(enames);

    System.out.println("******* Descending Order ******");
    
    Collections.sort(enames, Collections.reverseOrder());
    System.out.println(enames);

    System.out.println("******* Shuffle Order ******");
    
    Collections.shuffle(enames);
    System.out.println(enames);
  }
}