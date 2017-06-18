/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
import java.util.Stack;
public class TDAVideoTuto30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack pilita=new Stack();
          System.out.println("La pila esta vacia?  "+pilita.isEmpty());
        pilita.push(10);
        pilita.push(20);
        pilita.push(30);
        pilita.push(40);
        pilita.push(50);
        pilita.push(333);
        
              System.out.println("Tamanio de la pila: "+pilita.size());
        System.out.println("La cima es: "+pilita.peek());
        System.out.println("Sacando un elemento de la pila: "+pilita.pop());
        System.out.println("Sacando un elemento de la pila: "+pilita.pop());
        System.out.println("Tamanio de la pila: "+pilita.size());
              System.out.println("La pila esta vacia?  "+pilita.isEmpty());
    }
    
}
