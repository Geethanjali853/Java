import java.util.*;

public class GFG {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>(); // Creating list of string using arraylist
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");
        li.add("MERN");
        System.out.println("Elements of list are: ");
        for (String S : li) {
            System.out.println(S); //Iterating through the list
        }
        System.out.println("Elements at Index 1: " + li.get(1)); //Accessing Elements
        li.set(2, "Javascript"); //Updaring Elements
        System.out.println("Updated List: " + li);
        li.remove("C++"); //Removing elements
        System.out.println("List after removing elements: " + li);
    }
}
