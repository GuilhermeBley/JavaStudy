package br.com.abc.javacore.Bbeginningmethods.clas;

public class Ex1Student {
    private String name;
    private int age;
    private double [] grades;
    private boolean approved;

    public void averageGrades(){
        if (this.grades == null){
            System.out.println("Aluno não possui notas.");
            return;
        }

        double sum = 0;
        String result = null;

        for (double aux : this.grades)
            sum += aux;

        sum = sum / this.grades.length;

        if (sum > 6) {
            this.approved = true;
            result = "Aprovado";
        }else{
            this.approved = false;
            result = "Reprovado";
        }


        int aux = 1;
        for (double num : this.grades){
            System.out.println("nota "+aux + ": "+ num);
            aux ++;
        }

        System.out.println("\nMédia de: " + sum + "\nResultado: " + result);

    }

    public void printInformation(){
        System.out.println("nome: " + this.name + "\nIdade: "+ this.age);
        averageGrades();
    }


    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
        if (age <= 0)
            System.out.println("Você não pode fazer isso.");
    }
    public void setGrades(double[] grades){
        this.grades = grades;
    }


    //GETTERS
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double [] getGrades(){
        return this.grades;
    }
    public boolean isApproved(){
        return this.approved;
    }

}
