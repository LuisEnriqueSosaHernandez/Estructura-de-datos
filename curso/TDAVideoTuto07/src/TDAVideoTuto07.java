/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TDAVideoTuto07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<String> cadenas;//Creando un objeto o isntancia de tipo array list
    cadenas =new ArrayList<String>();
    String frase,respuesta;
    do{
        frase=JOptionPane.showInputDialog(null,"Ingresa la Frase: ");
        //Agregando la frase a la lista
        cadenas.add(frase);
        respuesta=JOptionPane.showInputDialog(null,"Deseas Ingresar otra Frase?(SI/NO) ");
        respuesta=respuesta.toUpperCase();
    }while(!respuesta.equals("NO"));
    //Mostrando el contenido de cadenas uvu
    System.out.println("FRASES: ");
    for(int i=0;i<cadenas.size();i++){
        System.out.println(cadenas.get(i));
    }
    //  Utilizando el metodo set uvu
    
    cadenas.set(1,"La que modifique");
    //cadena modificada
     System.out.println("Frase modificada");
    for(int i=0;i<cadenas.size();i++){
        System.out.println(cadenas.get(i));
    }
    cadenas.remove(0);
    
    System.out.println("Frase que nos quedan"
            + "");
    for(int i=0;i<cadenas.size();i++){
        System.out.println(cadenas.get(i));
    }
    
    }
    
}
