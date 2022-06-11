package br.com.abc.introduccion.repetitivestructures;

/**
 *
 * BREAK apos ele ser usado ele sai do laço.

public class br.com.abc.introduccion.RepetitiveStructuresBreakContinue {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        //Porem as parcelas nao podem ser menores do que R$1000.00

        double valueIncash = 30000;

        for (int portion = 1; portion <= valueIncash; portion++){
            double valuePortion = valueIncash / portion;

            if (valuePortion < 1000)
                break;

            System.out.println("Parcela " + portion + "   R$ " + valuePortion);


        }
    }
}
*/

//CONTINUE Apos ele ser usado ele volta para o começo do Laço sem inicializar nenhum comando abaixo dele

public class RepetitiveStructuresBreakContinue {

    public static void main(String[] args){

        double valueIncash = 30000;

        for (int portion = (int) valueIncash; portion > 0; portion++){
            double valuePortion = valueIncash / portion;

            if (valuePortion >= 1000)
                continue;

        System.out.println("Parcela " + portion + "   R$ " + valuePortion);
        }

    }
}

