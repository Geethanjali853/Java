import java.util.*;

public class AL3 {
    public static void main(String[] args) {
    ArrayList<String> enames = new ArrayList<String>();
    System.out.println(enames);
    enames.add("Rahul");
    enames.add("Sonia");
    enames.add("Priyanka");
    enames.add("Modi");
    System.out.println(enames);

    /*for(int i=0; i<=enames.size()-1; i++){
        System.out.println(enames.get(i));
    }*/

    for (String ename: enames) {
        System.out.println(ename);
    }

    enames.set(1,"Sonia Gandhi");
    System.out.println(enames);
    enames.clear();
    System.out.println(enames);
    }
    
}
