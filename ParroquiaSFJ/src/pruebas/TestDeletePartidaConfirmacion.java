package pruebas;

import dao.PartidaConfirmacionDAO;

public class TestDeletePartidaConfirmacion {

    public static void main(String[] args) {

        System.out.println("🗑️ INICIANDO PRUEBA DE ELIMINACIÓN DE CONFIRMACIÓN");
        System.out.println();

        int idAEliminar = 1; // ← CAMBIA ESTE ID POR UNO REAL DE TU TABLA

        PartidaConfirmacionDAO dao = new PartidaConfirmacionDAO();
        boolean resultado = dao.eliminar(idAEliminar);

        System.out.println();
        if (resultado) {
            System.out.println("✅ Eliminación exitosa");
        } else {
            System.out.println("❌ No se pudo eliminar");
        }

        System.out.println();
        System.out.println("Fin de la prueba");
    }
}
