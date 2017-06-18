
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
public class TDAVideoTuto28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemento = 0;
        Cola colita = new Cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Insertar un elemento en la cola\n"
                        + "2.Quitar un elemento de la cola\n"
                        + "3.La cola esta vacia?\n"
                        + "4.Elemento en el inicio de la cola\n"
                        + "5.Tamanio de la Cola\n"
                        + "6.Salir", "Menu de opciones uvu Colita", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a insertar", "Insertando en la cola uvu",
                                JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento atendido es: " + colita.quitar(), "Quitando Elementos de la cola",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola esta vacia", "Cola vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (colita.estaVacia()) {

                            JOptionPane.showMessageDialog(null,
                                    "La cola esta vacia: ", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola no esta vacia: ", "Cola no Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "El elemento ubicado al inicio de la cola es: " + colita.inicioCola(), "Primer elemento",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La cola esta vacia: ", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                                "El tamanio de la cola es: "+colita.tamanioCola(),"Tamanio",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "Aplicacion finalizada: ","Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Opcion Incorrecta: ","Warning",
                                JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 6);
    }

}
