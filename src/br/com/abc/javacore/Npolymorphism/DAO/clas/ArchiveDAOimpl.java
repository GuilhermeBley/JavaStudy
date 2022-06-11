package br.com.abc.javacore.Npolymorphism.DAO.clas;

import br.com.abc.javacore.Npolymorphism.DAO.clas.GenericDAO;

public class ArchiveDAOimpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados nos aquivos");
    }
}
