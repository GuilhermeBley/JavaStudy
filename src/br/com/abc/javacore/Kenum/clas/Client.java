package br.com.abc.javacore.Kenum.clas;

public class Client {

    public enum TypePayment{
        CASH, TERM
    }

    private String name;
    private TypeClient typeClient;
    private TypePayment typePayment;

    public Client(String name, TypeClient type, TypePayment typePayment) {
        this.name = name;
        this.typeClient = type;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                "\nNumero: " + typeClient.getType() +
                "\nTipo cliente: " + typeClient.getPerson() +
                "\nTipo de pagamento: " + this.typePayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getType() {
        return typeClient;
    }

    public void setType(TypeClient type) {
        this.typeClient = type;
    }
}
