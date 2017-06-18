/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    //Metodo para insertar un Nodo en el Arbol

    public void AgregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    //Metodo para saber cuando el arbol esta vacio

    public boolean estaVacio() {
        return raiz == null;
    }

    //Metodo para recorrer el valor InOrden

    public void inOrden(NodoArbol r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer arbol en preOrden

    public void preOrden(NodoArbol r) {
        if (r != null) {
            System.out.println(r.dato);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    //Metodo para recorrer un arbol en PostOrden
    public void postOrden(NodoArbol r){
        if (r != null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.println(r.dato);
        }
    }
    //Metodo para buscar un Nodo en especifico
    public NodoArbol buscarNodo(int d){
        NodoArbol aux=raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    //Metodo para eliminar un nodo del arbol
    public boolean eliminar(int d){
        NodoArbol auxiliar=raiz;
        NodoArbol padre=raiz;
        boolean esHijoIzq=true;
        while(auxiliar.dato!=d){
            padre=auxiliar;
            
            if(d<auxiliar.dato){
                esHijoIzq=true;
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                esHijoIzq=false;
                auxiliar=auxiliar.hijoDerecho;
            }
            if(auxiliar==null){
                return false;
            }
        }//Fin del while
        if(auxiliar.hijoIzquierdo==null&&auxiliar.hijoDerecho==null){
         if(auxiliar==raiz){
             raiz=null;
         }else if(esHijoIzq){
             padre.hijoIzquierdo=null;
         }else{
             padre.hijoDerecho=null;
         }   
        }else if(auxiliar.hijoDerecho==null){
            if(auxiliar==raiz){
             raiz=auxiliar.hijoIzquierdo;
         }else if(esHijoIzq){
             padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
         }else{
             padre.hijoDerecho=auxiliar.hijoIzquierdo;
         }  
        }else if(auxiliar.hijoIzquierdo==null){
             if(auxiliar==raiz){
             raiz=auxiliar.hijoDerecho;
         }else if(esHijoIzq){
             padre.hijoIzquierdo=auxiliar.hijoDerecho;
         }else{
             padre.hijoDerecho=auxiliar.hijoIzquierdo;
         }  
        }else{
            NodoArbol reemplazo=obtenerNodoReemplazo(auxiliar);
        if(auxiliar==raiz){
            raiz=reemplazo;
        }else if(esHijoIzq){
            padre.hijoIzquierdo=reemplazo;
        }else{
            padre.hijoDerecho=reemplazo;
        }
        reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
        return true;
    }
    //Metodo encargado de devolvernos el nodo remplazo
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre=nodoReemp;
        NodoArbol reemplazo=nodoReemp;
        NodoArbol auxiliar=nodoReemp.hijoDerecho;
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if(reemplazo!=nodoReemp.hijoDerecho){
            reemplazarPadre.hijoIzquierdo=reemplazo.hijoDerecho;
            reemplazo.hijoDerecho=nodoReemp.hijoDerecho;
            
        }
        System.out.println("El nodo reemplazo es "+reemplazo);
        return reemplazo;
    }
    
}
