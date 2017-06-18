
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
public class ColaCircular {

    int arreglo[];
    int posicioninicial = 0;
    
    int elementosingresados = 0;
    int posicionelemento;
    int tamaniocola;

    public ColaCircular(int tamanio){
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
        System.out.println( arreglo[posicionelemento]);
        elementosingresados++;
    }

    public void eliminar() {
        
        System.out.println("El elemento eliminado es: "+arreglo[posicioninicial]);
        arreglo[posicioninicial]=0;
        posicioninicial++;
        if(posicioninicial>=tamaniocola){
            posicioninicial=0;
        }
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
        ColaCircular c = new ColaCircular(tamanio);
        int n;
        int el;
        do {
             System.out.println("Selecciona");
              System.out.println("1:Ingresar un elemento");
              System.out.println("2:Eliminar un elemento");
              System.out.println("3:Mostrar cola circular");
              System.out.println("4:Salir");
            n = l.nextInt();
            switch (n) {
                case 1: 
                    if(c.llena()){
                         System.out.println("3:La cola esta llena"); 
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
                        c.eliminar();
                    }
                    break;
                case 3:                   
                    if(c.vacia()){
                         System.out.println("3:La cola esta vacia");
                    }else{
                        c.mostrar();
                    }
                    break;
            }

        } while (n != 4);
    }
}
