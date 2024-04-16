package learn.standard.classes.java;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarApp {
    public static void main(String[] args) {

        Date tanggal = new Date();
        System.out.println(tanggal); //Tue Apr 16 16:35:53 WIB 2024

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 10); // add 10 year
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 11);

        Date result = calendar.getTime();
        System.out.println(result); //Sun Feb 16 11:38:21 WIB 2020

    }
}
