/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class Cola {
    NodoCola inicio,fin;
    int tama;
    public Cola(){
        inicio=fin=null;
        tama=0;
    }
    //Metodo para saber si esta vacia
    public boolean estaVacia(){
        return inicio==null;
    }
    //Metodo para insertar datos
    public void insertar(int ele){
        NodoCola nuevo=new NodoCola(ele);
        if(estaVacia()){
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
            
        }
        fin=nuevo;
        tama++;
    }
    //Metodo para eliminar elementos
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tama--;
        return aux;
    }
    //Metodo para saber quien esta al inicio de la cola
    public int inicioCola(){
        return inicio.dato;
    }
    //Tamanio de la cola
    public int tamanioCola(){
        return tama;
    }
}
