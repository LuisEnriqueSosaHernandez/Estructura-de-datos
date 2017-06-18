/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

/**
 *
 * @author SAMSUNG
 */
public class busqueda {
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
    public long busquedaBinaria(long  arreglo[], long elemento) {
        int centro, primero, ultimo;
        long valorCentro;
        primero = 0;
        ultimo = arreglo.length - 1;
        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = arreglo[centro];
           
          if(elemento==valorCentro){
              return centro;
          }else if(elemento<valorCentro){
              ultimo=centro-1;//Desplazarse hacia la izquierda
          }else{
              primero=centro+1;//Desplazamos hacia la derecha
              
          }
        }
        return -1;
    }
    
}
