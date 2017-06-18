/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
import java.util.LinkedList;
import java.util.Queue;
        
public class TDAVideoTuto31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> colita=new LinkedList<Integer>();
        colita.add(10);
        colita.add(20);
        colita.add(30);
        colita.add(40);
        colita.add(50);
        System.out.println("El inicio de la cola es: "+colita.peek());
        int tamanio= colita.size();
        System.out.println("Vaciando la cola");
        colita.clear();
        
        while(!colita.isEmpty()){
            System.out.println("Despachando al elemento: "+colita.remove());
        }
        
    }
    
}
