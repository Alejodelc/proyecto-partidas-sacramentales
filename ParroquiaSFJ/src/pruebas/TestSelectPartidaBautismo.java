package pruebas;

import dao.PartidaBautismoDAO;

public class TestSelectPartidaBautismo {

    public static void main(String[] args) {

        System.out.println("🔍 INICIANDO CONSULTA DE PARTIDAS DE BAUTISMO");
        System.out.println();

        PartidaBautismoDAO dao = new PartidaBautismoDAO();
        dao.listar();

        System.out.println();
        System.out.println("✅ Fin de la consulta");
    }
}
