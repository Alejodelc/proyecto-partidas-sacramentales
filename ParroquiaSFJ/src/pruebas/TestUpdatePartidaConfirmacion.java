package pruebas;

import dao.PartidaConfirmacionDAO;
import modelo.PartidaConfirmacion;

public class TestUpdatePartidaConfirmacion {

    public static void main(String[] args) {

        System.out.println("✏️ INICIANDO PRUEBA DE ACTUALIZACIÓN CONFIRMACIÓN");
        System.out.println();

        PartidaConfirmacion partida = new PartidaConfirmacion();

        // ⚠️ ESTE ID DEBE EXISTIR EN LA TABLA
        partida.setIdPartidaConfirmacion(1); // cambia por uno real si es necesario
        partida.setNombresApellidos("Ana María López Actualizada");
        partida.setPadrinos("Carlos Gómez y Laura Ruiz");
        partida.setMinistro("Pbro. Juan Hernández");

        PartidaConfirmacionDAO dao = new PartidaConfirmacionDAO();
        boolean resultado = dao.actualizar(partida);

        System.out.println();
        if (resultado) {
            System.out.println("✅ UPDATE realizado con éxito");
        } else {
            System.out.println("❌ No se pudo actualizar");
        }

        System.out.println("Fin de la prueba");
    }
}
