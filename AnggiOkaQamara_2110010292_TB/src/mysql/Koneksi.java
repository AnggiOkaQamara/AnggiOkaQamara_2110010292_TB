package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private final String URL = "jdbc:mysql://localhost:3306/db_pendaftaran";
    private final String User = "root";
    private final String Pass = "";

    public Connection getConnection (){
        Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection (URL, User, Pass);
            System.out.println("Koneksi Berhasil");
            return con;
        } catch (ClassNotFoundException | SQLException ex){
            System.out.println("Koneksi Gagal");
            return con=null;
        }
    }


    public static void main (String [] args){
    Koneksi koneksi = new Koneksi ();
    koneksi.getConnection();
  }
}