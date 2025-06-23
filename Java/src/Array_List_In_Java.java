import java.util.ArrayList;

public class Array_List_In_Java {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(0,6);
        l1.add(1,7);

        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);


        l1.addAll(3, l2);
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(3));

        l1.set(0, 100);

        for (int i = 0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
