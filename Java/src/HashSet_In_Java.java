import java.util.HashSet;

public class HashSet_In_Java {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(5, 0.5F);

        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        hs.add(500);
        hs.add(600);
        hs.add(700);

        System.out.println(hs);
    }
}
