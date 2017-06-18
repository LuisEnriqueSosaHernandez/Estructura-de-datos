/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class Pila {
   private NodoPila cima;
   int tama;
   public Pila(){
       cima=null;
       tama=0;
   }
   //Metodo para saber cuando la pila esta vacia
   public boolean estaVacia(){
       return cima==null;
   }
   //Metodo para empujar un elemento en la pila
   public void empujar(int elem){
       NodoPila nuevo=new NodoPila(elem);
       nuevo.siguiente=cima;
       cima=nuevo;
       tama++;
   }
   //Metodo para sacar elementos de la pila
   public int sacar(){
       int aux=cima.dato;
       cima=cima.siguiente;
       tama--;
       return aux;
   }
   //Metodo para saber quien esta en la cima de la pila
   public int cimaPila(){
       return cima.dato;
   }
   //Metodo para saber el tamanio de la pila
   public int tamanioPila(){
       return tama; 
   }
   //Metodo para limpiar la pila o vaciar la pila
   public void limpiarPila(){
       while(!estaVacia()){
           sacar();
       }
   }
}
