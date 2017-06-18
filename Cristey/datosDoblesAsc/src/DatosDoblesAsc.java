
import java.util.Scanner;


public class DatosDoblesAsc {
public float[] quick(float[]arreglo, int primero, int ultimo) {
        int i, j;
        float pivote,auxiliar;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo) / 2];
        System.out.println("El pivote es: " + pivote);
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            //Aqui hacemos el intercambio
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quick(arreglo, primero, j);
        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        return arreglo;
    }
  public void mostrarArreglo(float[] arreglo) {
        int k = 0;
        System.out.println("Datos ordenados en forma ascendente");
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");

        }
        System.out.println("");
    }
   
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        DatosDoblesAsc Asc=new DatosDoblesAsc();
        System.out.println("Cantidad de datos a introducir ");
        int a=l.nextInt();
        float arreglo[];
        arreglo=new float[a];
        for(int i=0;i<a;i++){
            System.out.println("Introduce el dato  "+(i+1));
            arreglo[i]=l.nextFloat();
        }
        Asc.mostrarArreglo(Asc.quick(arreglo, 0, arreglo.length-1));
        
        
    }
    
}
