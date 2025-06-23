import java.util.Calendar;

public class Practice_Set_15_Q3 {
    public static void main(String[] args) {
//        Repeat Question 2 using the Calendar class

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) +  ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
    }
}
