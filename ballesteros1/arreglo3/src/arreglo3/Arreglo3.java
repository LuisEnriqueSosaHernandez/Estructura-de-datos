/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Arreglo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer>lista1=new ArrayList<Integer>();
         ArrayList<Integer>lista2=new ArrayList<Integer>();
          ArrayList<Integer>lista3=new ArrayList<Integer>();
           ArrayList<Integer>lista4=new ArrayList<Integer>();
        Scanner l=new Scanner(System.in);
        System.out.println("Llenando el arreglo1: ");
        String s="";
        int n;
        
        int sum1=0;
       
        int sum2=0;
        
        int sum3=0;
        while(!s.equals("n")){
            System.out.println("Inserta un numero: ");
            n=l.nextInt();
            System.out.println("Si deseas parar presiona n :");
            s=l.next();
            lista1.add(n);
            sum1+=n;
        }
        s="";
         System.out.println("Llenando el arreglo2: ");
         while(!s.equals("n")){
             System.out.println("Inserta un numero: ");
            n=l.nextInt();
            System.out.println("Si deseas parar presiona n :");
            s=l.next();
            lista2.add(n);
            sum2+=n;
        }
          System.out.println("Llenando el arreglo3: ");
          s="";
          while(!s.equals("n")){
              System.out.println("Inserta un numero: ");
            n=l.nextInt();
            System.out.println("Si deseas parar presiona n :");
            s=l.next();
            lista1.add(n);
            sum3+=n;
        }
          lista4.add(sum1);
          lista4.add(sum2);
          lista4.add(sum3);
           System.out.println("4 arreglo que contiene la suma de los otros 3 :");
          for(int i=0;i<lista4.size();i++){
              System.out.println(lista4.get(i));
          }
        
        
        
    }
    
}


