
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class Coladoble{

    int arreglo[];
    int posicioninicial = 0;
    int posicionfinal=0;
    int elementosingresados = 0;
    int posicionelemento;
    int tamaniocola;

    public Coladoble(int tamanio){
        arreglo = new int[tamanio];
        posicioninicial = 0;
        
        elementosingresados = 0;
        tamaniocola=tamanio;
    }

    public void ingresar(int elemento) {
        posicionelemento = (posicioninicial + elementosingresados);
        if(posicionelemento>=tamaniocola){
            posicionelemento-=tamaniocola;
        }
        arreglo[posicionelemento] = elemento;
        System.out.println( "La posicion del elemento es: "+posicionelemento);
        
        posicionfinal=posicionelemento;
        elementosingresados++;
        System.out.println( "La posicion inicial es: "+posicioninicial);
         System.out.println( "La posicion final es: "+posicionfinal);
    }

    public void eliminarinicio() {
        
        System.out.println("El elemento eliminado es: "+arreglo[posicioninicial]);
        arreglo[posicioninicial]=0;
        posicioninicial++;
        if(posicioninicial>=tamaniocola){
            posicioninicial=0;
        }
        elementosingresados--;
        
    }
    public void eliminarfinal(){
        System.out.println("El elemento eliminado es: "+arreglo[posicionfinal]);
        arreglo[posicionfinal]=0;
        posicionfinal--;
       // if(posicionfinal<=0){
        //    posicionfinal=tamaniocola-1;
        //}
        elementosingresados--;
    }

    public boolean vacia() {
        if(elementosingresados==0){
            posicioninicial=0;
        }
        return elementosingresados == 0;
    }

    public boolean llena() {
        return elementosingresados == tamaniocola;
    }

    public void mostrar() {
        for (int i = 0; i < tamaniocola; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner l = new Scanner(System.in);
        System.out.println("Dame el tamanio de la cola:");
        
        int tamanio=l.nextInt();
        Coladoble c = new Coladoble(tamanio);
        int n;
        int el;
        do {
             System.out.println("Selecciona");
              System.out.println("1:Ingresar un elemento");
              System.out.println("2:Eliminar un elemento del inicio");
              System.out.println("3:Eliminar un elemento del final");
              System.out.println("4:Mostrar cola circular");
              System.out.println("5:Salir");
            n = l.nextInt();
            switch (n) {
                case 1: 
                    if(c.llena()){
                         System.out.println("La cola esta llena"); 
                    }else{
                        System.out.println("Ingresa el elemento:");
                       el=l.nextInt();
                        c.ingresar(el);
                    }
                    break;
                case 2:
                    if(c.vacia()){
                         System.out.println("3:La cola esta vacia");
                    }else{
                        c.eliminarinicio();
                    }
                    break;
                case 3:                   
                    if(c.vacia()){
                         System.out.println("3:La cola esta vacia");
                    }else{
                        c.eliminarfinal();
                    }
                    break;
                    case 4:                   
                    if(c.vacia()){
                         System.out.println("3:La cola esta vacia");
                    }else{
                        c.mostrar();
                    }
                    break;
            }

        } while (n != 5);
    }
}

