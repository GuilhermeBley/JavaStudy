package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.DB.DBComprador;
import br.com.abc.javacore.ZZCjdbc.clas.Comprador;

import java.util.List;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
//        Connection conn = ConnectionFactory.getConexao();//Estabelece conexão
//        ConnectionFactory.close(conn); //Encerra conexão

//        insert("123.345.123-13", "Tabata C.");
//        delet();
//        update();
//        System.out.println("ByName: ");
//        List<Comprador> compradorList = selectByName("Tabata");
//        System.out.println(compradorList);
//
//        System.out.println("ALL: ");
//        compradorList = selectAll();
//        System.out.println(compradorList);

//        DBComprador.selectMetaData();
        DBComprador.dboMetaData();
    }

    public static void insert (String cpf, String name){
        Comprador comprador = new Comprador(cpf, name);
        DBComprador dbComprador = new DBComprador();
        dbComprador.save(comprador);
    }

    public static void delet (){
        Comprador comprador = new Comprador("127.213.435-12", "Gilbertinho Carroceiro");
        comprador.setId(2);
        DBComprador.delet(comprador);
    }

    public static void update (){
        Comprador comprador = new Comprador(1,"127.213.435-12", "Gilbertinho B2T");
        DBComprador.update(comprador);
    }

    public static List<Comprador> selectAll(){
        return DBComprador.selectAll();
    }

    public static List<Comprador> selectByName(String name){
        return DBComprador.searchByName(name);
    }
}
