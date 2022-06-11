package br.com.abc.javacore.Einitializationblock.classes;
//1- Alocado espaço na memoria para o objeto que sera criado.
//2- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos.
//3- Bloco de inicialização será executado.
//4- O contrutor é executado.

public class Client {
    private int[] portion;

    {
        portion = new int [100];
        System.out.println("No bloco inicializador: ");
        for (int i = 1; i <= portion.length; i++) {
            portion[i-1] = i;
        }
    }

    public Client(){
        System.out.println("Dentro do construtor: ");
        for (int portion : this.portion){
            System.out.println(portion + " ");
        }

    }

    public int[] getPortion() {
        return portion;
    }

    public void setPortion(int[] portion) {
        this.portion = portion;
    }
}
