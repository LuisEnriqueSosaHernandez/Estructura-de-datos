/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.diagnostico;

import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author SAMSUNG
 */
public class ExamenDiagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long inicio,fin,tiempo;
        try (PrintWriter salida = new PrintWriter(System.out)) {
            Scanner l=new Scanner(System.in);
            Vector v = new Vector();
            System.out.println("Dame la longitud del arreglo: ");
            int x=l.nextInt();
            int []arreglo=new int[x];
            System.out.println("LLenado del arreglo");
            for(int i=0;i<arreglo.length;i++){
                System.out.print("Ingresa valor un valor arreglo["+i+"]: ");
                arreglo[i]=l.nextInt();
                
            }
            System.out.print("Dame la constante x: ");
            
            v.setX(l.nextInt());
            inicio=System.currentTimeMillis();
            System.out.println("El valor de la constante es: "+v.getX());
            
            System.out.println("El arreglo original es: ");
            v.imprime(arreglo);
            int []arreglo3=v.multiplica(arreglo);
            
            
            System.out.println("\nEl arreglo multiplicado por la constante es: ");
            v.imprime(arreglo3);
            fin=System.currentTimeMillis();
            
            tiempo=fin-inicio;
            
            System.out.println("\nTiempo ");
            salida.println(tiempo);
        }
        
    }
    
}
