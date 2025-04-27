class Monkey1 {
    public void jump() {
        System.out.println("Monkey jumping");
    }

    public void bite() {
        System.out.println("Monkey biting");
    }
}

interface BasicAnimal1 {
    public void eat();

    public void sleep();
}

class Human1 extends Monkey1 implements BasicAnimal1 {
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

public class Practice_Set_11_Q5 {
    public static void main(String[] args) {
        Monkey m = new Human();
        // m.speak(); -> throws error
        m.jump();
        m.bite();

    }
}
