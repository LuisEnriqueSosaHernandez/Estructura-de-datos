/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Busquedabinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random x = new Random();
        Scanner l=new Scanner(System.in);
       
        
        busqueda b=new busqueda();
        long inicio, fin, tiempo;
        
        
        long[] arreglo=new long[100000];
         for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (long) (x.nextDouble() * 100000 + 0);
            }
          
          
         b.insercion(arreglo);
         String s="si";
         do{
         System.out.println("que numero quieres encontrar?");
         long n=l.nextLong();
        inicio = System.currentTimeMillis();
         if(b.busquedaBinaria(arreglo, n)==-1){
             System.out.println("Numero no econtrado");
         }else{
             System.out.println("Numero encontrado");
           
         }
         fin = System.currentTimeMillis();

                    tiempo = fin - inicio;

                    System.out.println("\nTiempo " + tiempo);
         s=l.next();
         }while(s.equals("si"));    
    }
    
}
