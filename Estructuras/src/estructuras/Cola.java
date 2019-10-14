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
public class Cola {
    public Nodo cabeza;
    private Nodo fondo;
    public Cola()
    {
        cabeza=null;
        fondo=null;
    }
    public void add(String info)
    {
        Nodo actual=new Nodo();
        actual.info=info;
        if(colavacia()==true){
            cabeza=actual;
            fondo=actual;
        }else{
            fondo.siguiente=actual;
            fondo=actual;
        }
    }
    public String sacar()
    {
        if(colavacia()==false){
            String letra=cabeza.info;
            if(cabeza==fondo){
                cabeza=null;
                fondo=null;
            }else{
                cabeza=cabeza.siguiente;
            }
            return letra;
        }else{
            return "";
        }
    }
    public void mostrar()
    {
        Nodo reco=cabeza;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.siguiente;
        }
        System.out.println();
    }
    public int cantidad()
    {
        int cantidad=0;
        Nodo reco=cabeza;
        while (reco!=null) {
            reco=reco.siguiente;
            cantidad++;
        }
        return cantidad;
    }
    public boolean colavacia()
    {
        if(cabeza==null){
            return true;
        }else{
            return false;
        }
    }
}