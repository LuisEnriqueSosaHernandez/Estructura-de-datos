package insercion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class orden {
    public void insercion(int[]array){
        int aux,i,j;
       int con[]=new int[2];
        for(i=1;i<array.length;i++){
            aux=array[i];
            con[0]++;
                    
           
            for(j=i-1;j>=0&&array[j]>aux;j--){
                array[j+1]=array[j];
                array[j]=aux;
                con[1]++; 
            }
        }
        System.out.println("for1: "+con[0]+" for2: "+con[1]);
    }
}
//5n+1+5n+1+1 =13 n2
