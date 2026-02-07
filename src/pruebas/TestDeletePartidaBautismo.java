package pruebas;

import dao.PartidaBautismoDAO;

public class TestDeletePartidaBautismo {

    public static void main(String[] args) {

        System.out.println("🗑️ INICIANDO PRUEBA DE ELIMINACIÓN");

        int idAEliminar = 4; // cambia el ID según lo que tengas en la tabla

        PartidaBautismoDAO dao = new PartidaBautismoDAO();
        boolean resultado = dao.eliminar(idAEliminar);

        if (resultado) {
            System.out.println("✅ Eliminación exitosa");
        } else {
            System.out.println("❌ No se pudo eliminar");
        }

        System.out.println("Fin de la prueba");
    }
}
