/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class AlgoritmoDeOrdenamiento {

    int i, j, temporal, pasadas;

    public AlgoritmoDeOrdenamiento() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
        this.pasadas = 0;
    }

    //Metodo burbuja version 1

    public void burbuja1(int[] arreglo) {
        pasadas = 0;
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en " + pasadas + " pasadas");
    }

    //Metodo burbuja version 2
    public void burbuja2(int[] arreglo) {
        pasadas = 0;
        for (i = 1; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Termino en " + pasadas + " pasadas");
    }

    //Metodo Radix

    public void radix(int[] arreglo) {
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++) {
                boolean mover = arreglo[i] << x >= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[i];
                    j++;
                } else {
                    arreglo[i - j] = arreglo[i];
                }

            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = arreglo[i - j];
            }
            arreglo = auxiliar;
        }
        System.out.println("El arreglo ordenado con radix es: ");
        mostrarArreglo(arreglo);
    }

    //Metodo quicksort

    public void quick(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo) / 2];
        System.out.println("El pivote es: " + pivote);
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            //Aqui hacemos el intercambio
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quick(arreglo, primero, j);
        }
        if (i < ultimo) {
            quick(arreglo, i, ultimo);
        }
        mostrarArreglo(arreglo);
    }

    //algoritmo de ordenamiento por insercion

    public void insercion(int[] arreglo, int n) {
        int i, j, aux;
        for (i = 1; i < n; i++) {
            aux = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        System.out.println("Arreglo ordenado por insercion");
        mostrarArreglo(arreglo);
    }

    //Algoritmo de ordenamiento shell

    public void shell(int[] arreglo) {
        int salto, i, j, k, auxiliar;
        salto = arreglo.length / 2;
        while (salto > 0) {
            for (i = salto; i < arreglo.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k]) {
                        j = -1;
                    } else {
                        auxiliar = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = auxiliar;
                        j -= salto;
                    }
                }
            }
            salto /= 2;
        }
        System.out.println("Ordenado por shell");
        mostrarArreglo(arreglo);
    }

    //Ordenamiento de dos arreglos por intercalacion guardados en un tercero

    public void intercalacion(int[] arregloA, int[] arregloB) {
        int i, j, k;
        int[] arregloC = new int[arregloA.length + arregloB.length];
        //Repetir mientras los Arreglos tengan elementos que comparar
        for (i = j = k = 0; i < arregloA.length && j < arregloB.length; k++) {
            if (arregloA[i] < arregloB[j]) {
                arregloC[k] = arregloA[i];
                i++;
            } else {
                arregloC[k] = arregloB[j];
                j++;
            }
        }
        //Para anadir los elementos del arreglo A sobrantes en caso de haberlos
        for (; i < arregloA.length; i++, k++) {
            arregloC[k] = arregloA[i];
        }
        //Para anadir los elementos del arreglo B sobrantes en caso de haberlos
        for (; j < arregloB.length; j++, k++) {
            arregloC[k] = arregloB[j];
        }
        mostrarArreglo(arregloC);
    }

    //Algoritmo de ordenamiento por mezcla directa

    public int[] mezclaDirecta(int[] arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];
            //Copiando los elementos  de la parte primera al arreglo izquierdo
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            //cOPIANDO los elementos de la parte segunda arregloDer
            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            //Recursividad
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            i = 0;
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            //Arreglo Final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }

        }
        //Fin del if
        return arreglo;
    }

    //Metodo mezcla natural

    public void mezclaNatural(int arreglo[]) {
        int izquierda = 0, izq = 0, derecha = arreglo.length - 1, der = derecha;
        boolean ordenado = false;
        do {
            ordenado = true;
            izquierda = 0;
            while (izquierda < derecha) {
                izq = izquierda;
                while (izq < derecha && arreglo[izq] <= arreglo[izq + 1]) {
                    izq++;
                }
                der = izq + 1;
                while (der == derecha - 1 || der < derecha && arreglo[der] <= arreglo[der + 1]) {
                    der++;
                }
                if (der <= derecha) {
                    mezclaDirecta2(arreglo);
                    ordenado = false;
                }
                izquierda = izq;
            }
        } while (!ordenado);
    }

    //Ordenamiento de mezcla natural

    public void mezclaDirecta2(int[] arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];
            //Copiando los elementos  de la parte primera al arreglo izquierdo
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            //cOPIANDO los elementos de la parte segunda arregloDer
            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            //Recursividad
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            i = 0;
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }
            //Arreglo Final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }

        }
        //Fin del if

    }

    //Metodo de busqueda secuencial

    public int busquedaSecuencial(int arreglo[], int elemento) {
        int i;
        boolean encontrado = false;
        for (i = 0; i < arreglo.length && encontrado == false; i++) {
            if (elemento == arreglo[i]) {
                encontrado = true;
                return i;
            }
        }
        return -1;

    }

    //Busqueda binaria

    public int busquedaBinaria(int arreglo[], int elemento) {
        int centro, primero, ultimo, valorCentro;
        primero = 0;
        ultimo = arreglo.length - 1;
        while (primero <= ultimo) {
            centro = (primero + ultimo) / 2;
            valorCentro = arreglo[centro];
            System.out.println("Comparando a " + elemento + " con " + arreglo[centro]);
          if(elemento==valorCentro){
              return centro;
          }else if(elemento<valorCentro){
              ultimo=centro-1;//Desplazarse hacia la izquierda
          }else{
              primero=centro+1;//Desplazamos hacia la derecha
              
          }
        }
        return -1;
    }
//Mostrar los datos del vector

    public void mostrarArreglo(int[] arreglo) {
        int k = 0;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "]");

        }
        System.out.println("");
    }

}
