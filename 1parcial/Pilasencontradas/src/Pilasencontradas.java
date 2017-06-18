
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
public class Pilasencontradas {

    int vectorPila[];
    int cima;
    int cima2;

    int tamaniopila1;

    public Pilasencontradas(int tamanio1) {
        cima = 0;

        tamaniopila1 = tamanio1;

        
        vectorPila = new int[tamanio1 ];
        cima2 = vectorPila.length-1;
    }

    public void meter(int s, int dato) {
        if (s == 1) {
            vectorPila[cima] = dato;
            cima++;
        } else {
            vectorPila[cima2] = dato;
            cima2--;
        }
    }

    public void sacar(int s) {
        if (s == 1) {
            System.out.println(vectorPila[cima - 1]);
            cima--;
        } else {
            System.out.println(vectorPila[cima2 + 1]);
            cima2++;
        }
    }

    public boolean estaVacia(int s) {
        if (s == 1) {

            return cima == 0;
        } else {

            return (cima2 == vectorPila.length - 1);
        }
    }

    public boolean estallena(int s) {
        if (s == 1) {
            return cima >=cima2;
        } else {

            return (cima2 <= cima-1);
        }
    }

    public void mostrar() {
        for (int i = 0; i < vectorPila.length; i++) {
            System.out.println(vectorPila[i]);
        }
    }
    //1 2 3 6 5 4

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        System.out.println("Dame el tamanio de la pila");

        int tamanio = l.nextInt();
        int s, dato, a;
        Pilasencontradas pila = new Pilasencontradas(tamanio);
        do {
            for (int i = 0; i < 7; i++) {
                System.out.print("- * ");
            }
            System.out.println();
            System.out.println("*  Que quieres hacer?     *");
            System.out.println("-  1.Meter dato en pila1  -");
            System.out.println("*  2.Meter dato en pila2  *");
            System.out.println("-  3.Sacar dato pila1     -");
            System.out.println("*  4.Sacar dato pila2     *");
            System.out.println("-  5.Mostrar pila         -");
            System.out.println("*  6.Salir                *");
            for (int i = 0; i < 7; i++) {
                System.out.print("- * ");
            }
  System.out.println();
            a = l.nextInt();
            switch (a) {
                case 1:

                    s = 1;
                    if (!pila.estallena(s)) {
                        System.out.println("Ingresa dato");
                        dato = l.nextInt();

                        pila.meter(s, dato);
                    } else {
                        System.out.println("Esta llena");
                    }
                    break;
                case 2:
                    s = 2;
                    if (!pila.estallena(s)) {
                        System.out.println("Ingresa dato");
                        dato = l.nextInt();
                        pila.meter(s, dato);
                    } else {
                        System.out.println("Esta llena");
                    }
                    break;
                case 3:

                    s = 1;
                    if (!pila.estaVacia(s)) {
                        System.out.println("El dato sacado de la pila1 es: ");
                       pila.sacar(s);
                    } else {
                        System.out.println("Esta vacia");
                    }
                    break;
                case 4:
                    s = 2;
                    if (!pila.estaVacia(s)) {
 System.out.println("El dato sacado de la pila2 es: ");
                        pila.sacar(s);
                    } else {
                        System.out.println("Esta vacia");
                    }

                    break;
                case 5:
                    pila.mostrar();

                    break;
                case 6:

                    System.out.print("F");
                    Thread.sleep(400);
                    System.out.print("I");
                   Thread.sleep(400);
                    System.out.print("N");
                    Thread.sleep(400);
                    System.out.print("A");
                    Thread.sleep(400);
                    System.out.print("L");
                    Thread.sleep(400);
                    System.out.print("I");
                    Thread.sleep(400);
                    System.out.print("Z");
                   Thread.sleep(400);
                    System.out.print("A");
                    Thread.sleep(400);
                    System.out.print("D");
                   Thread.sleep(400);
                    System.out.print("O");
                    Thread.sleep(400);
                    
                        
                        System.out.print(".");
                       Thread.sleep(400);
                       System.out.print(".");
                       Thread.sleep(400);
                       System.out.print(".");
                       Thread.sleep(400);
                    
                    System.out.println();
                    Thread.sleep(400);
                    
                    
                    
                    break;
            }
        } while (a != 6);
    }

}
