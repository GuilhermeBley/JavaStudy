package br.com.abc.introduccion.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //Atribuição = , -= , += , *= , /= , %=

        int salary = 1800;

        //salary = salary + 1000;
        //salary += 1000;

        //salary -= 1000;

        salary *= 1;

        salary = salary + (int) (salary*0.1);

        salary %= 1;

        System.out.println(salary);
    }
}
