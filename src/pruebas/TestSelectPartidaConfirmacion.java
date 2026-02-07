package pruebas;

import dao.PartidaConfirmacionDAO;

public class TestSelectPartidaConfirmacion {

    public static void main(String[] args) {

        System.out.println("🔍 INICIANDO CONSULTA DE PARTIDAS DE CONFIRMACIÓN");
        System.out.println();

        PartidaConfirmacionDAO dao = new PartidaConfirmacionDAO();
        dao.listar();

        System.out.println();
        System.out.println("✅ Fin de la consulta");
    }
}
