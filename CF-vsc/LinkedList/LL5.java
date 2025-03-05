import java.util.*;

public class LL5 {
    public static void main(String[] args) {
       Set<String> enames = new HashSet<String>(); 
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Gautham");
       enames.add("Babu");
       enames.add("Anil");
       System.out.println(enames);
       //How to convert set to list 
       ArrayList<String> names = new ArrayList<String>(enames);
       Collections.sort(names);
       System.out.println(names);
    }
}
