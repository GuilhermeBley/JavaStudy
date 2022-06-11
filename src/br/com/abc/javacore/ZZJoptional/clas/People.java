package br.com.abc.javacore.ZZJoptional.clas;

import java.util.Optional;

public class People {
    private Card card;
    private String name;
    private Integer age;

    public People(Card card, String name) {
        this.card = card;
        this.name = name;
    }

    public People(Card card, String name, Integer age) {
        this.card = card;
        this.name = name;
        this.age = age;
    }

    public People(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<Card> getCard() {
        return Optional.ofNullable(card);
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
