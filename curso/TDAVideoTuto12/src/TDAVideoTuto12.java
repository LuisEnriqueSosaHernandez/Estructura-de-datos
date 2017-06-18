/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
public class TDAVideoTuto12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   TDAVideoTuto12 objHanoi=new TDAVideoTuto12();
   objHanoi.torresHanoi(64, 1, 2, 3);
     System.out.println("Juego completado");
    }
    //Creando el metodo recursivo para solucionar torres de hanoi
    public void torresHanoi(int discos,int torre1,int torre2,int torre3){
       //Caso base
        if(discos==1){
            System.out.println("Mover disco de torre "+torre1+" A torre "+torre3);
        }else{
            //Dominio
            torresHanoi(discos-1,torre1,torre3,torre2);
                       System.out.println("Mover disco de torre "+torre1+" A torre "+torre3);
            torresHanoi(discos-1,torre2,torre1,torre3);
        }
      
        
    }
    
}
