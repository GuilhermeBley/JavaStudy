package br.com.abc.javacore.Doverloadconstructor.clas;

public class Student {
    private String registration;
    private String name;
    private double [] grades;
    private  String dateRegistration;

    public Student (String registration, String name, double[] grades){
        this.registration = registration;
        this.name = name;
        this.grades = grades;
        this.dateRegistration = dateRegistration;
    }
    public Student (String registration, String name, double[] grades, String dateRegistration){
        this(registration, name, grades);
        this.dateRegistration = dateRegistration;
    }

    public Student(){

    }


    public void print (){
        System.out.println(this.name);
        System.out.println(this.registration);
        for (double grade : grades){
            System.out.println(grade + "   ");
        }
        System.out.println(this.dateRegistration);
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public String getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }
}
