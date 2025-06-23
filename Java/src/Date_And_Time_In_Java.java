public class Date_And_Time_In_Java {
    public static void main(String[] args) {
/*
        Date And Time in Java -
        java.time -> Package for Date and Time in Java
        Before Java, java.util package used to hold the date and time classes. Now these classes are deprecated.
*/

/*
        How Java stores a Date - Date in Java is stored in the form of a long number. This long number holds the number of milliseconds passed since 1 Jan 1970
        Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever we ask it for years passed.

        System.currentTimeMillis(); returns no of milli-seconds passed. Once the number of milliseconds is calculated, we can calculate seconds, minutes, hours and years passed.
*/

        System.out.println("No. of milliseconds passed since 1970: " + System.currentTimeMillis());
        System.out.println("No. of seconds passed since 1970: " + System.currentTimeMillis()/1000);
        System.out.println("No. of minutes passed since 1970: " + System.currentTimeMillis()/1000/3600);
        System.out.println("No. of hours passed since 1970: " + System.currentTimeMillis()/1000/3600/24);
        System.out.println("No. of years passed since 1970: " + System.currentTimeMillis()/1000/3600/24/365);
    }
}
