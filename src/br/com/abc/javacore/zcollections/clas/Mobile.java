package br.com.abc.javacore.zcollections.clas;

import java.util.Comparator;

public class Mobile implements Comparator<Mobile> {
    private String name;
    private String IMEI;

    public Mobile(String name, String IMEI) {
        this.name = name;
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "\n-------------------\nMobile\n" +
                "name= " + name +
                "\nIMEI=" + IMEI;
    }

    //HASHCODE
    /**
     * Se x.equals(y) == true y.hashCode() == x.hachCode();
     * y.hashCode() == x.hachCode() não necessariamente o equals devera retornar true
     * SE x.equals(y) == false
     então y.hashCode != x.hashCode x.equals(y) devera ser false
     */
    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;
    }

    //EQUALS

    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o1.getName().compareTo(o2.name);
    }

    /**
     * Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
     * Simetrico para x e y diferente de null, se x.equals(y) == true logo y.equals(x) tem que ser true
     * Transitividade para x, y, z diferentes de null, se x.equals(Y) == true logo y.equals(x) == true e x.equals(z) == true logo y.equals(z) tambem é true
     * Consistencia x.equals(y) deve sempre retornar o mesmo valor
     * para x diferente de null x.equals(null) tem que retornar false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Mobile otherMobile = (Mobile) obj;
        return IMEI != null && IMEI.equals(otherMobile.getIMEI());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}

/**
 https://www.bigocheatsheet.com/
 https://www.javacodegeeks.com/2011/04/simple-big-o-notation-post.html
  */
