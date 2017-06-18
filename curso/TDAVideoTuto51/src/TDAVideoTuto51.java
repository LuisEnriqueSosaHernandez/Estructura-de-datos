
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class TDAVideoTuto51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlgoritmoDeOrdenamiento ordenar=new AlgoritmoDeOrdenamiento();
        int vector1[]={5,6,3,44,22,1};
        int vector2[]={55,4,43,44,2,10,4567,638,3,0,-5,-9};
        int vector3[]={5,2,1,8,3,9,7};
        
        /*System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector1);
        ordenar.burbuja1(vector1);
        System.out.println("Arreglo Ordenado con burbuja1");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo Original");
        ordenar.mostrarArreglo(vector2);
        ordenar.burbuja2(vector2);
        System.out.println("Arreglo Ordenado con burbuja2");
        ordenar.mostrarArreglo(vector2);
         System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector2);
         ordenar.radix(vector2);
        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector3);
        ordenar.quick(vector3,0,vector3.length-1);
        int tam;
        tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tamano del arreglo"));
        int vectorcito[]=new int[tam];
        for(int i=0;i<tam;i++){
            vectorcito[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del inidice: "+i));
            ordenar.insercion(vectorcito, i+1);
        }
         System.out.println("Arreglo original");
         ordenar.mostrarArreglo(vector3);
         ordenar.shell(vector3);
        System.out.println("Arreglo vector1 original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo vector2 original");
        ordenar.mostrarArreglo(vector2);
        ordenar.burbuja1(vector1);
        ordenar.burbuja1(vector2);
         System.out.println("Arreglo resultante despues de ordenar por intercalacion");
         ordenar.intercalacion(vector1, vector2);
          System.out.println("Arreglo vector2 original");
        ordenar.mostrarArreglo(vector2);
         System.out.println("Arreglo vector2 ordenado con mezcla directa");
        vector2=ordenar.mezclaDirecta(vector2);
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo vector2 original");
        ordenar.mostrarArreglo(vector2);
         System.out.println("Arreglo vector2 ordenado con mezcla natural");
    ordenar.mezclaNatural(vector2);
     ordenar.mostrarArreglo(vector2);
        
        ordenar.mostrarArreglo(vector2);
        int indice=ordenar.busquedaSecuencial(vector2, 590);
        if(indice!=-1){
            System.out.println("Elemento 590 econtrado en el indice "+indice);
        }else{
            System.out.println("Elemento no encontrado");
        }*/
        ordenar.mostrarArreglo(vector2);
        ordenar.mezclaNatural(vector2);
        ordenar.mostrarArreglo(vector2);
        int indice=ordenar.busquedaBinaria(vector2, 4);
        if(indice!=-1){
            System.out.println("Elemento 4 econtrado en el indice "+indice);
        }else{
            System.out.println("Elemento no encontrado");
        }
    
    }    
      
    
}
