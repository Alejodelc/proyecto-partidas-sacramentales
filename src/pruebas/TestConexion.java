package pruebas;

import conexion.Conexion;
import java.sql.Connection;

public class TestConexion {

    public static void main(String[] args) {

        System.out.println("Iniciando prueba de conexión...");

        Connection con = Conexion.getConexion();

        if (con != null) {
            System.out.println("Prueba OK: conexión establecida");
        } else {
            System.out.println("Prueba FALLÓ");
        }

        System.out.println("Fin de la prueba");
    }
}
