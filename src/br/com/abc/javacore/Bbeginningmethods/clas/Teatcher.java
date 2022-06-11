package br.com.abc.javacore.Bbeginningmethods.clas;

public class Teatcher {
    public String name;
    public String registration;
    public String rg;
    public String cpf;

    //Comando THIS ja referencia os objects.
    public void printValues (){
        System.out.println("Nome: "+this.name+"\nMatricula: "+ this.registration +"\nRG: "+ this.rg+ "\nCPF: "+ this.cpf);
    }
}
