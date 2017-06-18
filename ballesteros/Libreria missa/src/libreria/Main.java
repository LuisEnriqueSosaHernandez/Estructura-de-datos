package libreria;


import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int Venta = 0;
        String nombre = "";
        int numPag = 0;
        
        double precio = 0;
        String opcion = "";
        boolean b;
        Ventas v = new Ventas();
        do {
            try {
                opcion = JOptionPane.showInputDialog(null, "1.Venta\n"
                        + "2.Mostrar los elementos de las ventas importantes\n"
                        + "3.Eliminar el ultimo registro de venta\n"
                        + "4.Eliminar el primer registro de venta\n"
                        + "5.Eliminar una venta especifica\n"
                        + "6.Buscar una venta\n"
                        + "7.salir", "Menu de opciones\n", 0);
                         b=true;
                switch (opcion) {
                    case "1":
                        try {
                            Venta= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de venta: ", "Registrando", 0));
                            nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del libro: ", "Registrando", 0);
                            numPag = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de paginas: ", "Registrando", 0));
                           
                           precio=(numPag*0.20)+5;
                            if(numPag>300){
                                precio+=10;
                            do {
            try {
                opcion = JOptionPane.showInputDialog(null, "1.Agregar al inicio\n"
                        + "2.Agregar al final\n"
                        + "3.No guardar\n","Venta Importante",JOptionPane.OK_OPTION);
                       
                switch (opcion) {
                    case "1":
                         v.agregarAlInicio(Venta,nombre,numPag,precio);
                          JOptionPane.showMessageDialog(null, "El registro "+Venta+" se guardo al inicio Num.Venta: "+Venta +" Titulo: "+nombre+" Num.Paginas: "+numPag+" $"+precio,"OK",JOptionPane.INFORMATION_MESSAGE);
                          b=false;
                          break;
                    case "2":
                         v.agregarAlFinal(Venta,nombre,numPag,precio);
                           JOptionPane.showMessageDialog(null, "El registro "+Venta+" se guardo al final Num.Venta: "+Venta +" Titulo: "+nombre+" Num.Paginas: "+numPag+" $"+precio,"OK",JOptionPane.INFORMATION_MESSAGE);
                       b=false;
                           break;
                        
                    case "3":
                        JOptionPane.showMessageDialog(null, "Decidio no registrar  Num.Venta: "+Venta +" Titulo: "+nombre+" Num.Paginas: "+numPag+" $"+precio,"Error",JOptionPane.INFORMATION_MESSAGE);
                        b=false;
                        break;
                             default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de formato " + e.getMessage());
            }
               } while (b);
                            }else{
                                JOptionPane.showMessageDialog(null, "Requisitos no cumplidos venta no guardada :"+
                                        "Num.Venta: "+Venta +" Titulo: "+nombre+" Num.Paginas: "+numPag+" $"+precio,"Sin registro",JOptionPane.INFORMATION_MESSAGE);
                                       
                                
                            }

                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error de formato " + n.getMessage());
                        }

                        break;
                    case "2":
                        if(!v.LibreriaVacia()){
                       v.mostrarLibreria();
                        }else{
                             JOptionPane.showMessageDialog(null, "Libreria Vacia ","Error",0);
                        }
                        break;
                    case "3":
                        if(!v.LibreriaVacia()){
                        Venta = v.borrarInicio();
                        
                        JOptionPane.showMessageDialog(null, "La venta eliminada es: " + Venta, "Venta eliminada del inicio", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showMessageDialog(null, "Libreria Vacia ","Error",0);
                        }
                        break;
                    case "4":
                        if(!v.LibreriaVacia()){
                       Venta = v.borrarFinal();
                        JOptionPane.showMessageDialog(null, "La venta eliminada es: " + Venta, "Venta eliminada del final", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                             JOptionPane.showMessageDialog(null, "Libreria Vacia ","Error",0);
                        }
                        break;
                    case "5":
                        if(!v.LibreriaVacia()){
                      Venta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la venta a Eliminar", "Eliminando Venta", JOptionPane.INFORMATION_MESSAGE));
                        if (v.Existe(Venta)) {
                            v.eliminar(Venta);

                            JOptionPane.showMessageDialog(null, "La venta eliminada es: " + Venta, "Eliminando Venta", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La venta " + Venta+ " La venta no esta en el registro", "Venta no encontrada", JOptionPane.INFORMATION_MESSAGE);
                        }
                        }else{
                             JOptionPane.showMessageDialog(null, "Libreria Vacia ","Error",0);
                        }
                        break;
                    case "6":
                        if(!v.LibreriaVacia()){
                          Venta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa venta a Buscar", "Buscando venta en el registro", JOptionPane.INFORMATION_MESSAGE));
                        if (v.Existe(Venta) == true) {
                            JOptionPane.showMessageDialog(null, "La venta " + Venta + " Si esta en el registro", "Venta encontrada", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La venta" + Venta + " no esta en la lista", "Venta  no encontrada", JOptionPane.INFORMATION_MESSAGE);
                        }
                        }else{
                             JOptionPane.showMessageDialog(null, "Libreria Vacia ","Error",0);
                        }
                        break;
                    case "7":
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (!opcion.equals("7"));

    }

}
