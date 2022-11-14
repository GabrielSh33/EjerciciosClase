package BaseDeDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conexion {
        private static String usuario = "Gabriel";
        private static String contrasena = "1234";
        private static String db = "Libros";
        private static String puerto = "1433";

        public Connection conectar() {
            Connection con = null;
            try {
                String cadena = "jdbc:sqlserver://DESKTOP-TIG3QJS:" + puerto + ";" + "databaseName=" + db;
                con = DriverManager.getConnection(cadena, usuario, contrasena);
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
            } catch (Exception e) {
                System.out.printf("Conexion no exitosa: " + e.toString());
            }
            return con;
        }
    public PreparedStatement insertarLirbos() {
        Conexion conexion=new Conexion();
        Connection cn=null;
        PreparedStatement pstm=null;
        try {
            cn=conexion.conectar();
            String ID = JOptionPane.showInputDialog("Inserte el Id:");
            String NOMBRE = JOptionPane.showInputDialog("Inserte el nombre del libro:");
            String EDITORIAL = JOptionPane.showInputDialog("Inserte la editorial del libro:");
            String PRECIO = JOptionPane.showInputDialog("Inserte el precio del libro:");


            String query = "INSERT INTO Libros VALUES (?,?,?,?)" ;
            pstm = cn.prepareStatement(query);
            pstm.setString(1, ID);
            pstm.setString(2, NOMBRE);
            pstm.setString(3, EDITORIAL);
            pstm.setString(4, PRECIO);
            pstm.executeUpdate();
        }catch(Exception e) {
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();

        }return pstm;

    }

}
