
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
public class TDAVideoTuto34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo\n"
                        + "2.Recorrer el arbol InOrden\n"
                        + "3.Recorrer el arbol en preOrden\n"
                        + "4.Recorrer el arbol en postOrden\n"
                        + "5.Buscar un nodo en el arbol\n"
                        + "6.Eliminar un nodo del arbol\n"
                                + "7.Salir\n"
                        + "Elige una opcion...", "Arboles Binarios menu", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el Numero del Nodo", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo",
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbolito.AgregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()) {
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!arbolito.estaVacio()) {
                            arbolito.postOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el Numero del Nodo buscado", "Buscando", JOptionPane.QUESTION_MESSAGE));
                          
                           if(arbolito.buscarNodo(elemento)==null){
                               JOptionPane.showMessageDialog(null, "El nodo esta desaparecido uvu", "warning", JOptionPane.INFORMATION_MESSAGE);
                           }else{
                               System.out.println("Nodo encontrado: "+arbolito.buscarNodo(elemento));
                           }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el Numero del Nodo a eliminar", "Eliminando nodo", JOptionPane.QUESTION_MESSAGE));
                          
                           if(arbolito.eliminar(elemento)==false){
                               JOptionPane.showMessageDialog(null, "El nodo esta desaparecido uvu", "warning", JOptionPane.INFORMATION_MESSAGE);
                           }else{
                              JOptionPane.showMessageDialog(null, "El nodo ha sido eliminado", "Delete"
                                      + "", JOptionPane.INFORMATION_MESSAGE);
                           }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
                                "Warning", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }

        } while (opcion != 7);
    }

}
