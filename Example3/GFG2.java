import java.util.*;

public class GFG2 {
    //static function to be called
    static void someFunctions(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");
        //call the static method
        //using double colon operator
        list.forEach(GFG2::someFunctions);
    }
}

/*public class GFG2{
    //instance function to be called
    void someFunctions(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");
        //call the instance method
        //using double colon operator
        list.forEach((new GFG2()) :: someFunctions);
    }
}*/

/*class GFG2 {
    //Class Constructor
    public GFG2(String s) {
        System.out.println("Hello " + s);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");
        //call the class constructor
        //using double colon operator
        list.forEach(GFG2 :: new);
    }
}*/
