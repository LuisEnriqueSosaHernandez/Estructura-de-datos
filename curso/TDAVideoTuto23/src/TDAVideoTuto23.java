
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
public class TDAVideoTuto23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLC listita = new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado=false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo a la lista circular\n"
                        + "2.Eliminar un nodo dela lista circular\n"
                        + "3.Mostrar los datos de la lista circular\n"
                        + "4.salir\n"
                        + "Que deseas Hacer?", "Menu de opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo a la lista circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if(!listita.estaVacia()){
                       elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                              "Ingresa el elemento del Nodo a eliminar", "Eliminando nodos de la lista circular",
                               JOptionPane.INFORMATION_MESSAGE));
                       eliminado=listita.eliminar(elemento);
                       if(eliminado){
                           JOptionPane.showMessageDialog(null, "El elemento eliminado es: "+elemento,
                                "Eliminado nodos", JOptionPane.INFORMATION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "El elemento no esta en la lista",
                                "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                       }
                        }else{
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                "La lista esta vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                      
                        break;
                    case 3:
                        if(!listita.estaVacia()){
                            listita.mostrarLista();;
                        }else{
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fiiin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                   
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no es correcta",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 4);
    }

}
