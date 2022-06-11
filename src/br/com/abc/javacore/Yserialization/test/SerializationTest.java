package br.com.abc.javacore.Yserialization.test;

import br.com.abc.javacore.Yserialization.clas.Student;
import br.com.abc.javacore.Yserialization.clas.TeamSchool;

import java.io.*;

public class SerializationTest{
    public static void main(String[] args) {
        RecorderObject();
        ReadingObject();
    }

    private static void RecorderObject(){
        TeamSchool t = new TeamSchool("Maratona java, somente para os campeões");
        Student student = new Student(1L, "Gui Bley", "12345678");
        student.setTeamSchool(t);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))){
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ReadingObject(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
