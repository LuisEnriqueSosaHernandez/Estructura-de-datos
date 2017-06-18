

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;//Puntero enlace
    //Constrcutor para insertar al final
    public Nodo(int d){
    this.dato=d;  
    this.siguiente=null;
    }
    //Constructor para insertar al inicio
    public Nodo(int d,Nodo n){
        dato=d;
        siguiente=n;
    }
    
    
}
