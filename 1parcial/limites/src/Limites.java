
import java.util.Arrays;
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
public class Limites {
     public int limites(int x,int p){
         if(x>p){
             return 0;
         }
         else{
             return x+limites(x+1,p);
         }
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l=new Scanner(System.in);
        Limites k=new Limites();
        int []arreglo=new int[2];
       
        arreglo[0]=l.nextInt();
        arreglo[1]=l.nextInt();
        Arrays.sort(arreglo);
        int x=arreglo[0];
        int p=arreglo[1];
        
        System.out.println(k.limites(x, p));
    }
    
}
