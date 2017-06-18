
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
public class TDAVideoTuto26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemento, tamanio;
        boolean estado=false;
        try {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "De que tamanio quieres la Pila", "Solicitando el tamanio",
                    JOptionPane.INFORMATION_MESSAGE));
            Pila pilita = new Pila(tamanio);
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Empujar un elemento en la pila\n"
                        + "2.Sacar un elemento de la Pila\n"
                        + "3.La pila esta vacia?\n"
                        + "4.La pila esta llena?\n"
                        + "5.Que elemento esta en la cima?\n"
                        + "6.Tamanio de la pila\n"
                        + "7.Salir\n"
                        + "Que deseas hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en la fila", "Apilando datos",
                    JOptionPane.INFORMATION_MESSAGE));
                        if(!pilita.estaLlena()){
                            pilita.empujar(elemento);
                        }else{
                          JOptionPane.showMessageDialog(null, "La pila esta llena", "Pila llena", JOptionPane.INFORMATION_MESSAGE);  
                        }
                        break;
                    case 2:
                        if(!pilita.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: "+pilita.sacar(), "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                       if(pilita.estaVacia()){
                           JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La pila no esta vacia", "Contiene datos", JOptionPane.INFORMATION_MESSAGE);
                       }
                        break;
                    case 4:
                        if(pilita.estaLlena()){
                           JOptionPane.showMessageDialog(null, "La pila esta llena", "Pila llena", JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La pila no esta llena", "Contiene espacio", JOptionPane.INFORMATION_MESSAGE);
                       }
                        break;
                    case 5:
                        if(!pilita.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es: "+pilita.cimaPila(), "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);  
                        }else{
                              JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                          JOptionPane.showMessageDialog(null, "El tamanio de la pila es: "+pilita.tamanioPila(), "Dimension", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);

                }

            } while (opcion != 7);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }

}
