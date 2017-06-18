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
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mseleccion m=new mseleccion();
        System.out.println("Arreglo en orden");
        int []a={1,2,3,4,5};
        int []b={5,4,3,2,1};
        m.ordenamientoPorSeleccion(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Arreglo inverso");
        m.ordenamientoPorSeleccion(b);
        for(int i=0;i<b.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
