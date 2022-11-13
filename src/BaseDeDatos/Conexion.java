package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
        private static String usuario = "sa";
        private static String contrasena = "1234";
        private static String db = "Escuela";
        private static String puerto = "1433";

        String Id;
        String Nombre;
        String Apellido;
        String Direccion;
        String Fecha_Nacimiento;
        String Nivel_Academico;
        String IdAlumnos;
        String IdAsignatura;
        String IdProfesor;
        String Fecha;

        public Connection conectar() {
            Connection con = null;
            try {
                String cadena = "jdbc:sqlserver://DESKTOP-TIG3QJS:"+puerto+";"+"databaseName="+db;
                con = DriverManager.getConnection(cadena, usuario, contrasena);
                //JOptionPane.showMessageDialog(null, "Conexion exitosa");

            } catch (Exception e){
                System.out.printf("Error: "+e.toString());
            }
            return con;
        }

}
