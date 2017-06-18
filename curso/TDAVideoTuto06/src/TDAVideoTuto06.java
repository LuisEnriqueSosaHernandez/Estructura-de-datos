/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class TDAVideoTuto06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numeros[]=new int[5];
      int numerotes[]=new int[numeros.length];
      String palabras[]=new String[5];
      int i;
      for(i=0;i<5;i++){
          numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del indice: "+i));
          }
      //Mostrando datos
      System.out.println("Los datos sin ordenar son: ");
      for(i=0;i<5;i++){
          
          System.out.print("["+numeros[i]+"]");
      }
        System.out.println("\nLos datos ordenados son: ");
      Arrays.sort(numeros);
       //Aqui se ordena el arreglo numeros
    for(i=0;i<5;i++){
    System.out.print("["+numeros[i]+"]");
    }
    //Rellenando al arreglo palabras
    
    Arrays.fill(palabras, "Bienvenido a la Fiesta");
      System.out.println("Elementos del arreglo palabras");
      for(i=0;i<5;i++){
          System.out.print("["+palabras[i]+"]");
      }
      //Copiando los elementos del arreglo numeros a numerotes
      System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
      System.out.println("\nElementos del arreglo numerotes");
      for(i=0;i<5;i++){
          System.out.print("["+numerotes[i]+"]");
      }
    }
   
}
    
