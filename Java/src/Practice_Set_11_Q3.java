class Monkey {
    public void jump() {
        System.out.println("Monkey jumping");
    }

    public void bite() {
        System.out.println("Monkey biting");
    }
}

interface BasicAnimal {
    public void eat();

    public void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void speak() {
        System.out.println("Hello Sir");
    }

    public void eat() {
        System.out.println("Human eating");
    }

    public void sleep() {
        System.out.println("Human sleeping");
    }
}

public class Practice_Set_11_Q3 {
    public static void main(String[] args) {
        // Create a class Monkey with jump() and bite() methods. Create a class Human
        // which inherits this Monkey class and implements BasicAnimal interface with
        // eat() and sleep() methods.
        Human ankit = new Human();
        ankit.eat();
        ankit.sleep();
    }
}
