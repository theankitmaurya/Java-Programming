import java.util.HashSet;

public class Practice_Set_15_Q5 {
    public static void main(String[] args) {
//        Create a Set in Java. Try to store duplicate elements inside this set and verify that only one instance is stored.
        HashSet<Integer> s = new HashSet<>();
        s.add(3);
        s.add(34);
        s.add(5);
        s.add(8);
        s.add(34);
        s.add(0);

        System.out.println(s);
    }
}
