package Kasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hype AMD
 */
public class dbconnect {
    private static Connection dbconnect;

    public static Connection getDbConnect() {
        if (dbconnect == null) {
            try {
                String url = "jdbc:mysql://localhost/kasir";
                String user = "root";
                String password = "";
                dbconnect = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung");
            } catch (SQLException e) {
                System.out.println("Gagal Terhubung");
                e.printStackTrace(); // Print the stack trace for debugging
            }
        }
        return dbconnect;
    }

    public static void main(String[] args) {
        getDbConnect();
    }

    static Connection getdbconnect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
