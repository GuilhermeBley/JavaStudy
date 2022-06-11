package br.com.abc.introduccion.fluxcontrol;

public class FluxControlSwitch {
    public static void main(String[] args) {
        byte day = 1;
        char gender = 'f';

        System.out.printf("Dia: ");

        switch (day){
            case 1: case 7:
                System.out.printf("Final de semana");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.printf("Final de semana");
                break;
            default:
                System.out.printf("Opção inválida");
        }

        System.out.printf("\nSexo: ");


        switch (gender){
            case 'f':
                System.out.printf("Female");
                break;
            case 'm':
                System.out.printf("Male");
                break;
            default:
                System.out.printf("Option Ivalidate");
        }
    }
}
