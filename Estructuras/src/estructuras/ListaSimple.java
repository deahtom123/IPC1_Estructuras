/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author Dénilson Argueta
 */
public class ListaSimple {

    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void insertar(String palabra) {
        Nodo nuevo = new Nodo();
        nuevo.info = palabra;
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo auxiliar = cabeza;
            while (auxiliar.siguiente != null) {
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente = nuevo;
        }
    }
    public void eliminar(String palabra){
        if(cabeza.info.equals(palabra)){
            cabeza=cabeza.siguiente;
        }else{
            Nodo auxiliar = cabeza;
            while (!auxiliar.siguiente.info.equals(palabra)) {
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente=auxiliar.siguiente.siguiente;
        }
    }

    public void imprimir() {
        for (Nodo actual = cabeza; actual != null; actual = actual.siguiente) {
            System.out.println(actual.info);
        }
    }
}
