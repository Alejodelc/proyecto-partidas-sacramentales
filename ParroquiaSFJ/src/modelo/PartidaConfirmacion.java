package modelo;

import java.sql.Date;

public class PartidaConfirmacion {

    private int idPartidaConfirmacion;
    private String libro;
    private String folio;
    private String numero;
    private String nombresApellidos;
    private Date fechaConfirmacion;
    private String padrinos;
    private String ministro;
    private int idParroquia;

    // =========================
    // CONSTRUCTOR VACÍO
    // =========================
    public PartidaConfirmacion() {
    }

    // =========================
    // GETTERS Y SETTERS
    // =========================
    public int getIdPartidaConfirmacion() {
    return idPartidaConfirmacion;
}

public void setIdPartidaConfirmacion(int idPartidaConfirmacion) {
    this.idPartidaConfirmacion = idPartidaConfirmacion;
}
    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public Date getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    public void setFechaConfirmacion(Date fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }

    public String getPadrinos() {
        return padrinos;
    }

    public void setPadrinos(String padrinos) {
        this.padrinos = padrinos;
    }

    public String getMinistro() {
        return ministro;
    }

    public void setMinistro(String ministro) {
        this.ministro = ministro;
    }

    public int getIdParroquia() {
        return idParroquia;
    }

    public void setIdParroquia(int idParroquia) {
        this.idParroquia = idParroquia;
    }
}

