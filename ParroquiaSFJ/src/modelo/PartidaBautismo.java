package modelo;

import java.sql.Date;

public class PartidaBautismo {
    private int idPartida;
    private String libro;
    private String folio;
    private String numero;
    private String nombresApellidos;
    private String lugarNacimiento;
    private Date fechaNacimiento;
    private Date fechaBautismo;
    private String padre;
    private String madre;
    private String abuelosPaternos;
    private String abuelosMaternos;
    private String padrinos;
    private String ministro;
    private int idParroquia;

    public PartidaBautismo() {
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
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

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaBautismo() {
        return fechaBautismo;
    }

    public void setFechaBautismo(Date fechaBautismo) {
        this.fechaBautismo = fechaBautismo;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public String getAbuelosPaternos() {
        return abuelosPaternos;
    }

    public void setAbuelosPaternos(String abuelosPaternos) {
        this.abuelosPaternos = abuelosPaternos;
    }

    public String getAbuelosMaternos() {
        return abuelosMaternos;
    }

    public void setAbuelosMaternos(String abuelosMaternos) {
        this.abuelosMaternos = abuelosMaternos;
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