/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Censo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lista> list = new ArrayList<Lista>();
        Scanner l = new Scanner(System.in);
        int semestre;
        boolean g = false;
        String carrera;
        String sexo;
       
            while (true) {
                System.out.println("Carrera: /Para mostrar datos inserte @");
                carrera = l.nextLine();
                if (carrera.equals("@")) {
                    break;
                }
                System.out.print("Sexo: ");
                sexo =l.nextLine();
                System.out.print("Semestre: ");
                semestre = Integer.parseInt(l.nextLine());
                list.add(new Lista(carrera, sexo, semestre));
            }
            for (int u = 0; u < list.size(); u++) {
                System.out.println(list.get(u).carrera + " " + list.get(u).sexo + " " + list.get(u).semestre);
            }
        }

    }


class Lista {

    String carrera;
    String sexo;
    int semestre;
    

    public Lista(String carrera, String sexo, int semestre) {
        this.carrera = carrera;
        this.sexo = sexo;
        this.semestre = semestre;
 
    }

    public String sexo() {
        return sexo;
    }

    public int semestre() {
        return semestre;
    }

    public String carrera() {
        return carrera;
    }

}
