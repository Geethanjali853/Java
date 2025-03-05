import java.util.*;

public class DequeEx {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();
        deq.addFirst("1");
        deq.addLast("2");
        String f = deq.removeFirst();
        String l = deq.removeLast();
        System.out.println("First" + f + "Last" + l);
    }
}
