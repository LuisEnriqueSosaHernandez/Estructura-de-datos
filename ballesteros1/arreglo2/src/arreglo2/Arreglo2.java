/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        ArrayList<Integer>vector=new ArrayList<Integer>();
        
        String s="";
        while(!s.equals("n")){
            int num=-1;
        
            System.out.println("Ingresa un numero");
            num=l.nextInt();
            
        
        vector.add(num);
        System.out.println("Si deseas dejar de meter datos presiona n");
         s=l.next();
        }
        int replace;
        
        for(int i=0;i<vector.size();i++){
            
            if(vector.get(i)%2!=0&&vector.get(i)<0){
                
               replace=(vector.get(i)*(-2)+vector.get(i));
               vector.set(i,replace);
                
            }
        }
        for(int i=0;i<vector.size();i++){
            
            System.out.println(vector.get(i));
        }
        
    }
    }
    

