package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class Camarero {

    private String nombre;
    private int numeroServicios, ID;

    /**
     * Metodo constructor de la clase Camarero
     * @param nombre
     * @param ID 
     */
    public Camarero(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    /**
     * Metodo que añade un servicio al camarero.
     */
    public void servicioFinalizado() {
        numeroServicios++;
    }

    /**
     * Metodo consultor de la variable nombre.
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo consultor de la variable numeroServicios.
     * @return int
     */
    public int getNumeroServicios() {
        return numeroServicios;
    }

    /**
     * Metodo consultor de la variable id.
     * @return int
     */
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Camarero{" + "nombre=" + nombre + ", ID=" + ID + '}';
    }

}
