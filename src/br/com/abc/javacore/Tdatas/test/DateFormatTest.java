package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {
    //6 formas de formatar a data
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dtf = new DateFormat[6];

        dtf[0] = DateFormat.getInstance();
        dtf[1] = DateFormat.getDateInstance();
        dtf[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dtf[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dtf[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dtf[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dtf){
            System.out.println(df.format(c.getTime()));
        }

    }
}
