import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
    public static java.sql.Connection getConexaoMySQL(){
        Connection connection = null;

        String serverName = "localhost";
        String mydatabase = "ACADEMIA";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        
        String username = "root";
        String password = "161003";

        try {
            connection = DriverManager.getConnection(url,username,password);
            if(connection != null){
                System.out.println("Conexão bem sucedida.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
        }

        return connection;         
    }
/*
    public static void main(String[] args) {
        getConexaoMySQL();
    }
*/
}