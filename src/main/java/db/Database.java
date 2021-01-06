package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
    private final String URL = "jdbc:mysql://localhost:3306/db_5si";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection getConnection(){
        Connection con;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver ditemukan");
            
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Koneksi berhasil");
            
            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
        
        
        return null;
    }
    
    public static void main(String[] args) {
        Database database = new Database();
        database.getConnection();
    }
}
