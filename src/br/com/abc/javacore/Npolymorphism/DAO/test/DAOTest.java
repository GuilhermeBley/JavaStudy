package br.com.abc.javacore.Npolymorphism.DAO.test;

import br.com.abc.javacore.Npolymorphism.DAO.clas.ArchiveDAOimpl;
import br.com.abc.javacore.Npolymorphism.DAO.clas.DatabaseDAOimpl;
import br.com.abc.javacore.Npolymorphism.DAO.clas.GenericDAO;

import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO archiveDAO = new DatabaseDAOimpl(); //Consegue acessar archiveDAO e DataBaseDAO
        archiveDAO.save();

        //List esta em uma interface, um exemplo de utilização de interfaces
        List<String> list = new LinkedList<>();
        list.add("Nome1");
        list.add("Nome2");
        list.add("Nome3");
        list.add("Nome4");
        list.add("Nome5");

        for (String nome:list) {
            System.out.println("Nome: " + nome);
        }
    }
}
