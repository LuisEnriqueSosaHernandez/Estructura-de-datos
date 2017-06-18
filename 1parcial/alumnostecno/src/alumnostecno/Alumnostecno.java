/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnostecno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Alumnostecno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lista> list = new ArrayList<Lista>();
        Scanner l = new Scanner(System.in);
        int semestre;
        boolean g = false;
        String carrera;
        String nombre;
        while (true) {
            while (true) {
                System.out.print("Carrera: ");
                carrera = l.nextLine();
                if (carrera.equals("@")) {
                    break;
                }
                if (carrera.equals("#")) {
                    g = true;
                    break;
                }
                System.out.print("Semestre: ");
                semestre = Integer.parseInt(l.nextLine());
                System.out.print("Nombre: ");
                nombre = l.nextLine();
                list.add(new Lista(carrera, semestre, nombre));
            }
            Comparator<Lista> comparador = new Comparator<Lista>() {
                public int compare(Lista a, Lista b) {
                    int resultado = a.carrera().compareTo(b.carrera());
                    if (resultado != 0) {
                        return resultado;
                    }
                    resultado = Integer.compare(a.semestre(), b.semestre());
                    if (resultado != 0) {
                        return resultado;
                    }

                    resultado = a.nombre().compareTo(b.nombre());
                    return resultado;

                }

            };
            Collections.sort(list, comparador);
            for (int u = 0; u < list.size(); u++) {
                System.out.println(list.get(u).carrera + " " + list.get(u).semestre + " " + list.get(u).nombre);
            }
            if (g) {
                break;

            }
            System.out.println("@");
            list.clear();
        }

    }
}

class Lista {

    String carrera;
    int semestre;
    String nombre;

    public Lista(String carrera, int semestre, String nombre) {
        this.carrera = carrera;
        this.semestre = semestre;
        this.nombre = nombre;

    }

    public String nombre() {
        return nombre;
    }

    public int semestre() {
        return semestre;
    }

    public String carrera() {
        return carrera;
    }

}
