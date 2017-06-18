
import javax.swing.JOptionPane;

public class Registro {

    public static void main(String[] args) {
        int numregistro = 0;
        String nombre = "";
        int edad = 0;
        String sexo = "";
        double estatura = 0;
        double peso = 0;
        String opcion = "";
        boolean b;
        Lista l = new Lista();
        do {
            try {
                opcion = JOptionPane.showInputDialog(null, "1.Agregar un registro\n"
                        + "2.Mostrar los elementos de la lista\n"
                        + "3.Eliminar un elemento del inicio de la lista\n"
                        + "4.Eliminar un elemento del final de la lista\n"
                        + "5.Eliminar un elemento en especifico\n"
                        + "6.Buscar un elemento en la lista\n"
                        + "7.salir", "Menu de opciones\n", 3);
                         b=true;
                switch (opcion) {
                    case "1":
                        try {
                            numregistro= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de registro: ", "Insertando al Inicio", 3));
                            nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ", "Insertando al Inicio", 3);
                            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad: ", "Insertando al Inicio", 3));
                            sexo = JOptionPane.showInputDialog(null, "Ingresa el sexo: ", "Insertando al Inicio", 3);
                            estatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la estatura: ", "Insertando al Inicio", 3));
                            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el peso: ", "Insertando al Inicio", 3));
                            if((sexo.equals("m")||sexo.equals("M")||sexo.equals("masculino")||sexo.equals("Masculino")||
                                    sexo.equals("MASCULINO"))&&(edad>=18&&edad<=35)&&(estatura>=1.80&&estatura<=2.10)&&
                                    (peso<=80)){
                            do {
            try {
                opcion = JOptionPane.showInputDialog(null, "1.Agregar al inicio\n"
                        + "2.Agregar al final\n"
                        + "3.No guardar\n");
                       
                switch (opcion) {
                    case "1":
                         l.agregarAlInicio(numregistro, nombre, edad, sexo, estatura, peso);
                          JOptionPane.showMessageDialog(null, "El registro "+numregistro+" se guardo al inicio","Error",JOptionPane.INFORMATION_MESSAGE);
                          b=false;
                          break;
                    case "2":
                         l.agregarAlFinal(numregistro, nombre, edad, sexo, estatura, peso);
                           JOptionPane.showMessageDialog(null, "El registro "+numregistro+" se guardo al final","Error",JOptionPane.INFORMATION_MESSAGE);
                       b=false;
                           break;
                        
                    case "3":
                        JOptionPane.showMessageDialog(null, "No se guardo","Error",JOptionPane.INFORMATION_MESSAGE);
                        b=false;
                        break;
                             default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error" + e.getMessage());
            }
               } while (b);
                            }else{
                                JOptionPane.showMessageDialog(null, "Requisitos no cumplidos","Error",JOptionPane.INFORMATION_MESSAGE); 
                            }

                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "error" + n.getMessage());
                        }

                        break;
                    case "2":
                       l.mostrarLista();

                        break;
                    case "3":
                        numregistro = l.borrarDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + numregistro, "Elminado nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "4":
                       numregistro = l.borrarDelFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + numregistro, "Elminado nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "5":
                      numregistro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Elemento a Eliminar..", "Eliminando Nodos en especifico", JOptionPane.INFORMATION_MESSAGE));
                        if (l.estaEnLaLista(numregistro)) {
                            l.eliminar(numregistro);

                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + numregistro, "Elminado nodo en Especifico", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El elemento " + numregistro + " El elemento no esta en la lista", "Nodo  NO Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case "6":
                          numregistro = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Elemento a Buscar..", "Buscando Nodos en la lista", JOptionPane.INFORMATION_MESSAGE));
                        if (l.estaEnLaLista(numregistro) == true) {
                            JOptionPane.showMessageDialog(null, "El elemento " + numregistro + " Si esta en la lista", "Nodo Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El elemento " + numregistro + " no esta en la lista", "Nodo  NO Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case "7":
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error" + e.getMessage());
            }
        } while (!opcion.equals("7"));

    }

}
