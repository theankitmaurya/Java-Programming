import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calendar_Class_And_TimeZone_In_Java {
    public static void main(String[] args) {
/*
        Calendar class methods -
        (1) get method is used to get year, date, minute and second

        a.get(Calendar.SECOND)
        a.get(Calendar.MINUTE)
        a.get(Calendar.DATE)
        a.get(Calendar.YEAR)

        (2) getTime() method returns a Date object

        (3) Other methods can be looked up from the Java docs!
*/

        /* Gregorian Calendar Class - This class is used to create an instance of Gregorian Calendar. We can change the year, month & date using set method. */

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(GregorianCalendar.YEAR));
        System.out.println(gc.get(GregorianCalendar.MONTH));
        System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println(gc.get(GregorianCalendar.HOUR_OF_DAY) + ":" + gc.get(GregorianCalendar.MINUTE) + ":" + gc.get(GregorianCalendar.SECOND));

        System.out.println(gc.isLeapYear(2025));

/*
        TimeZone - TimeZone class is used to create Time Zones in Java. Some of the important methods of TimeZone class are:
        getAvailableIDs() -> get all the available IDs supported
        getDefault() -> get the default timezone
        getID() -> get the ID of a timezone
*/

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
