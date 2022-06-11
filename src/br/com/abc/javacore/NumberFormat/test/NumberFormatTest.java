package br.com.abc.javacore.NumberFormat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float value = 0123123.4567F;
        Locale localJap = new Locale("jp");

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] =NumberFormat.getNumberInstance();
        nfa[1] =NumberFormat.getNumberInstance(localJap);
        nfa[2] =NumberFormat.getCurrencyInstance();
        nfa[3] =NumberFormat.getCurrencyInstance(localJap);

        for (NumberFormat nf : nfa)
            System.out.println(nf.format(value));

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("\n\n" + nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.getMaximumFractionDigits());
        System.out.println(nf.format(value) + "\n\n");


        String valueString = "0123123,4567";
        try{
            System.out.println(nf.parse(valueString));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse((valueString)));
        }catch (ParseException e){
           e.printStackTrace();
        }
    }
}
