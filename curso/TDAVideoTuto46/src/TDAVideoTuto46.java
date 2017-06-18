/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class TDAVideoTuto46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolAVL arbolitoAVL=new ArbolAVL();
        
        //Insertando nodos
        arbolitoAVL.insertar(10);
        arbolitoAVL.insertar(6);
        arbolitoAVL.insertar(-6);
        arbolitoAVL.insertar(7);
        arbolitoAVL.insertar(18);
        arbolitoAVL.insertar(15);
        arbolitoAVL.insertar(25);
       // arbolitoAVL.preOrden(arbolitoAVL.obtenerRaiz());
        arbolitoAVL.inOrden(arbolitoAVL.obtenerRaiz());
        // arbolitoAVL.mostrarHojas(arbolitoAVL.obtenerRaiz());
    }
    
}
