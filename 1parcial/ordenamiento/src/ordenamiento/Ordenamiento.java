/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long inicio, fin, tiempo;
        int a = 0, tamanio = 0;
        boolean error = false;
        String s = "si";

        burbujamejorada obj = new burbujamejorada();

        do {
            do {
                try {
                    error = false;
                    tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "De que tamanio quieres el arreglo", "Solicitando el tamanio",
                            JOptionPane.INFORMATION_MESSAGE));
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                    error = true;
                }
            } while (error);

            float[] arreglo = new float[tamanio];
            Random x = new Random();
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = x.nextFloat() * 100000 + 0;
            }

            do {
                try {

                    a = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1.Usar shell\n"
                            + "2.Usar burbuja\n"
                            + "3.Usar burbuja 2\n"
                            + "4.Usar sort\n"
                            + "5.Cambiar tamanio\n"
                            + "6.Salir\n"
                            + "Que deseas hacer?", "Menu de opciones",
                            JOptionPane.INFORMATION_MESSAGE));
                    switch (a) {
                        case 1:
                            s = "si";
                            inicio = System.currentTimeMillis();
                            arreglo = obj.shell(arreglo);
                            fin = System.currentTimeMillis();

                            tiempo = fin - inicio;
                            obj.imprimir(arreglo);

                            System.out.println("\nTiempo shell " + tiempo);
                            break;
                        case 2:
                            inicio = System.currentTimeMillis();
                            arreglo = obj.burbuja(arreglo);
                            fin = System.currentTimeMillis();

                            tiempo = fin - inicio;
                            obj.imprimir(arreglo);
                            System.out.println("\nTiempo burbuja " + tiempo);
                            break;
                        case 3:
                            inicio = System.currentTimeMillis();
                            arreglo = obj.burbuja2(arreglo);
                            fin = System.currentTimeMillis();

                            tiempo = fin - inicio;
                            obj.imprimir(arreglo);
                            System.out.println("\nTiempo burbuja 2 " + tiempo);
                            break;
                        case 4:
                            inicio = System.currentTimeMillis();
                            arreglo = obj.sort(arreglo);
                            fin = System.currentTimeMillis();

                            tiempo = fin - inicio;
                            obj.imprimir(arreglo);
                            System.out.println("\nTiempo sort " + tiempo);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Cambiar tamanio arreglo", "Modificando", JOptionPane.INFORMATION_MESSAGE);

                            break;

                           
                        case 6:
                            JOptionPane.showMessageDialog(null, "Fin", "Aplicacion finalizada", JOptionPane.INFORMATION_MESSAGE);
                            s = "no";

                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Opcion Incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Error " + n.getMessage());

                }
            } while (a != 5 && a != 6);

            /*for(int i=0;i<arreglo.length;i++){
             System.out.println(arreglo[i]);
             }*/
        } while (s.equals("si"));
    }

}
