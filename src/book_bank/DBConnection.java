package book_bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    Connection conn = null;

    public static Connection connect() throws SQLException{

        try{

            Class.forName("org.sqlite.JDBC");

            Connection conn = DriverManager.getConnection(
            "jdbc:sqlite:/home/tharanetharan/Downloads/Book_Bank/Book_Bank.db");

            System.out.println("Database Connected");
            return conn;

        }catch(Exception e){

            System.out.println(e);

            return null;
        }

    }
    public static void main(String[] args) throws SQLException {

    Connection conn = DBConnection.connect();

    if(conn != null){
        System.out.println("Connection Successful");
    }else{
        System.out.println("Connection Failed");
    }

}
}