
import java.util.Scanner;

class CylinderDetail {

    private float radius;
    private float height;

    public float getRadius() {
        return radius;
    }

    public CylinderDetail(float radius, float height) {
        this.radius = radius;
        this.height = height;
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

public class Practice_Set_9_Q3 {

    public static void main(String[] args) {
//        Use a constructor and repeat Question 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder: ");
        float r = sc.nextFloat();

        System.out.println("Enter the height of the cylinder: ");
        float h = sc.nextFloat();

        CylinderDetail cy = new CylinderDetail(r, h);

        cy.setRadius(r);
        System.out.println(cy.getRadius());
        cy.setHeight(h);
        System.out.println(cy.getHeight());

        System.out.println("Surface Area of the cylinder: " + cy.surfaceArea());
        System.out.println("Volume of the cylinder: " + cy.volume());
    }
}
