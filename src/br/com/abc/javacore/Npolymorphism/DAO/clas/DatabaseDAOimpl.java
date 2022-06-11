package br.com.abc.javacore.Npolymorphism.DAO.clas;

import br.com.abc.javacore.Npolymorphism.DAO.clas.GenericDAO;

public class DatabaseDAOimpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
