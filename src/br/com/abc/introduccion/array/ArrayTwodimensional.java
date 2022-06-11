package br.com.abc.introduccion.array;

public class ArrayTwodimensional {
    public static void main(String[] args) {
        int [] [] monthDay = new int [2] [2];
        monthDay [0] [0] = 30;
        monthDay [0] [1] = 20;
        monthDay [1] [0] = 10;
        monthDay [1] [1] = 5;

        for (int a = 0; a < monthDay.length; a++ ){
            for (int b = 0; b < monthDay.length; b++){
//                System.out.print(monthDay[a] [b] + " ");
            }
//        System.out.printf(" \n");
        }

        for (int [] ref : monthDay){
            for (int day : ref){
                System.out.println(day);
            }
        }

    }
}
