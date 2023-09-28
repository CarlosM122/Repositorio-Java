package com.proyecto;

public class SeguimientoPlantas {
    private String fechaRiesgo;
    private String abonado;
    private String trasplantes;
    private String otrosEventos;

    public void constructor(String fechaRiesgo, String abonado, String trasplantes, String otrosEventos) {
        this.fechaRiesgo = fechaRiesgo;
        this.abonado = abonado;
        this.trasplantes = trasplantes;
        this.otrosEventos = otrosEventos;
    }

    public String getAbonado() {
        return abonado;
    }

    public String getFechaRiesgo() {
        return fechaRiesgo;
    }

    public String getOtrosEventos() {
        return otrosEventos;
    }

    public String getTrasplantes() {
        return trasplantes;
    }

    public void setAbonado(String abonado) {
        this.abonado = abonado;
    }

    public void setFechaRiesgo(String fechaRiesgo) {
        this.fechaRiesgo = fechaRiesgo;
    }

    public void setOtrosEventos(String otrosEventos) {
        this.otrosEventos = otrosEventos;
    }

    public void setTrasplantes(String trasplantes) {
        this.trasplantes = trasplantes;
    }
}
