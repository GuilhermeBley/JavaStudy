package br.com.abc.javacore.Vresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
//        System.out.println(Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("message", new Locale ("pt", "br"));

        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));

        System.out.println("\n\nINGLES------------------------\n");

        rb = ResourceBundle.getBundle("message", new Locale ("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));

        System.out.println("\n\nPalavras Universais------------------------\n");

        System.out.println(rb.getString("show") + "     " + rb.getString("video"));

//        Locale locale = new Locale ("fr", "CA");
//        ResourceBundle.getBundle("messsage", locale);

//        Hierarquia de inicialização
//        message_fr_CA.properties
//        message_fr.properties
//        message_PT_BR.properties Busca a linguagem da maquina
//        message_PT.properties
//        message.properties
//        Exception
    }
}
