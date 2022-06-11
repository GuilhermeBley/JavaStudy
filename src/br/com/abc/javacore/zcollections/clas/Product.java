package br.com.abc.javacore.zcollections.clas;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String serialNumber;
    private String name;
    private Double price;
    private int amount;

    public Product(String name, double price, String serialNumber) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
    }

    public Product(String name, Double price , String serialNumber, int amount) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(serialNumber, product.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber=" + serialNumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantidade= " + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int compareTo(Product otherObject) {
        //negativo se thisObject < outherObjeto
        //zero se thisObject == outherObjeto
        //Positivo se thisObject > outherObject


        //Não compara tipos primitivos
        return this.serialNumber.compareTo(otherObject.getSerialNumber());
    }
}
