package br.com.abc.javacore.ZZCjdbc.clas;

import java.util.Objects;

public class Comprador {
    private Integer id;
    private String cpf;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comprador comprador = (Comprador) o;
        return Objects.equals(id, comprador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID= " + getId()
                + "    Nome= " + getName()
                + "    Cpf= " + getCpf();
    }

    public Comprador() {

    }

    public Comprador(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public Comprador(Integer id, String cpf, String name) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
