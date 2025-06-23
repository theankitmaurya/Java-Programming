import com.codewithankit.Shape.Sphere1;

class Sphere {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float surfaceArea() {
        return (float) (4 * Math.PI * radius * radius);
    }

    public float volume() {
        return (float) ((4.0F / 3.0F) * Math.PI * radius * radius * radius);
    }
}

public class Practice_Set_9_Q5 {

    public static void main(String[] args) {
//        Repeat Question 1 for a sphere

        Sphere1 sphere = new Sphere1();
        sphere.setRadius(2);
        System.out.println("Surface Area: " + sphere.surfaceArea());
        System.out.println("Volume: " + sphere.volume());
    }
}
