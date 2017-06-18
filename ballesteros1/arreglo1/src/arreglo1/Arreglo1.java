/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Arreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l=new Scanner(System.in);
        ArrayList<Integer>vector=new ArrayList<Integer>();
        
        String s="";
        while(!s.equals("n")){
            int num=-1;
        while(num<0){
            System.out.println("Ingresa un dato positivo");
            num=l.nextInt();
            
        }
        vector.add(num);
        System.out.println("Si deseas dejar de meter datos presiona n");
         s=l.next();
        }
        int pares=0;
        int impares=0;
        int sum=0;
        int sum2=0;
        for(int i=0;i<vector.size();i++){
            if(vector.get(i)%2==0){
                pares++;
                sum+=vector.get(i);
            }
            if(vector.get(i)%2!=0){
                impares++;
                sum2+=vector.get(i);
            }
        }
        System.out.println("La cantidad de numeros PARES es: "+pares);
         System.out.println("La cantidad de numeros IMPARES es: "+impares);
          System.out.println("La suma de los numeros PARES es: "+sum);
           System.out.println("La suma de los numeros IMPARES es: "+sum2);
        
    }
    
}
