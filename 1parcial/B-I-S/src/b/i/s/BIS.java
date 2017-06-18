/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.i.s;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author SAMSUNG
 */
public class BIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random x = new Random(3816L);
        Scanner l = new Scanner(System.in);
        String s;
        orden n = new orden();
        long inicio, fin, tiempo;
        do {
            System.out.println("De que tamanio quieres el arreglo?: ");
            int a = l.nextInt();
            long k=0;
            long[] arreglo = new long[a];
            System.out.println("----MENU---- ");
            System.out.println("1=burbuja");
            System.out.println("2=insercion");
            System.out.println("3=seleccion");
            //caso promedio
           /*for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (long) (x.nextDouble() * 100000 + 0);
            }*/
            //mejor caso
           /*for (int i = 0; i < arreglo.length; i++) {
                
                arreglo[i] =k;
                k++;
            }*/
            //peor caso
            k=a;
            for(int i=0;i<arreglo.length;i++){
                arreglo[i]=k;
                k--;
            }
            
            
            int t = l.nextInt();
            switch (t) {
                case 1:
                    inicio = System.currentTimeMillis();
                    n.burbuja(arreglo);
                    fin = System.currentTimeMillis();

                    tiempo = fin - inicio;

                    System.out.println("\nTiempo " + tiempo);

                    break;
                case 2:
                    inicio = System.currentTimeMillis();
                    n.insercion(arreglo);
                    fin = System.currentTimeMillis();

                    tiempo = fin - inicio;

                    System.out.println("\nTiempo " + tiempo);
                    
                     
                   
                    break;
                case 3:
                    inicio = System.currentTimeMillis();
                    n.ordenamientoPorSeleccion(arreglo);
                    fin = System.currentTimeMillis();

                    tiempo = fin - inicio;

                    System.out.println("\nTiempo " + tiempo);

                    break;
            }
            System.out.println("Deseas calcular otro tiempo");
            s = l.next();
        } while (s.equals("si"));

    }
}
