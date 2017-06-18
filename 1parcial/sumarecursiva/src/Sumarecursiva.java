
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
public class Sumarecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l=new Scanner(System.in);
        Sumarecursiva s=new Sumarecursiva();
        int y=l.nextInt();
        if(y%2!=0){
        y-=1;
        }
        System.out.println(s.suma(y));
    }
    public int suma(int x){
        if(x==0){
            return 0;
        }
        {
            return x +suma(x-2);
        }
    }
    
}
