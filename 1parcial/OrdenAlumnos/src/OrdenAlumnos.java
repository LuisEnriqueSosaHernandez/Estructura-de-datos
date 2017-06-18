/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class OrdenAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lista> list = new ArrayList<Lista>();
        Scanner l = new Scanner(System.in);
        int edad;
        boolean g = false;
        String sexo;
        String nombre;
        while (true) {
            while (true) {
                System.out.print("Sexo: ");
                sexo = l.nextLine();
                if (sexo.equals("@")) {
                    break;
                }
                if (sexo.equals("#")) {
                    g = true;
                    break;
                }
                System.out.print("Edad: ");
                edad = Integer.parseInt(l.nextLine());
                System.out.print("Nombre: ");
                nombre = l.nextLine();
                list.add(new Lista(sexo, edad, nombre));
            }
            Comparator<Lista> comparador = new Comparator<Lista>() {
                public int compare(Lista a, Lista b) {
                    int resultado = a.sexo().compareTo(b.sexo());
                    if (resultado != 0) {
                        return resultado;
                    }
                    resultado = Integer.compare(a.edad(), b.edad());
                    if (resultado != 0) {
                        return resultado;
                    }

                    resultado = a.nombre().compareTo(b.nombre());
                    return resultado;

                }

            };
            Collections.sort(list, comparador);
            for (int u = 0; u < list.size(); u++) {
                System.out.println(list.get(u).sexo + " " + list.get(u).edad + " " + list.get(u).nombre);
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

    String sexo;
    int edad;
    String nombre;

    public Lista(String sexo, int edad, String nombre) {
        this.sexo = sexo;
        this.edad = edad;
        this.nombre = nombre;

    }

    public String nombre() {
        return nombre;
    }

    public int edad() {
        return edad;
    }

    public String sexo() {
        return sexo;
    }

}