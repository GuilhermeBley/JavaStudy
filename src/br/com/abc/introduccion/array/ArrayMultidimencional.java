package br.com.abc.introduccion.array;

public class ArrayMultidimencional {
    public static void main(String[] args) {
        //Arrays dentro de arrays.
//        int array [][] = new int [3] [];
//        array[0] = new int [2];
//        array[1] = new int []{1,2,3};
//        array[2] = new int [4];

        int [] [] array = {{0,0},{1,2,3},{0,0,0,0}};



        for (int [] arr : array){
            for (int num : arr){
                System.out.println(num);
            }
        }
    }
}
