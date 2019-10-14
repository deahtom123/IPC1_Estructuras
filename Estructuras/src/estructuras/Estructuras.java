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
        //El ultimo que entra es el primero que sale
        System.out.println("-------Ejemplo Pila----------");
        Pila usuario = new Pila();
        usuario.insertar("Andrea");
        usuario.insertar("Juan");
        usuario.insertar("Jose");
        usuario.insertar("Maria");
        System.out.println("////////Antes de extraer//////");
        usuario.imprimir();
        usuario.extraer();
        System.out.println("////Despues de extraer///////");
        usuario.imprimir();
        //El primero que entra es el primero que sale
        System.out.println("-------Ejemplo cola----------");
        Cola nombre = new Cola();
        nombre.add("Roberto");
        nombre.add("Diego");
        nombre.add("Karen");
        nombre.add("Antonio");
        System.out.println("////////Antes de extraer//////");
        nombre.mostrar();
        nombre.sacar();
        System.out.println("////Despues de extraer///////");
        nombre.mostrar();
    }

}
