/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Camarero;
import Modelo.RepositorioProductos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class ControladorPedidos {

    private static RepositorioProductos productos = RepositorioProductos.getSingleton();

    private static ControladorPedidos controlador = new ControladorPedidos();

    private ControladorPedidos() {
    }

    /**
     * Metodo para inicializar ControladorPedidos con metodo Singleton.
     * @return ControladorPedidos
     */
    public static ControladorPedidos getSingleton() {
        return controlador;
    }

    /**
     * Metodo que devuelve información del producto.
     * @param categoria
     * @param id
     * @return Array[2]
     */
    public String[] getProducto(int categoria, int id) {
        return productos.getProducto(categoria, id);
    }

    /**
     * Metodo que devuelve un valor double formateado a dos decimales.
     * @param valorInicial
     * @return double
     */
    public static double redondearDecimales(double valorInicial) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, 2);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, 2)) + parteEntera;
        return resultado;
    }

    /**
     * Metodo que te genera un documento de texto con los datos de los pedidos.
     * @param tabla
     * @param total
     * @param camarero
     * @param mesa
     * @param metodoPago
     * @throws FileNotFoundException 
     */
    public void generarDemanda(DefaultTableModel tabla, double total, Camarero camarero, String mesa, int metodoPago) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("Ticket "+mesa+".txt"));
        pw.println("Restaurante");
        pw.println("Le atendió: " + camarero.getNombre() + " | ID: " + camarero.getID());
        pw.println("Pedido " + mesa);
        pw.println("Productos:");
        for (int i = 0; i < tabla.getRowCount(); i++) {
            pw.println((i+1) + ". " + tabla.getValueAt(i, 0) + "  Precio: " + tabla.getValueAt(i, 1));
        }
        pw.println("Total: "+total);
        if(metodoPago==0){
            pw.println("Metodo de pago: Tarjeta.");
        }
        if(metodoPago==1){
            pw.println("Metodo de pago: Metalico.");            
        }
        pw.println("\nMuchas gracias por su visita.");
        pw.close();
    }
}
