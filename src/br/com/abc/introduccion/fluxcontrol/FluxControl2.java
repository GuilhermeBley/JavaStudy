package br.com.abc.introduccion.fluxcontrol;

public class FluxControl2 {
    public static void main(String[] args) {
        int age = 15;
        String status;

        /**
        if (age<18){
            status = "JOVEM";
        }else{
            status = "adulto";
        }
         //simula a mesma coisa que a linha 15
        */

        status = age < 18 ? "Jovem":"Adulto";


        System.out.printf(status);
    }
    //?
}
