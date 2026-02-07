package dao;

import conexion.Conexion;
import modelo.PartidaMatrimonio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartidaMatrimonioDAO {

    // =========================
    // INSERTAR PARTIDA MATRIMONIO
    // =========================
    public boolean insertar(PartidaMatrimonio partida) {

        String sql = "INSERT INTO partida_matrimonio ("
                + "libro, folio, numero, fecha_matrimonio, lugar_matrimonio, "
                + "nombre_esposo, padre_esposo, madre_esposo, parroquia_bautismo_esposo, "
                + "libro_bautismo_esposo, folio_bautismo_esposo, numero_bautismo_esposo, "
                + "nombre_esposa, padre_esposa, madre_esposa, parroquia_bautismo_esposa, "
                + "libro_bautismo_esposa, folio_bautismo_esposa, numero_bautismo_esposa, "
                + "testigo_1, testigo_2, ministro, anotaciones, id_parroquia"
                + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, partida.getLibro());
            ps.setString(2, partida.getFolio());
            ps.setString(3, partida.getNumero());
            ps.setDate(4, partida.getFechaMatrimonio());
            ps.setString(5, partida.getLugarMatrimonio());

            ps.setString(6, partida.getNombreEsposo());
            ps.setString(7, partida.getPadreEsposo());
            ps.setString(8, partida.getMadreEsposo());
            ps.setString(9, partida.getParroquiaBautismoEsposo());
            ps.setString(10, partida.getLibroBautismoEsposo());
            ps.setString(11, partida.getFolioBautismoEsposo());
            ps.setString(12, partida.getNumeroBautismoEsposo());

            ps.setString(13, partida.getNombreEsposa());
            ps.setString(14, partida.getPadreEsposa());
            ps.setString(15, partida.getMadreEsposa());
            ps.setString(16, partida.getParroquiaBautismoEsposa());
            ps.setString(17, partida.getLibroBautismoEsposa());
            ps.setString(18, partida.getFolioBautismoEsposa());
            ps.setString(19, partida.getNumeroBautismoEsposa());

            ps.setString(20, partida.getTestigo1());
            ps.setString(21, partida.getTestigo2());
            ps.setString(22, partida.getMinistro());
            ps.setString(23, partida.getAnotaciones());
            ps.setInt(24, partida.getIdParroquia());

            ps.executeUpdate();
            System.out.println("✅ Partida de matrimonio insertada correctamente");
            return true;

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar partida de matrimonio: " + e.getMessage());
            return false;
        }
    }
// =========================
// LISTAR PARTIDAS DE MATRIMONIO
// =========================
public void listar() {

    String sql = "SELECT * FROM partida_matrimonio";

    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        System.out.println("📄 LISTADO DE PARTIDAS DE MATRIMONIO");
        System.out.println("--------------------------------------------------");

        while (rs.next()) {
            System.out.println(
                "ID: " + rs.getInt("id_partida")
                + " | Esposo: " + rs.getString("nombre_esposo")
                + " | Esposa: " + rs.getString("nombre_esposa")
                + " | Fecha: " + rs.getDate("fecha_matrimonio")
                + " | Ministro: " + rs.getString("ministro")
            );
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al listar matrimonios: " + e.getMessage());
    }
}
// =========================
// ACTUALIZAR PARTIDA MATRIMONIO
// =========================
public boolean actualizar(PartidaMatrimonio partida) {

    String sql = "UPDATE partida_matrimonio SET "
            + "lugar_matrimonio = ?, "
            + "testigo_1 = ?, "
            + "testigo_2 = ?, "
            + "ministro = ?, "
            + "anotaciones = ? "
            + "WHERE id_partida = ?";

    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, partida.getLugarMatrimonio());
        ps.setString(2, partida.getTestigo1());
        ps.setString(3, partida.getTestigo2());
        ps.setString(4, partida.getMinistro());
        ps.setString(5, partida.getAnotaciones());
        ps.setInt(6, partida.getIdPartida());

        ps.executeUpdate();
        System.out.println("✅ Partida de matrimonio actualizada correctamente");
        return true;

    } catch (SQLException e) {
        System.out.println("❌ Error al actualizar partida de matrimonio: " + e.getMessage());
        return false;
    }
}
// =========================
// ELIMINAR PARTIDA MATRIMONIO
// =========================
public boolean eliminar(int idPartida) {

    String sql = "DELETE FROM partida_matrimonio WHERE id_partida = ?";

    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, idPartida);
        ps.executeUpdate();

        System.out.println("✅ Partida de matrimonio eliminada correctamente");
        return true;

    } catch (SQLException e) {
        System.out.println("❌ Error al eliminar partida de matrimonio: " + e.getMessage());
        return false;
    }
}
}
