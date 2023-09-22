package com.viewnext.Kamikazes.models;

/**
 * Clase Escuderia
 */
public class Escuderia {
    // Campos de la clase
    private String nombre;
    private int totalPuntos;
    private int totalCampeonatos;

    /**
     * Constructores
     */
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

    /**
     * Getters & Setters
     * @return
     */
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

    /**
     * Metodo para imprimir por pantalla
     */
    @Override
    public String toString() {
        return "Escuderia [nombre=" + nombre + ", totalPuntos=" + totalPuntos + ", totalCampeonatos=" + totalCampeonatos
                + "]";
    }

    
}
