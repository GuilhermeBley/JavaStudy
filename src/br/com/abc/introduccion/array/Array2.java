package br.com.abc.introduccion.array;

public class Array2 {
    public static void main(String[] args) {
        //Inicializar Arrays (3 maneiras)
        int [] number = new int [2];
        int [] numbers = new int []{1,3,5,6,7,23,34};
        int [] numberss = {1,23,342,42,2};

//        for (int x = 0; x < numberss.length; x++)
//            System.out.print(numberss[x] + ", ");

        for (int aux : numbers){
//            System.out.println(aux);
        }

    }
}
