class Rectangle3 {
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

class Cuboid1 extends Rectangle3 {
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

public class Practice_Set_10_Q4 {
    public static void main(String[] args) {
        // Create methods for area and volume in 2. Also create getters and setters.

        Cuboid1 c = new Cuboid1();
        c.setLength(5);
        c.setBreadth(10);
        c.setHeight(15);

        System.out.println("Area of Rectangle4: " + c.getLength() * c.getBreadth());
        System.out.println("Volume of Cuboid: " + c.getLength() * c.getBreadth() * c.getHeight());
    }
}
