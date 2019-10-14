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
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila usuario = new Pila();
        usuario.insertar("Andrea");
        usuario.insertar("Juan");
        usuario.insertar("Jose");
        usuario.insertar("Maria");
        usuario.extraer();
        usuario.extraer();
        usuario.extraer();
        usuario.extraer();
        usuario.extraer();
        usuario.imprimir();
    }
    
}
