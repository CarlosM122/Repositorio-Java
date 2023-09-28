package com.proyecto;

public class RegistroPlantas {
    private String nombreComun;
    private String nombreCientifico;
    private String tipo;
    private String requerimientos;

    public void constructor(String nombreComun, String nombreCientifico, String tipo, String requerimientos) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipo = tipo;
        this.requerimientos = requerimientos;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
}
