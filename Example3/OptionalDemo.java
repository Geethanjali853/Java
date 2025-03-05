import java.util.Optional;

public class OptionalDemo  {
    //Main method
    public static void main(String[] args) {
        String[] words = new String[10];  //creating a string array
        Optional<String> checkNull = Optional.ofNullable(words[5]); // It returns an optional describing the specified value

        if ( checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.println(word);
        }
        else {
            System.out.println("word is null");
        }
    }
}

/*class OptionalDemo {
    public static void main(String[] args) {
        //creating a string array
        String[] str = new String[5];

        //setting value for 2nd index
        str[2] = "Geeks Classes are soming soon";

        //It returns an empty instance of optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        
        //It return a non empty optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
    }
}*/

/*class OptionalDemo {
    public static void main(String[] args) {
        //creating a string array
        String[] str = new String[5];

        //setting value for 2nd index
        str[2] = "Geeks classes are coming soon";

        //it returns a non-empty optional
        Optional<String> value = Optional.of(str[2]);

        //It returns value of an optional
        //if value is not present, it throws an NoSuchElementExceptions 
        System.out.println(value.get());

        //It returns hashCode of the value
        System.out.println(value.hashCode());

        //it returns true if value is present otherwise false
        System.out.println(value.isPresent());
    }
}*/