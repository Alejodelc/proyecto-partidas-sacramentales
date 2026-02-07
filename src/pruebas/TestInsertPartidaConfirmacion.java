package pruebas;

import dao.PartidaConfirmacionDAO;
import modelo.PartidaConfirmacion;
import java.sql.Date;

public class TestInsertPartidaConfirmacion {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║  PRUEBA DE INSERCIÓN PARTIDA CONFIRMACIÓN   ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        // Crear objeto PartidaConfirmacion
        PartidaConfirmacion partida = new PartidaConfirmacion();

        // Llenar datos
        partida.setLibro("LC1");
        partida.setFolio("Folio 10");
        partida.setNumero("C-001");
        partida.setNombresApellidos("Pedro Gómez Martínez");
        partida.setFechaConfirmacion(Date.valueOf("2024-06-20"));
        partida.setPadrinos("Juan Pérez y María López");
        partida.setMinistro("Pbro. Carlos Rodríguez");
        partida.setIdParroquia(1);

        // Mostrar datos
        System.out.println("📋 Datos a insertar:");
        System.out.println("Nombre: " + partida.getNombresApellidos());
        System.out.println("Fecha Confirmación: " + partida.getFechaConfirmacion());
        System.out.println("Padrinos: " + partida.getPadrinos());
        System.out.println("Ministro: " + partida.getMinistro());
        System.out.println();

        // Insertar
        System.out.println("🔄 Insertando en la base de datos...");
        PartidaConfirmacionDAO dao = new PartidaConfirmacionDAO();
        boolean resultado = dao.insertar(partida);

        System.out.println();
        if (resultado) {
            System.out.println("✅ ÉXITO: Partida de confirmación insertada");
        } else {
            System.out.println("❌ ERROR: No se pudo insertar la partida");
        }

        System.out.println();
        System.out.println("Fin de la prueba");
    }
}

