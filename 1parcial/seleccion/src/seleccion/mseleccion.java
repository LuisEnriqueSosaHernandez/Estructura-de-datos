/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

/**
 *
 * @author SAMSUNG
 */
public class mseleccion {
    public void ordenamientoPorSeleccion(int a[]){
        int c[]=new int[3];
        for(int i=0;i<a.length-1;i++){
            int minimo=i;
            c[0]++;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minimo]){
                    minimo=j;
                    c[1]++;
                }
                c[2]++;
            }
            int aux=a[i];
            a[i]=a[minimo];
            a[minimo]=aux;        
        }
         System.out.println("for 1: "+c[0]+" for 2: "+c[2]+" if: "+c[1]);
    }
 
    
}



