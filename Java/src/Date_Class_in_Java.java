import java.util.Date;

public class Date_Class_in_Java {
    public static void main(String[] args) {
/*
        Date d = new Date();
        System.out.println(d);
*/

/*
        We can also use constructors provided by the Date class
        Java Date class few methods which can be used.
        For Ex: getDate(), getDay() etc.

        All these methods are deprecated
*/

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getHours());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
    }
}
