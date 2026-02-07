package pruebas;

import dao.PartidaBautismoDAO;
import modelo.PartidaBautismo;

public class TestUpdatePartidaBautismo {

    public static void main(String[] args) {

        System.out.println("🔄 PRUEBA DE ACTUALIZACIÓN DE PARTIDA");

        PartidaBautismo partida = new PartidaBautismo();
        partida.setIdPartida(1); // ID EXISTENTE EN LA BD
        partida.setNombresApellidos("Juan Pérez ACTUALIZADO");
        partida.setPadre("Carlos Pérez ACTUALIZADO");
        partida.setMadre("María Gómez ACTUALIZADA");

        PartidaBautismoDAO dao = new PartidaBautismoDAO();
        dao.actualizar(partida);

        System.out.println("Fin de la prueba");
    }
}
