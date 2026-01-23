package pruebas;

import dao.PartidaMatrimonioDAO;

public class TestDeletePartidaMatrimonio {

    public static void main(String[] args) {

        System.out.println("🗑️ INICIANDO PRUEBA DE ELIMINACIÓN DE MATRIMONIO");
        System.out.println();

        int idPartida = 1; // ⚠️ Debe existir en la BD

        System.out.println("ID de la partida a eliminar: " + idPartida);
        System.out.println();

        PartidaMatrimonioDAO dao = new PartidaMatrimonioDAO();
        boolean resultado = dao.eliminar(idPartida);

        System.out.println();
        if (resultado) {
            System.out.println("✅ ÉXITO: Partida eliminada correctamente");
        } else {
            System.out.println("❌ ERROR: No se pudo eliminar la partida");
        }

        System.out.println();
        System.out.println("Fin de la prueba");
    }
}
