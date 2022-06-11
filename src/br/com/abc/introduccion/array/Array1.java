package br.com.abc.introduccion.array;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class Array1 {
    public static void main(String[] args) {
    /**    int [] ages = new int [3];
        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 770;

        System.out.println("Idade 1: " + ages[0] + "\nIdade 2: " + ages[1] + "\nIdade 3: " + ages[2] );
    **/

    //quando cria-se um array os espaços vem vazios,
    //byte, short, double, long, float, int = 0,
    //char == '\u0000' (Espaço vazio)
    //boolean = 'false'
    //reference = null

    boolean[] test = new boolean [1];

        //System.out.println(test[0]);

    String[] names = new String [3];

    names[0] = "Sakura" ;
    names[1] = "Sasuke" ;
    names[2] = "Naruto" ;

    //names =  new String [4];

    for (int i = 0; i < names.length;i++ ){
        System.out.println(i+1 + "º Nome: " + names[i]);
    }

    }
}
