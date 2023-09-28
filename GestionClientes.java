package com.proyecto;

public class GestionClientes {
    private String nombre;
    private String preferencias;
    private String recordatorios;

    public void constructor(String nombre, String preferencias, String recordatorios) {
        this.nombre = nombre;
        this.preferencias = preferencias;
        this.recordatorios = recordatorios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public String getRecordatorios() {
        return recordatorios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public void setRecordatorios(String recordatorios) {
        this.recordatorios = recordatorios;
    }
}
