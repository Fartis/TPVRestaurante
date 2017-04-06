/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Manuel David Villalba Escamilla
 */
public class RepositorioProductos {

    private Producto[] listaBebidas;
    private Producto[] listaHamburguesas;
    private Producto[] listaBocadillos;
    private Producto[] listaPizzas;
    private Producto[] listaComplementos;
    private Producto[] listaPromociones;

    private static final RepositorioProductos singleton = new RepositorioProductos();

    private RepositorioProductos() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document documento = null;

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            documento = builder.parse(new File("src/productos.xml"));
        } catch (Exception spe) {
            //
        }
        Element elementRaiz = documento.getDocumentElement();
        NodeList hijos = elementRaiz.getChildNodes();
        NodeList bebidas = hijos.item(0).getChildNodes();
        listaBebidas = new Producto[bebidas.getLength()];
        for (int i = 0; i < bebidas.getLength(); i++) {
            Node nodo = bebidas.item(i);
            listaBebidas[i] = new Producto(nodo.getFirstChild().getTextContent(), i, Float.parseFloat(nodo.getLastChild().getTextContent()));
        }

        NodeList hamburguesas = hijos.item(1).getChildNodes();
        listaHamburguesas = new Producto[hamburguesas.getLength()];
        for (int i = 0; i < hamburguesas.getLength(); i++) {
            Node nodo = hamburguesas.item(i);
            listaHamburguesas[i] = new Producto(nodo.getFirstChild().getTextContent(), i, Float.parseFloat(nodo.getLastChild().getTextContent()));
        }

        NodeList bocadillos = hijos.item(2).getChildNodes();
        listaBocadillos = new Producto[bocadillos.getLength()];
        for (int i = 0; i < bocadillos.getLength(); i++) {
            Node nodo = bocadillos.item(i);
            listaBocadillos[i] = new Producto(nodo.getFirstChild().getTextContent(), i, Float.parseFloat(nodo.getLastChild().getTextContent()));
        }

        NodeList pizzas = hijos.item(3).getChildNodes();
        listaPizzas = new Producto[pizzas.getLength()];
        for (int i = 0; i < pizzas.getLength(); i++) {
            Node nodo = pizzas.item(i);
            listaPizzas[i] = new Producto(nodo.getFirstChild().getTextContent(), i, Float.parseFloat(nodo.getLastChild().getTextContent()));
        }

        NodeList complementos = hijos.item(4).getChildNodes();
        listaComplementos = new Producto[complementos.getLength()];
        for (int i = 0; i < complementos.getLength(); i++) {
            Node nodo = complementos.item(i);
            listaComplementos[i] = new Producto(nodo.getFirstChild().getTextContent(), i, Float.parseFloat(nodo.getLastChild().getTextContent()));
        }

        NodeList promociones = hijos.item(5).getChildNodes();
        listaPromociones = new Producto[promociones.getLength()];
        for (int i = 0; i < promociones.getLength(); i++) {
            Node nodo = promociones.item(i);
            listaPromociones[i] = new Producto(nodo.getFirstChild().getTextContent(), i, Float.parseFloat(nodo.getLastChild().getTextContent()));
        }

    }

    /**
     * Metodo singleton de la clase RepositorioProductos
     * @return RepositorioProductos
     */
    public static RepositorioProductos getSingleton() {
        return singleton;
    }

    /**
     * Metodo que te devuelve la información de un producto.
     * @param categoria
     * @param id
     * @return String[2]
     */
    public String[] getProducto(int categoria, int id){
        String[] producto = new String[2];
        switch(categoria){
            case 1:
                producto[0]=listaBebidas[id].getNombre();
                producto[1]=Float.toString(listaBebidas[id].getPrecio());
                break;
            case 2:
                producto[0]=listaHamburguesas[id].getNombre();
                producto[1]=Float.toString(listaHamburguesas[id].getPrecio());
                break;
            case 3:
                producto[0]=listaBocadillos[id].getNombre();
                producto[1]=Float.toString(listaBocadillos[id].getPrecio());
                break;
            case 4:
                producto[0]=listaPizzas[id].getNombre();
                producto[1]=Float.toString(listaPizzas[id].getPrecio());
                break;
            case 5:
                producto[0]=listaComplementos[id].getNombre();
                producto[1]=Float.toString(listaComplementos[id].getPrecio());
                break;
            case 6:
                producto[0]=listaPromociones[id].getNombre();
                producto[1]=Float.toString(listaPromociones[id].getPrecio());
                break;                
        }
        return producto;
    }
    

}
