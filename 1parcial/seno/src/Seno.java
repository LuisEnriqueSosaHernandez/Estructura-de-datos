
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
public class Seno {
    public double factorial(int x){
        if(x==0){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
    public double senito(int x,int i,int w){
       if(w==0){
           return 0;
       }else{
           return factorial (i)/Math.pow(x,i)-senito(x,i+2,w-1);
       }
       
       
        
    }
    public double seno2(int x){
        double acomulable=0;
        int i=1;
       
        for(int j=1;j<=x;j++){
            
            if(j%2==0){
                acomulable-=(i/(Math.pow(x,i)));
            }else{
               acomulable+=(i/((Math.pow(x,i)))); 
            }
            i+=2;
        }
        
        return acomulable;
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l=new Scanner(System.in);
    int x=l.nextInt();
    Seno s=new Seno();
    int i=1;
    int w=l.nextInt() ;
    System.out.println(s.senito(x,i,w));
    System.out.println(s.seno2(x));
    }
    
}
