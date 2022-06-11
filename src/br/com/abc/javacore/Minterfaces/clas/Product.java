package br.com.abc.javacore.Minterfaces.clas;

public class Product implements Transportable, Taxable {
    private String nome;
    private double weightKG;
    private double price;
    private double finalPrice;
    private double freightValue;


    @Override
    public void taxCalculate() {
        finalPrice = this.price + (this.price * TAX);
    }

    @Override
    public void freightCalculate() {
        this.freightValue = this.finalPrice - (this.finalPrice / (1+ weightKG * 0.1));

    }

    public Product(String nome, double weight, double price) {
        this.nome = nome;
        this.weightKG = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", weightKG=" + weightKG +
                ", price=" + price +
                ", preço final com imposto= " + finalPrice +
                ", freightValue=" + freightValue +
                '}';
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(double freightValue) {
        this.freightValue = freightValue;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double weightKG() {
        return weightKG;
    }

    public void weightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
