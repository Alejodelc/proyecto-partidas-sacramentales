package dao;

import conexion.Conexion;
import modelo.PartidaBautismo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PartidaBautismoDAO {

    // =========================
    // INSERTAR PARTIDA
    // =========================
    public boolean insertar(PartidaBautismo partida) {

        String sql = "INSERT INTO partida_bautismo "
                + "(libro, folio, numero, nombres_apellidos, lugar_nacimiento, "
                + "fecha_nacimiento, fecha_bautismo, padre, madre, "
                + "abuelos_paternos, abuelos_maternos, padrinos, ministro, id_parroquia) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, partida.getLibro());
            ps.setString(2, partida.getFolio());
            ps.setString(3, partida.getNumero());
            ps.setString(4, partida.getNombresApellidos());
            ps.setString(5, partida.getLugarNacimiento());
            ps.setDate(6, partida.getFechaNacimiento());
            ps.setDate(7, partida.getFechaBautismo());
            ps.setString(8, partida.getPadre());
            ps.setString(9, partida.getMadre());
            ps.setString(10, partida.getAbuelosPaternos());
            ps.setString(11, partida.getAbuelosMaternos());
            ps.setString(12, partida.getPadrinos());
            ps.setString(13, partida.getMinistro());
            ps.setInt(14, partida.getIdParroquia());

            ps.executeUpdate();
            System.out.println("✅ Partida insertada correctamente");
            return true;

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar partida: " + e.getMessage());
            return false;
        }
    }

    // =========================
    // ACTUALIZAR PARTIDA
    // =========================
    public boolean actualizar(PartidaBautismo partida) {

        String sql = "UPDATE partida_bautismo SET "
                + "nombres_apellidos = ?, padre = ?, madre = ? "
                + "WHERE id_partida = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, partida.getNombresApellidos());
            ps.setString(2, partida.getPadre());
            ps.setString(3, partida.getMadre());
            ps.setInt(4, partida.getIdPartida());

            ps.executeUpdate();
            System.out.println("✅ Partida actualizada correctamente");
            return true;

        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar partida: " + e.getMessage());
            return false;
        }
    }

    // =========================
    // LISTAR PARTIDAS (SELECT)
    // =========================
    public void listar() {

        String sql = "SELECT * FROM partida_bautismo";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("📄 LISTADO DE PARTIDAS DE BAUTISMO");
            System.out.println("--------------------------------");

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id_partida")
                        + " | Nombre: " + rs.getString("nombres_apellidos")
                        + " | Fecha Bautismo: " + rs.getDate("fecha_bautismo")
                        + " | Padre: " + rs.getString("padre")
                        + " | Madre: " + rs.getString("madre")
                );
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al consultar partidas: " + e.getMessage());
        }
    }

    // =========================
    // ELIMINAR PARTIDA (DELETE)
    // =========================
    public boolean eliminar(int idPartida) {

        String sql = "DELETE FROM partida_bautismo WHERE id_partida = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idPartida);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("🗑️ Partida eliminada correctamente");
                return true;
            } else {
                System.out.println("⚠️ No se encontró la partida con ese ID");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar partida: " + e.getMessage());
            return false;
        }
    }
}
