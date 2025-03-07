import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> lesserThan = i -> (i < 18);
        System.out.println(lesserThan.test(10));
    }
}

//methods
//boolean (T t)
/* public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> adult = i -> i >= 18;
        System.out.println(adult.test(12));
        System.out.println(adult.test(19));
        System.out.println(adult.test(21));
    }
} */

//default Predicate and()
/* public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> adultYet = i -> i >= 18;
        Predicate<Integer> adultStill = i -> i < 65;
        System.out.println(adultYet. and(adultStill).test(5));
        System.out.println(adultYet. and(adultStill).test(38));
        System.out.println(adultYet. and(adultStill).test(90));
    }
} */

//default Predicate OR()
/* public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> containsA = t -> t.contains("crayon");
        Predicate<String> containsB = t -> t.contains("my");
        System.out.println(containsA. or(containsB).test("here is my crayon"));
        System.out.println(containsA. or(containsB).test("here is my pencil"));
        System.out.println(containsA. or(containsB).test("here is John's crayon"));
        System.out.println(containsA. or(containsB).test("here is John's pencil"));
    }
    
} */

//default Predicate negate()
/* public class PredicateDemo3 {
    public static void main(String[] args) {
        Predicate<Integer> adult = i -> i >= 18;
        System.out.println(adult.negate().test(7));
        System.out.println(adult.negate().test(19));
    }
} */

//default Predicate isEqual()
/* public class PredicateDemo4 {
    public static void main(String[] args) {
        Predicate<String> i = Predicate.isEqual("here is my crayon");
        System.out.println(i.test("here is my pencil"));
        System.out.println(i.test("here is my crayon"));
    } 
} */