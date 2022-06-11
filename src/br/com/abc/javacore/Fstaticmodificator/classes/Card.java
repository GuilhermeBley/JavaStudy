package br.com.abc.javacore.Fstaticmodificator.classes;

public class Card {
    // Speed max = 240km\h.
    private String name;
    private double speedMax;
    private static double speedLimit = 240;

    public Card() {
    }

    public Card(String name, double speedMax) {
        this.name = name;
        this.speedMax = speedMax;
    }

    public void print(){
        System.out.println("-------------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade maxima: " + this.speedMax);
        System.out.println("Velocidade limite: " + speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(double speedMax) {
        this.speedMax = speedMax;
    }

    static public void setSpeedLimit(double speedLimit) {
        Card.speedLimit = speedLimit;
    }

    static public double getSpeedLimit() {
        return speedLimit;
    }
}
