package pruebas;

import dao.PartidaBautismoDAO;
import modelo.PartidaBautismo;
import java.sql.Date;

public class TestInsertPartidaBautismo {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║  PRUEBA DE INSERCIÓN DE PARTIDA DE BAUTISMO   ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        System.out.println();
        
        // Crear objeto PartidaBautismo
        PartidaBautismo partida = new PartidaBautismo();
        
        // Llenar datos
        partida.setLibro("Libro 1");
        partida.setFolio("Folio 25");
        partida.setNumero("001");
        partida.setNombresApellidos("Juan Pérez Gómez");
        partida.setLugarNacimiento("Pasto - Nariño");
        partida.setFechaNacimiento(Date.valueOf("2000-03-15"));
        partida.setFechaBautismo(Date.valueOf("2023-05-14"));
        partida.setPadre("Carlos Pérez");
        partida.setMadre("María Gómez");
        partida.setAbuelosPaternos("José Pérez y Ana Ruiz");
        partida.setAbuelosMaternos("Luis Gómez y Marta Torres");
        partida.setPadrinos("Luis Ramírez y Ana Torres");
        partida.setMinistro("Pbro. Andrés Martínez");
        partida.setIdParroquia(1);
        
        // Mostrar datos que se insertarán
        System.out.println("📋 Datos a insertar:");
        System.out.println("   Nombre: " + partida.getNombresApellidos());
        System.out.println("   Fecha Bautismo: " + partida.getFechaBautismo());
        System.out.println("   Padre: " + partida.getPadre());
        System.out.println("   Madre: " + partida.getMadre());
        System.out.println("   Padrinos: " + partida.getPadrinos());
        System.out.println("   Ministro: " + partida.getMinistro());
        System.out.println();
        
        // Intentar insertar
        System.out.println("🔄 Intentando insertar en la base de datos...");
        PartidaBautismoDAO dao = new PartidaBautismoDAO();
        boolean resultado = dao.insertar(partida);
        
        System.out.println();
        System.out.println("════════════════════════════════════════════════");
        
        if (resultado) {
            System.out.println("✅ ÉXITO: Partida insertada correctamente");
        } else {
            System.out.println("❌ ERROR: No se pudo insertar la partida");
        }
        
        System.out.println("════════════════════════════════════════════════");
        System.out.println();
        System.out.println("Fin de la prueba");
    }
}