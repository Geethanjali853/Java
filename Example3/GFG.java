import java.util.stream.*;

public class GFG {
    public static void main(String[] args) {
        //Get the stream
        Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");
        //print the stream
        //using double colon operator
        stream.forEach(System.out::println);
    }
} 

/*public class GFG {
    public static void main(String[] args) {
        //get the stream
        Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");
        //print the stream using lambda experssion without double colon operator
        stream.forEach(s -> System.out.println(s));
    }
}*/
