
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
public class TDAVideoTuto27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemento = 0;
        Pila pilita = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Empujar un elemento en la pila\n"
                        + "2.Sacar un elemento de la Pila\n"
                        + "3.La pila esta vacia?\n"
                        + "4.Que elemento esta en la cima?\n"
                        + "5.Tamanio de la pila\n"
                        + "6.Vacia Pila\n"
                        + "7.salir\n"
                        + "Que deseas hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a empujar en la fila", "Apilando datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        pilita.empujar(elemento);
                        break;
                    case 2:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: " + pilita.sacar(), "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia", "Contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:

                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es: " + pilita.cimaPila(), "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamanio de la pila es: " + pilita.tamanioPila(), "Dimension", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if (!pilita.estaVacia()) {
                            pilita.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado: ", "Vaciando Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia", "Nada que vaciar", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {

                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }

        } while (opcion != 7);

    }

}
