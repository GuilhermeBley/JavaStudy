package br.com.abc.javacore.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class DateManipulationTest {
    public static void main(String[] args) {
//        Date date = new Date(1_200_000_000_000L);
        Date date = new Date();
//        System.out.println(date);

        date.setTime(date.getTime() + 3_000_000_000L);
//        System.out.println(date);

        //CALENDAR
        Calendar c = Calendar.getInstance();
//usando o metodo Date no Calendar        c.setTime(date);
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR, 24);
        c.add(Calendar.YEAR, 3);

        Date date2 = c.getTime();
        System.out.println(date2);
    }
}
