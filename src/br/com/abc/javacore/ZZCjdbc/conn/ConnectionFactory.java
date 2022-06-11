package br.com.abc.javacore.ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.*;


public class ConnectionFactory {
    public static Connection getConexao(){
        String url =  "jdbc:mysql://localhost:3306/Agencia";
        String login = "root";
        String password = "****";

        try {
            return DriverManager.getConnection(url, login, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn){
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close (Connection conn, Statement stmt){
        close(conn);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close (Connection conn, Statement stmt, ResultSet rs){
        close(conn, stmt);
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

