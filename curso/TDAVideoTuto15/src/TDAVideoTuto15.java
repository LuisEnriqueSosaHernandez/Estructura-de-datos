
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
public class TDAVideoTuto15 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista listita=new Lista();
        int opcion=0,el;
        do{
          try{
              opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar un elemento al inicio de la lista\n"
                      + "2.Agregar un elemento al final de la lista\n"
                      + "3.Mostrar los elementos de la lista\n"
                      + "4.Eliminar un elemento del inicio de la lista\n"
                      + "5.Eliminar un elemento del final de la lista\n"
                      + "6.Eliminar un elemento en especifico\n"
                      + "7.Buscar un elemento en la lista\n"
                      + "8.salir","Menu de opciones\n",3));
              
              switch(opcion){
                  case 1:
                      try{
                       el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ","Insertando al Inicio",3));
                      //Agregando al Nodo
                       listita.agregarAlInicio(el);
                      }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null, "error"+n.getMessage());
                      }
                      break;
                  case 2:
                      try{
                       el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ","Insertando al final",3));
                      //Agregando al Nodo
                       listita.agregarAlFinal(el);
                      }catch(NumberFormatException n){
                        JOptionPane.showMessageDialog(null, "error"+n.getMessage());
                      }
                      
                      break;
                  case 3:
                      listita.mostrarLista();
                      break;
                  case 4:
                     el=listita.borrarDelInicio();
                     JOptionPane.showMessageDialog(null,"El elemento eliminado es: "+el,"Elminado nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
                      break;
                  case 5:
                      el=listita.borrarDelFinal();
                      JOptionPane.showMessageDialog(null,"El elemento eliminado es: "+el,"Elminado nodo del final",JOptionPane.INFORMATION_MESSAGE);
                      break;
                  case 6:
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Elemento a Eliminar..","Eliminando Nodos en especifico",JOptionPane.INFORMATION_MESSAGE));
                    if(listita.estaEnLaLista(el)){
                    listita.eliminar(el);
                    
                    JOptionPane.showMessageDialog(null,"El elemento eliminado es: "+el,"Elminado nodo en Especifico",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                         JOptionPane.showMessageDialog(null, "El elemento "+el+" El elemento no esta en la lista","Nodo  NO Encontrado",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                  case 7:
                    el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa Elemento a Buscar..","Buscando Nodos en la lista",JOptionPane.INFORMATION_MESSAGE));
                    if(listita.estaEnLaLista(el)==true){
                        JOptionPane.showMessageDialog(null, "El elemento "+el+" Si esta en la lista","Nodo Encontrado",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                         JOptionPane.showMessageDialog(null, "El elemento "+el+" no esta en la lista","Nodo  NO Encontrado",JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                      break;
                      
                  case 8:
                    JOptionPane.showMessageDialog(null, "Programa finalizado"); 
                      break;
                  default:
                      JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
              }
          } catch(Exception e){
              JOptionPane.showMessageDialog(null, "error"+e.getMessage());
          } 
        }while(opcion!=8);
    }
    
}
