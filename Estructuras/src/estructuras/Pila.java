/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author Denilson Argueta
 */
public class Pila {

    public Nodo cima;

    public Pila() {
        cima = null;
    }

    public void insertar(String informacion) {
        Nodo nuevo = new Nodo();
        nuevo.info = informacion;
        if (cima == null) {
            cima = nuevo;
        } else {
            nuevo.siguiente = cima;
            cima = nuevo;
        }
    }

    public String extraer() {
        if (cima != null) {
            String informacion = cima.info;
            cima = cima.siguiente;
            return informacion;
        } else {
            return "";
        }
    }

    public void imprimir() {
        Nodo reco = cima;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco != null) {
            System.out.println(reco.info);
            reco = reco.siguiente;
        }
        System.out.print("");
    }
}
