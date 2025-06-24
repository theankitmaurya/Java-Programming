import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1> {
    int val;
    private T1 t1;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Java_Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add("Str1");
        list.add(new Scanner(System.in));

        int a = (int) list.get(0);
        System.out.println(a);

        MyGeneric<String> mg = new MyGeneric(23, "This is the generic string");
        String str = mg.getT1();
        System.out.println(str);
    }
}
