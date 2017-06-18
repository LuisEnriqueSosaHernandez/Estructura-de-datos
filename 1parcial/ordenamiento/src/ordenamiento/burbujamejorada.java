/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;
import java.util.Arrays;

/**
 *
 * @author SAMSUNG
 */
public class burbujamejorada {
    /*public float[]burbujaprofe(float[]d){
        int  i,j;
    int n=d.length;
    float aux;
    for(i=0;i<n-1;i++)
       for(j=n-1-i;j>i;j--)
       if(d[j]<d[j-1]){
    aux=d[j-1];
    d[j-1]=d[j];
    d[j]=aux;
}
    return d;
    }*/
    public float[] sort(float[]arreglo){
        Arrays.sort(arreglo);
        return arreglo;
    }
    public float[] shell(float[]arreglo){
    
        int salto, i, j, k;
                float auxiliar;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;
                    } else {
                        auxiliar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiliar;
                        j -= salto;
                    }
                }
            }
            salto /= 2;
        }
    return arreglo;
    }
    public float []burbuja2(float[] arreglo) {
        int i,j;
        float temporal;
        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
                
            }
        }
        return arreglo;
    }
    public float[] burbuja(float[]a){
        int i,j;
        float aux;
        for( i=0;i<a.length;i++){
            for( j=0;i<a.length;i++){
                if(a[i]<a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
        return a;
    }
    public void imprimir(float[]arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
              
    
}
