package com.viewnext.Kamikazes.models;

/**
 * Clase Pilotos 
 */
public class Piloto {

    // Campos de la clase
    private int id;
    private int puntos;
    private int campeonatos;
    private String nombre;
    private String escuderia;

    /**
     * Creacion de Constructores de la Clase Piloto
     */
    public Piloto() {
    }
    public Piloto(int puntos, int campeonatos, String nombre, String escuderia) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.campeonatos = campeonatos;

        this.escuderia = escuderia;
    }
    public Piloto(int id, int puntos, int campeonatos, String nombre, String escuderia) {
        this.id = id;
        this.puntos = puntos;
        this.campeonatos = campeonatos;
        this.nombre = nombre;
        this.escuderia = escuderia;
    }

    /**
     * Getters y Setters
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    /**
     * Comprobamos que sea unico
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Piloto other = (Piloto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    /**
     * Metodo para mostrar por pantalla
     */
    @Override
    public String toString() {
        return "Piloto [puntos=" + puntos + ", campeonatos=" + campeonatos + ", nombre=" + nombre + ", escuderia="
                + escuderia + "]";
    }

}
