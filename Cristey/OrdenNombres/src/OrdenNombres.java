

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class OrdenNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lista> list = new ArrayList<Lista>();
        Scanner l = new Scanner(System.in);
 
        boolean g = false;
        
        String nombre;
        
            while (true) {
                System.out.println("Nombre: Para detener ingresa '@' ");
                nombre = l.nextLine();
                if (nombre.equals("@")) {
                    break;
                }
         
                list.add(new Lista(nombre));
            }
            Comparator<Lista> comparador = new Comparator<Lista>() {
                public int compare(Lista a, Lista b) {
                    int resultado = b.nombre().compareTo(a.nombre());
                    return resultado;

                }

            };
            Collections.sort(list, comparador);
            for (int u = 0; u < list.size(); u++) {
                System.out.println(list.get(u).nombre);
            }
            System.out.println("@");
            list.clear();
        }

    }

class Lista {
    String nombre;

    public Lista(String nombre) {
     
        this.nombre = nombre;

    }

    public String nombre() {
        return nombre;
    }

}
