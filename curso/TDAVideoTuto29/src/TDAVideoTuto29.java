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
public class TDAVideoTuto29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList listita=new LinkedList();
        listita.add(10);
        listita.add(50);
        listita.add(30);
        listita.add(40);
        listita.add(20);
        int tamanio=listita.size();
        int i=0;
        while(i<tamanio){
            System.out.println("["+listita.get(i)+"]->");
            i++;
        }
        listita.remove(2);
        listita.add(3,100);
        i=0;
        tamanio=listita.size();
        System.out.println("");
        while(i<tamanio){
            System.out.println("["+listita.get(i)+"]->");
            i++;
        }
    }
    
}
