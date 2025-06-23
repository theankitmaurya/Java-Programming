import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_Time_API_Classes_And_Methods {
    public static void main(String[] args) {

/*
        Java Time Package -
        (1) Available from Java 8 onwards
        (2) Capable of storing even nanoseconds

        Following are some of the most commonly used classes from java.time package
        LocalDate -> Represents a date
        LocalTime -> Represents a time
        LocalDateTime -> Represents Date + Time
        DateTimeFormatter -> Formatter for displaying & parsing date-time objects
*/

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
