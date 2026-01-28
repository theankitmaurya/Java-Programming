class Dog<E> {
    E id;

    Dog (E id) {
        this.id = id;
    }

    E getId() {
        return id;
    }
}

public class Java_Generics1 {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("raj");
        Dog<String> d2 = new Dog<>("raj2");
        Dog<Integer> d3 = new Dog<>(3);

        System.out.println(d1.getId());
        System.out.println(d2.getId());
        System.out.println(d3.getId());

    }
}
