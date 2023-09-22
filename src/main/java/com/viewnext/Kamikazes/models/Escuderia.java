package com.viewnext.Kamikazes.models;

public class Escuderia {
    private String nombre;
    private int totalPuntos;
    private int totalCampeonatos;

    public Escuderia() {
    }
    public Escuderia(String nombre) {
        this.nombre = nombre;
    }
    public Escuderia(String nombre, int totalPuntos, int totalCampeonatos) {
        this.nombre = nombre;
        this.totalPuntos = totalPuntos;
        this.totalCampeonatos = totalCampeonatos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTotalPuntos() {
        return totalPuntos;
    }
    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }
    public int getTotalCampeonatos() {
        return totalCampeonatos;
    }
    public void setTotalCampeonatos(int totalCampeonatos) {
        this.totalCampeonatos = totalCampeonatos;
    }
    @Override
    public String toString() {
        return "Escuderia [nombre=" + nombre + ", totalPuntos=" + totalPuntos + ", totalCampeonatos=" + totalCampeonatos
                + "]";
    }

    
}
