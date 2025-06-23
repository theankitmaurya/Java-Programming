import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice_Set_15_Q4 {
    public static void main(String[] args) {
//        Repeat Question 2 using java.time API
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = dtf.format(now);
        System.out.println(formattedDate);
    }
}
