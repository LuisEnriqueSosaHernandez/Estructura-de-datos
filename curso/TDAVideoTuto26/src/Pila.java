public class Pila {
int vectorPila[];
int cima;
//Constructor
public Pila(int tamanio){
    vectorPila=new int[tamanio];
    cima=-1;
}
//Metodo push
public void empujar(int dato){
    cima++;
    vectorPila[cima]=dato;
}
//Metodo pop
public int sacar(){
    int fuera=vectorPila[cima];
    cima--;
    return fuera;
}
//Metodo para saber si la pila esta vacia
public boolean estaVacia(){
    return cima==-1;
    }
//Metodo para saber si la pila esta llena
public boolean estaLlena(){
    return vectorPila.length-1==cima;
}
//Metodo para saber que elemento se encuentra en la cima
public int cimaPila(){
    return vectorPila[cima];
}
//Metodo para saber el tamanio de la pila
public int tamanioPila(){
    return vectorPila.length;
}
}
