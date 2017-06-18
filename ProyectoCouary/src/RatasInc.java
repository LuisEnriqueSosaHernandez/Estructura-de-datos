
import javax.swing.JOptionPane;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RatasInc {

    public static void main(String[] args) {
        Calendar c1 = GregorianCalendar.getInstance();
        int opcion = 0,opcion2=0, habitacion, personas;
        double costo=0.00;
        String nombre, fll, fs="";
        Logica logic = new Logica();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un registro\n"
                        + "2.Mostrar Habitaciones ocupadas\n"
                        + "3.Ver estado de una habitacion\n"
                        + "4.Eliminar un registro antes de tiempo\n"
                        + "5.Mostrar Habitaciones disponibles\n"
                        + "6.Supervisar Registros\n"
                        + "7.Salir\n"
                        + "Elige una opcion...", "Registro Hotel 'Ratas Inc'", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        boolean checada=true;
                        do{
                        habitacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el Numero de la habitacion", "Registrando", JOptionPane.QUESTION_MESSAGE));
                        }while(habitacion<=0||habitacion>=50);
                        if(!logic.estaVacio()){
                            if(logic.checarsiesta(habitacion)){
                                checada=false;
                                
                            }
                        }
                        if(checada){
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del del inquilino",
                                "Registrando", JOptionPane.QUESTION_MESSAGE);
                        personas = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el Numero de personas", "Registrando", JOptionPane.QUESTION_MESSAGE));
                        int dia = c1.get(Calendar.DAY_OF_MONTH);
                        int mes = c1.get(Calendar.MONTH);
                        int anio = c1.get(Calendar.YEAR);
                        
                        fll = c1.getTime().toLocaleString();
                        
                        JOptionPane.showMessageDialog(null, "La fecha de registro es: "+ fll, "warning", JOptionPane.INFORMATION_MESSAGE);
            do{
                opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                       
                         "1.Reservacion por dias\n"
                        + "2.Reservacion por meses\n"
                        + "3.Reservacion por años\n"
                        + "Elige una opcion...", "Tiempo de hospedaje", JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion2){
                    
                        case 1:
                          int day = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa los dias", "Registrando", JOptionPane.QUESTION_MESSAGE));
                          c1.add(Calendar.DAY_OF_MONTH,day);
                           fs = c1.getTime().toLocaleString();
                           costo=500*day;
                                   
                        break;
                            case 2:
                                int month = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa los meses", "Registrando", JOptionPane.QUESTION_MESSAGE));
                                c1.add(Calendar.MONTH, month);
                                 fs = c1.getTime().toLocaleString();
                                 costo=5000*month;
                        break;
                                case 3:
                                    int year = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa los años", "Registrando", JOptionPane.QUESTION_MESSAGE));
                                    c1.add(Calendar.YEAR,year);
                                     fs = c1.getTime().toLocaleString();
                                     costo=30000*year;
                        break;
                }
                }while(opcion2<=0||opcion2>3);
                
                 
                
               
                 JOptionPane.showMessageDialog(null, "La fecha de salida es: "+ fs, "warning", JOptionPane.INFORMATION_MESSAGE);
                  c1.set(anio, mes, dia);
                        logic.AgregarNodo(habitacion, nombre,personas,costo,fll,fs);
                        }else{
                             JOptionPane.showMessageDialog(null, "La habitacion ya esta ocupada", "warning", JOptionPane.INFORMATION_MESSAGE); 
                        }
                        break;
                    
                    case 2:
                        if (!logic.estaVacio()) {
                            logic.preOrden(logic.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "Todas las habitaciones estan disponibles", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    
                    case 3:
                        if (!logic.estaVacio()) {
                            habitacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el Numero del registro buscado", "Buscando", JOptionPane.QUESTION_MESSAGE));

                            if (logic.buscarNodo(habitacion) == null) {
                                JOptionPane.showMessageDialog(null, "La habitacion no esta ocupada", "warning", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,"Ocupada: "+logic.buscarNodo(habitacion), "Estado", JOptionPane.INFORMATION_MESSAGE); 
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Todas las habitaciones estan disponibles", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!logic.estaVacio()) {
                            habitacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el registro a eliminar", "Eliminando registro", JOptionPane.QUESTION_MESSAGE));

                            if (logic.eliminar(habitacion) == false) {
                                JOptionPane.showMessageDialog(null, "La habitacion no esta ocupada", "warning", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El registro ha sido eliminado", "Delete"
                                        + "", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Todas las habitaciones estan disponibles", "warning", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!logic.estaVacio()){
                            for(int i=1;i<=50;i++){
                                if(!logic.checarsiesta(i)){
                                 JOptionPane.showMessageDialog(null, "La habitacion: "+i+" Esta disponible", "warning", JOptionPane.INFORMATION_MESSAGE);   
                                }
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Todas las habitaciones estan disponibles", "warning", JOptionPane.INFORMATION_MESSAGE); 
                        }
                        break;
                    case 6:
                        logic.ChecarRegistros(logic.raiz);
                        JOptionPane.showMessageDialog(null, "Registros supervisados", "Fin", JOptionPane.INFORMATION_MESSAGE);
                                
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