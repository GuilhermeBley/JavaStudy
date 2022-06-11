package br.com.abc.javacore.Yserialization.clas;

import java.io.Serializable;

public class TeamSchool{ //implements Serializable {
    private String name;

    public TeamSchool(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeamSchool{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
