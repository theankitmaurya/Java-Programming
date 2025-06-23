import java.util.ArrayDeque;

public class Array_Deque_In_Java {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();

        a1.add(100);
        a1.add(200);
        a1.add(300);
        a1.add(400);
        a1.addFirst(0);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
    }
}
