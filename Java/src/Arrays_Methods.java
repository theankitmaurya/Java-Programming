
public class Arrays_Methods {

    public static void main(String[] args) {

        int[] marks = new int[5];

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

/*
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.length);
*/
        System.out.println("In normal order: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("In reverse order: ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        System.out.println("for-each loop syntax: ");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
