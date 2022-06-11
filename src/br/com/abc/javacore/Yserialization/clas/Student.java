package br.com.abc.javacore.Yserialization.clas;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private long id;
    private String name;
    private transient String password;
    private static String nomeEscola = "BleySchool :D";
    private TeamSchool teamSchool;

    public Student(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Nome da escola='" + nomeEscola + '\'' +
                ", Time de escola='" + teamSchool + '\'' +
                '}';
    }

    private void writeObject (ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(teamSchool.getName());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            teamSchool = new TeamSchool(ois.readUTF());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public TeamSchool getTeamSchool() {
        return teamSchool;
    }

    public void setTeamSchool(TeamSchool teamSchool) {
        this.teamSchool = teamSchool;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public static void setNomeEscola(String nomeEscola) {
        Student.nomeEscola = nomeEscola;
    }
}
