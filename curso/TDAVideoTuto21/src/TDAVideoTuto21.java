
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
public class TDAVideoTuto21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listita=new ListaDoble();
        int opcion=0,elemento;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo al Inicio\n"
                                +"2.Agregar un Nodo al final\n"
                                +"3.Mostrar lista de inicio a fin\n"
                                +"4.Mostrar lista de fin a inicio\n"
                                +"5.Eliminar un nodo del inicio\n"
                                +"6.Eliminar un nodo del final\n"
                                +"7.salir\n"
                                +"Que deseas Hacer?","Menu de opciones",
                                JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){
                case 1:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del Nodo","Agregando Nodo al inicio",
                            JOptionPane.INFORMATION_MESSAGE));
                    listita.agregarAlInicio(elemento);
                    break;
                    case 2:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingresa el elemento del Nodo","Agregando Nodo al final",
                            JOptionPane.INFORMATION_MESSAGE));
                    listita.agregarAlFinal(elemento);
                    break;
                    case 3:
                    if(!listita.estaVacia()){
                        listita.mostrarListaInicioFin();
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodo aun",
                            "Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                    case 4:
                     if(!listita.estaVacia()){
                        listita.mostrarListaFinInicio();
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodo aun",
                            "Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                    case 5:
                    if(!listita.estaVacia()){
                        elemento=listita.eliminarDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es:  "+elemento,
                            "Eliminar del inicio",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodo aun",
                            "Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                    case 6:
                        if(!listita.estaVacia()){
                        elemento=listita.eliminarDelFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es:  "+elemento,
                            "Eliminar del final",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nodo aun",
                            "Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
                    }
                        
                    break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                            "FIIIN",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no es correcta",
                            "Incorrecto",JOptionPane.INFORMATION_MESSAGE);
                   break;
            }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error "+n.getMessage());
            }
        }while(opcion!=7);
    }
    
}
