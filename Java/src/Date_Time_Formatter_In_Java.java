import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter_In_Java {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy | E | HH:mm:ss a");
        String myDate =  ld.format(dtf1);
        System.out.println(myDate);

    }
}
