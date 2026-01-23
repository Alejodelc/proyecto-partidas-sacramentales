package pruebas;

import dao.PartidaMatrimonioDAO;

public class TestSelectPartidaMatrimonio {

    public static void main(String[] args) {

        System.out.println("🔍 INICIANDO CONSULTA DE PARTIDAS DE MATRIMONIO");
        System.out.println();

        PartidaMatrimonioDAO dao = new PartidaMatrimonioDAO();
        dao.listar();

        System.out.println();
        System.out.println("✅ Fin de la consulta");
    }
}
