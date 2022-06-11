package br.com.abc.javacore.Isuperscript.clas;

public class Person{
    private String name;
    private int age;

    @Override
    public String toString(){
        return "Pessoa {" +
                "Nome=" + name + "\'" +
        ",\nIdade: " + age + "}";
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
