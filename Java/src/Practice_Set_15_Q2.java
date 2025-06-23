import java.util.Date;

public class Practice_Set_15_Q2 {
    public static void main(String[] args) {
//        Use the Date class in Java to print time in the following format: 21:47:02

        Date d =  new Date();
        System.out.println(d.getHours() + ":" +  d.getMinutes() + ":" + d.getSeconds());
    }
}
