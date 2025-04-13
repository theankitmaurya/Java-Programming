
class Cylinder {

    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Practice_Set_9_Q1 {

    public static void main(String[] args) {
//        Create a class Cylinder and use getters and setters to set its radius and height.

        Cylinder cy = new Cylinder();

        cy.setRadius(5);
        System.out.println(cy.getRadius());
        cy.setHeight(10);
        System.out.println(cy.getHeight());
    }
}
