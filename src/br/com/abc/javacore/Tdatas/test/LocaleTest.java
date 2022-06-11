package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 PT = portugues BR = Brasil EN= inglês

    //SUICA
        Locale locSuica = new Locale("it", "CH");

        Calendar c = Calendar.getInstance();
        c.set(2015,Calendar.DECEMBER, 23);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        System.out.println("Suiça   " + df.format(c.getTime()));

    // ITALIA
        Locale locItaly = new Locale("it");

        DateFormat df2= DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        System.out.println("Italia  " + df2.format(c.getTime()));

    //INDIA
        Locale locIndia = new Locale("hi", "IN");
        DateFormat df3= DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        System.out.println("India   " + df3.format(c.getTime()));

    //Japao
        Locale locJapao = new Locale("ja");
        DateFormat df4= DateFormat.getDateInstance(DateFormat.FULL, locJapao);
        System.out.println("Japão   " + df4.format(c.getTime()));

    //Modificando a linguagem printada
        System.out.println(locItaly.getDisplayLanguage());
        System.out.println(locJapao.getDisplayLanguage(locItaly));


    }
}
