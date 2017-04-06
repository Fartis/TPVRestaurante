package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Modelo.Camarero;
import Modelo.RepositorioCamareros;
import Modelo.RepositorioCamareros;
/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class ControladorCamareros {
    
    private static RepositorioCamareros camareros = RepositorioCamareros.getSingleton();
    private static ControladorCamareros controlador = new ControladorCamareros();
    
    private ControladorCamareros(){
    }
    
    /**
     * Metodo singleton de la clase ControladorCamareros
     * @return ControladorCamareros
     */
    public static ControladorCamareros getSingleton(){  
        return controlador;
    }
    
    /**
     * Metodo que devuelve el nombre del camarero del repositorio de camareros.
     * @param index
     * @return String
     */
    public String nombreCamarero(int index){
        String nombre = camareros.getCamarero(index).getNombre();
        return nombre;
    }
    
    /**
     * Metodo que devuelve una instancia de camarero del repositorio de camareros.
     * @param index
     * @return Camarero
     */
    public Camarero getCamarero(int index){
        return camareros.getCamarero(index);
    }
}
