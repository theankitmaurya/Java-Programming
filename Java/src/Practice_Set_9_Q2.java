
import java.util.Scanner;

class CylinderDetails {

    private float radius;
    private float height;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float surfaceArea() {
        return (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius));
    }

    public float volume() {
        return (float) (Math.PI * radius * radius * height);
    }
}

public class Practice_Set_9_Q2 {

    public static void main(String[] args) {
//        Use Question 1 to calculate the surface area and volume of the cylinder.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        float r = sc.nextFloat();

        System.out.println("Enter the height of the cylinder: ");
        float h = sc.nextFloat();

        CylinderDetails cy = new CylinderDetails();

        cy.setRadius(r);
        System.out.println(cy.getRadius());
        cy.setHeight(h);
        System.out.println(cy.getHeight());

        System.out.println("Surface Area of the cylinder: " + cy.surfaceArea());
        System.out.println("Volume of the cylinder: " + cy.volume());
    }
}
