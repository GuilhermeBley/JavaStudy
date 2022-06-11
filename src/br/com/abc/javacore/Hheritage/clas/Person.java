package br.com.abc.javacore.Hheritage.clas;

public class Person {
    protected String name;
    protected String cpf;
    protected Adress adress;



    public Person (String name){
        System.out.println("Dentro do construtor pessoa");
        this.name = name;
    }

    static {
        System.out.println("Dentro do bloco static Pessoa");
    }

    {
        System.out.println("Bloco de inicialização Pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização Pessoa 2");
    }

    public Person (String name, String cpf){
        this(name);
        this.cpf = cpf;
    }

    public void print(){
        System.out.println("nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.print("Endereço, bairro: " + this.adress.getNeighbh());
        System.out.println(" e rua: : " + this.adress.getStreet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
