package br.com.abc.javacore.Jfinalmodifier.clas;

//A classe nao pode mais ser extendida.
public final class Card {
    public static final double FINALSPEED_FINAL = 240;
    private final Buyer buyer = new Buyer();
    private String name;
    private String brand;

//    static {
//        FINALSPEED_FINAL = 240;
//    }


    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public final void print(String name){
        System.out.println("Imprimindo um carro");
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public static double getFinalspeedFinal() {
        return FINALSPEED_FINAL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
