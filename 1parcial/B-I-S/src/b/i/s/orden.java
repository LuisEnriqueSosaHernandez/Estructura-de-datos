/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.i.s;

/**
 *
 * @author SAMSUNG
 */

public class orden {
    public void insercion(long []array){
        long aux;
                int i,j;
       
        for(i=1;i<array.length;i++){
            aux=array[i];
            
                    
           
            for(j=i-1;j>=0&&array[j]>aux;j--){
                array[j+1]=array[j];
                array[j]=aux;
                
            }
        }
        
    }
    public void burbuja(long []a){
        int i,j;
        long aux;
        for( i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
    }
    public void ordenamientoPorSeleccion(long a[]){
        
        for(int i=0;i<a.length-1;i++){
            int minimo=i;
           
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minimo]){
                    minimo=j;
                   
                }
               
            }
            long aux=a[i];
            a[i]=a[minimo];
            a[minimo]=aux;        
        }
         
    }
    
}
