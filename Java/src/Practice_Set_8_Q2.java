class cellPhone {
    public String ringing(String n) {
        return n;
    }

    public String vibrating(String n) {
        return n;
    }
}

public class Practice_Set_8_Q2 {
    public static void main(String[] args) {
        // Create a class cellphone with methods to print "ringing...", "vibrating..."
        // etc.

        cellPhone cp = new cellPhone();

        System.out.println(cp.ringing("Ringing..."));
        System.out.println(cp.vibrating("Vibrating..."));
    }
}
