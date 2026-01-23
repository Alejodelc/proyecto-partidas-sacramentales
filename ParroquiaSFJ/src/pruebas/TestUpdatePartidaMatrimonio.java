package pruebas;

import dao.PartidaMatrimonioDAO;
import modelo.PartidaMatrimonio;

public class TestUpdatePartidaMatrimonio {

    public static void main(String[] args) {

        System.out.println("✏️ INICIANDO PRUEBA DE ACTUALIZACIÓN DE MATRIMONIO");
        System.out.println();

        PartidaMatrimonio partida = new PartidaMatrimonio();

        // ID EXISTENTE EN LA BD
        partida.setIdPartida(1);

        // Nuevos datos
        partida.setLugarMatrimonio("Parroquia San Francisco Javier");
        partida.setTestigo1("Carlos Ramírez");
        partida.setTestigo2("Ana Torres");
        partida.setMinistro("Pbro. Andrés Martínez");
        partida.setAnotaciones("Datos actualizados por prueba de sistema");

        System.out.println("📋 Datos a actualizar:");
        System.out.println("Lugar: " + partida.getLugarMatrimonio());
        System.out.println("Testigo 1: " + partida.getTestigo1());
        System.out.println("Testigo 2: " + partida.getTestigo2());
        System.out.println("Ministro: " + partida.getMinistro());
        System.out.println();

        PartidaMatrimonioDAO dao = new PartidaMatrimonioDAO();
        boolean resultado = dao.actualizar(partida);

        System.out.println();
        if (resultado) {
            System.out.println("✅ ÉXITO: Partida actualizada correctamente");
        } else {
            System.out.println("❌ ERROR: No se pudo actualizar la partida");
        }

        System.out.println();
        System.out.println("Fin de la prueba");
    }
}
