/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Arreglo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer>list=new ArrayList<Integer>();
        Scanner l=new Scanner(System.in);
        String s="";
        int n;
        while(!s.equals("n")){
            System.out.println("Ingresa un numero: ");
            n=l.nextInt();
             System.out.println("si deseas parar ingresa n: ");
            s=l.next();
            
        }
        int multi=0;
        for(int i=0;i<list.size();i++){
            for(int j=1;j<list.size();j++){
            multi+=list.get(i)*list.get(j);
        }
        }
        int suma=0;
        for(int i=0;i<list.size();i++){
            for(int j=1;j<list.size();j++){
            suma+=list.get(i)+list.get(j);
        }
        }
        int resta=0;
        for(int i=0;i<list.size();i++){
            for(int j=1;j<list.size();j++){
            resta+=list.get(i)-list.get(j);
        }
        }
        System.out.println("La suma total es: "+suma);
         System.out.println("La multi total es: "+multi);
          System.out.println("La resta total es: "+resta);
        
    }
    
}
