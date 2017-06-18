/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIzquierdo,hijoDerecho;
    public NodoArbol(int d,String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return nombre+" Su dato es: "+dato;
    }
}
