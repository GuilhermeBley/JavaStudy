package br.com.abc.javacore.ZZGbehaviorbyparameter.clas;

public class Card {
    private String name = "Gol";
    private String color;
    private int year;

    public Card(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
