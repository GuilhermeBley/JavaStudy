package br.com.abc.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        //Criando o calendario
        Calendar c = Calendar.getInstance();
        String masc = "'Piedade' dd 'de' MMMM 'de' yyyy";
        //Implementado a mascara no SimpleDateFormat
        SimpleDateFormat formatter = new SimpleDateFormat(masc);
        System.out.println(formatter.format(c.getTime()));


    }
}
