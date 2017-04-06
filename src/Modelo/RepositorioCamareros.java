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
public class RepositorioCamareros {

    private Camarero[] listaCamareros;

    private static final RepositorioCamareros singleton = new RepositorioCamareros();

    private RepositorioCamareros() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document documento = null;

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            documento = builder.parse(new File("src/camareros.xml"));
        } catch (Exception spe) {
            //
        }
        Element elementRaiz = documento.getDocumentElement();
        NodeList hijos = elementRaiz.getChildNodes();
        listaCamareros = new Camarero[hijos.getLength()];
        for (int i = 0; i < hijos.getLength(); i++) {
            Node nodo = hijos.item(i);
            listaCamareros[i] = new Camarero(nodo.getTextContent(), Integer.parseInt(nodo.getAttributes().getNamedItem("ID").getTextContent()));
        }

    }

    /**
     * Metodo singleton de la clase RepositorioCamareros
     * @return RepositorioCamareros
     */
    public static RepositorioCamareros getSingleton() {
        return singleton;
    }

    /**
     * Metodo que devuelve una instancia de la clase camarero de la lista de camareros.
     * @param index
     * @return Camarero
     */
    public Camarero getCamarero(int index) {
        Camarero camareroSolicitado = listaCamareros[index];
        return camareroSolicitado;
    }

}
