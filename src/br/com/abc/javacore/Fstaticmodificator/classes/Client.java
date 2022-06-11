package br.com.abc.javacore.Fstaticmodificator.classes;
//1- Bloco inicializador é executado quando a JVM carregar a classe (é execitado apenas uma vez)
//2- Alocado espaço na memoria para o objeto que sera criado.
//3- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos.
//4- Bloco de inicialização será executado.
//5- O contrutor é executado.

public class Client {
    private static int[] portion;

    //blocos static só são inicializados uma vez
    static {
        portion = new int [100];
        System.out.println("No bloco inicializador: ");
        for (int i = 1; i <= portion.length; i++) {
            portion[i-1] = i;
        }
    }

    public Client(){
        System.out.println("Dentro do construtor: ");
        for (int portion : this.portion){
            System.out.print(portion + " ");
        }

    }

    public static int[] getPortion() {
        return portion;
    }

}
