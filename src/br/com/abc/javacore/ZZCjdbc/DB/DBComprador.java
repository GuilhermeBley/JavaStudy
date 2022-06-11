package br.com.abc.javacore.ZZCjdbc.DB;

import br.com.abc.javacore.ZZCjdbc.clas.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBComprador {
    public static void save(Comprador comprador){
        String add = "INSERT INTO `agencia`.`Comprador` (`cpf`, `nome`) " +
                "VALUES ('" +
                comprador.getCpf() + "', '" +
                comprador.getName()+"');";
        Connection conn = ConnectionFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(add));
            System.out.println("Registro inserido com sucesso!");
            ConnectionFactory.close(conn, stmt);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delet (Comprador comprador){
        if(comprador == null || comprador.getId() == null){
            System.out.println("ID inválido ou inexistente");
            return;
        }
        String add = "DELETE FROM `agencia`.`Comprador` WHERE (`idComprador` = '"+comprador.getId()+"');";
        Connection conn = ConnectionFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(add));
            System.out.println("Registro deletado com sucesso!");
            ConnectionFactory.close(conn, stmt);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update (Comprador comprador){
        if(comprador == null || comprador.getId() == null){
            System.out.println("ID inválido ou inexistente");
            return;
        }
        String add = "UPDATE `agencia`.`Comprador` SET `idComprador` = '6', `cpf` = '"+comprador.getCpf()+"', `nome` = '"+comprador.getName()+"' WHERE (`idComprador` = '"+ comprador.getId()+"');";
        Connection conn = ConnectionFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(add));
            System.out.println("Registro alterado com sucesso!");
            ConnectionFactory.close(conn, stmt);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static List<Comprador> selectAll(){
        String sql = "SELECT * FROM Agencia.Comprador;";
        Connection conn = ConnectionFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //Caminhando sobre valores
            List<Comprador> compradorList = new ArrayList<>();
            while (rs.next()){
                compradorList.add(new Comprador(rs.getInt("idComprador"),rs.getString("cpf"),rs.getString("nome")));
            }

            ConnectionFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String name){
        String sql = "SELECT * FROM Agencia.Comprador WHERE nome LIKE '%"+name+"%';";
        Connection conn = ConnectionFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //Caminhando sobre valores
            List<Comprador> compradorList = new ArrayList<>();
            while (rs.next()){
                compradorList.add(new Comprador(rs.getInt("idComprador"),rs.getString("cpf"),rs.getString("nome")));
            }

            ConnectionFactory.close(conn, stmt, rs);
            return compradorList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void selectMetaData(){
        String sql = "SELECT * FROM Agencia.Comprador";
        Connection conn = ConnectionFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //METADADOS
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();

            System.out.println("Quantidade de colunas é de: " + rsmd.getColumnCount());
            for (int i = 1; i <= rsmd.getColumnCount(); i++){
                System.out.println("Table: " + rsmd.getTableName(i));
                System.out.println("Nome da coluna: " + rsmd.getColumnName(i));
                System.out.println("Size of column: " + rsmd.getColumnDisplaySize(i));
            }

            ConnectionFactory.close(conn, stmt, rs);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void dboMetaData() {
        Connection conn = ConnectionFactory.getConexao();
        try {
            DatabaseMetaData dbmd = conn.getMetaData();

            if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Suporta TYPE_FORWARD_ONLY");

                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE));
                    System.out.println("Suporta TYPE_FORWARD_ONLY e CONCUR_UPDATABLE");
            }

            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");

                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE));
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE e CONCUR_UPDATABLE");
            }


            if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");

                if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE));
                System.out.println("Suporta CONCUR_UPDATABLE");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ConnectionFactory.close(conn);
    }
}
