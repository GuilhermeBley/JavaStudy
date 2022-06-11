package br.com.abc.javacore.Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-2000);
    }

    private static void calculaSalario (double salary){

        assert (salary >= 0);

        //Modelo muito longo, melhor a utilização do Asserts, que é próprio para métodos privados
        /**
        if (salary > 0){
            //Pegando o valor
            System.out.println("Valor pego");
        } else{
            System.out.println("Se chegou aq, lascou-se");
        }
         **/
    }
}
