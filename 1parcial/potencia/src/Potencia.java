
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
public class Potencia {

 public long potencia(int x,int p){
     if(p==0){
         return 1;
     }
    
     else{
         return x*potencia(x,(p-1));
     }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l=new Scanner(System.in);
        Potencia f=new Potencia();
        int x=l.nextInt();
        int p=l.nextInt();
       
        
        System.out.println(f.potencia(x, p));
    }
    
}
