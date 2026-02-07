package dao;

import conexion.Conexion;
import modelo.PartidaConfirmacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartidaConfirmacionDAO {

    // =========================
    // INSERTAR PARTIDA DE CONFIRMACIÓN
    // =========================
    public boolean insertar(PartidaConfirmacion partida) {

        String sql = "INSERT INTO partida_confirmacion "
                + "(libro, folio, numero, nombres_apellidos, fecha_confirmacion, "
                + "padrinos, ministro, id_parroquia) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, partida.getLibro());
            ps.setString(2, partida.getFolio());
            ps.setString(3, partida.getNumero());
            ps.setString(4, partida.getNombresApellidos());
            ps.setDate(5, partida.getFechaConfirmacion());
            ps.setString(6, partida.getPadrinos());
            ps.setString(7, partida.getMinistro());
            ps.setInt(8, partida.getIdParroquia());

            ps.executeUpdate();
            System.out.println("✅ Partida de confirmación insertada correctamente");
            return true;

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar partida de confirmación: " + e.getMessage());
            return false;
        }
    }

    // =========================
    // LISTAR PARTIDAS DE CONFIRMACIÓN (SELECT)
    // =========================
    public void listar() {

        String sql = "SELECT * FROM partida_confirmacion";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("📄 LISTADO DE PARTIDAS DE CONFIRMACIÓN");
            System.out.println("------------------------------------");

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id_partida")
                    + " | Nombre: " + rs.getString("nombres_apellidos")
                    + " | Fecha Confirmación: " + rs.getDate("fecha_confirmacion")
                    + " | Padrinos: " + rs.getString("padrinos")
                    + " | Ministro: " + rs.getString("ministro")
                );
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al listar confirmaciones: " + e.getMessage());
        }
    }
// =========================
// ACTUALIZAR PARTIDA DE CONFIRMACIÓN (UPDATE)
// =========================
public boolean actualizar(PartidaConfirmacion partida) {

    String sql = "UPDATE partida_confirmacion SET "
            + "nombres_apellidos = ?, padrinos = ?, ministro = ? "
            + "WHERE id_partida = ?";

    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, partida.getNombresApellidos());
        ps.setString(2, partida.getPadrinos());
        ps.setString(3, partida.getMinistro());
        ps.setInt(4, partida.getIdPartidaConfirmacion());

        int filas = ps.executeUpdate();

        if (filas > 0) {
            System.out.println("✅ Partida de confirmación actualizada correctamente");
            return true;
        } else {
            System.out.println("⚠️ No se encontró la partida con ese ID");
            return false;
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al actualizar confirmación: " + e.getMessage());
        return false;
    }
}
// =========================
// ELIMINAR PARTIDA DE CONFIRMACIÓN (DELETE)
// =========================
public boolean eliminar(int idPartidaConfirmacion) {

    String sql = "DELETE FROM partida_confirmacion WHERE id_partida = ?";

    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, idPartidaConfirmacion);

        int filas = ps.executeUpdate();

        if (filas > 0) {
            System.out.println("🗑️ Partida de confirmación eliminada correctamente");
            return true;
        } else {
            System.out.println("⚠️ No se encontró la partida con ese ID");
            return false;
        }

    } catch (SQLException e) {
        System.out.println("❌ Error al eliminar partida de confirmación: " + e.getMessage());
        return false;
    }
}
}
