/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.diagnostico;

/**
 *
 * @author SAMSUNG
 */
public class Vector {
   
    int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public int[] multiplica(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]*=x;
        }
        return arreglo;
    }
    public void imprime(int[] arreglo2){
        for(int i=0;i<arreglo2.length;i++){
        System.out.print(arreglo2[i]+" ");
    }
    }
    
}

    

