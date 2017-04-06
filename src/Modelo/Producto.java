/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class Producto {
    
    private int ID;
    private float precio;
    private String nombre;
    
    /**
     * Metodo constructor de la clase Producto
     * @param nombre
     * @param ID
     * @param precio 
     */
    public Producto(String nombre, int ID, float precio){
        this.nombre = nombre;
        this.ID = ID;
        this.precio = precio;
    }

    /**
     * Metodo consultor del parametro nombre.
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo consultor del parametro id.
     * @return int
     */
    public int getID() {
        return ID;
    }

    /**
     * Metodo consultor del parametro precio.
     * @return float
     */
    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", precio=" + precio + ", nombre=" + nombre + '}';
    }
    
}
