package pruebas;

import dao.PartidaMatrimonioDAO;
import modelo.PartidaMatrimonio;
import java.sql.Date;

public class TestInsertPartidaMatrimonio {

    public static void main(String[] args) {

        System.out.println("════════════════════════════════════════════════");
        System.out.println("💍 PRUEBA DE INSERCIÓN PARTIDA DE MATRIMONIO");
        System.out.println("════════════════════════════════════════════════");
        System.out.println();

        // Crear objeto PartidaMatrimonio
        PartidaMatrimonio partida = new PartidaMatrimonio();

        // =========================
        // DATOS DE PRUEBA
        // =========================
        partida.setLibro("LM1");
        partida.setFolio("F12");
        partida.setNumero("001");
        partida.setFechaMatrimonio(Date.valueOf("2024-09-10"));
        partida.setLugarMatrimonio("Parroquia San Francisco Javier");

        partida.setNombreEsposo("Juan Carlos Pérez");
        partida.setPadreEsposo("Carlos Pérez");
        partida.setMadreEsposo("Ana Rodríguez");
        partida.setParroquiaBautismoEsposo("San Juan Bautista");
        partida.setLibroBautismoEsposo("LB1");
        partida.setFolioBautismoEsposo("F10");
        partida.setNumeroBautismoEsposo("100");

        partida.setNombreEsposa("María Fernanda Gómez");
        partida.setPadreEsposa("Luis Gómez");
        partida.setMadreEsposa("Claudia Martínez");
        partida.setParroquiaBautismoEsposa("Santa María");
        partida.setLibroBautismoEsposa("LB2");
        partida.setFolioBautismoEsposa("F20");
        partida.setNumeroBautismoEsposa("200");

        partida.setTestigo1("Luis Ramírez");
        partida.setTestigo2("Ana Torres");

        partida.setMinistro("Pbro. Andrés Martínez");
        partida.setAnotaciones("Matrimonio celebrado sin novedad");
        partida.setIdParroquia(1);

        // =========================
        // MOSTRAR DATOS
        // =========================
        System.out.println("📋 Datos a insertar:");
        System.out.println("Esposo: " + partida.getNombreEsposo());
        System.out.println("Esposa: " + partida.getNombreEsposa());
        System.out.println("Fecha Matrimonio: " + partida.getFechaMatrimonio());
        System.out.println("Testigos: " + partida.getTestigo1() + " y " + partida.getTestigo2());
        System.out.println("Ministro: " + partida.getMinistro());
        System.out.println();

        // =========================
        // INSERTAR EN BD
        // =========================
        System.out.println("🔄 Insertando en la base de datos...");
        PartidaMatrimonioDAO dao = new PartidaMatrimonioDAO();
        boolean resultado = dao.insertar(partida);

        System.out.println();
        if (resultado) {
            System.out.println("✅ ÉXITO: Partida de matrimonio insertada");
        } else {
            System.out.println("❌ ERROR: No se pudo insertar la partida");
        }

        System.out.println();
        System.out.println("Fin de la prueba");
    }
}
