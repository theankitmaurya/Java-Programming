class c1 extends Extension{
    void Extension() {
        System.out.println(proInt);
        System.out.println(defInt);
    }
}

public class Practice_Set_12_Q4 {
    public static void main(String[] args) {
//        Prove that you cannot access default property but can access protected property from the subclass.
        System.out.println("I am main method");
        c1 c =  new c1();
    }
}