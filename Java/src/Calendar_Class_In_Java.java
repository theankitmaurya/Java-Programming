import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Calendar_Class_In_Java {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        System.out.println(cal1.getCalendarType());
        System.out.println(cal1.getTimeZone());
        System.out.println(cal1.getTimeZone().getID());

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cal2.getCalendarType());
        System.out.println(cal2.getTimeZone());
        System.out.println(cal2.getTimeZone().getID());

    }
}
