package br.com.abc.javacore.ZZMcompletableFuture.clas;

import java.util.stream.DoubleStream;

public class Estimate {
    private final String nameStore;
    private final double price;
    private final Discount.Code code;

    public Estimate(String nameStore, double price, Discount.Code code) {
        this.nameStore = nameStore;
        this.price = price;
        this.code = code;
    }

    public static Estimate parse (String s){

        String[] split = s.split(":");
        String nameLoja = split[0];
        double price = Double.parseDouble(split[1]);
        Discount.Code codeDiscount = Discount.Code.valueOf(split[2]);

        return new Estimate(nameLoja, price, codeDiscount);
    }

    public String getNameStore() {
        return nameStore;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getCode() {
        return code;
    }
}
