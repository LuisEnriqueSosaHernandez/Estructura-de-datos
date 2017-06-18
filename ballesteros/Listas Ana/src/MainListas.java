
import java.io.IOException;
import java.util.Scanner;

public class MainListas {
     public static void main(String[] args) throws IOException {
        Listas ls = new Listas();
        
        int opcion;
        String opcion2;
        String dato, dato1;
        Scanner Leer = new Scanner (System.in);
        Scanner s = new Scanner(System.in);
        do {
                    
            System.out.print("\n\t::::: Menu ::::::\n"
                    +"\n\t>>INSERTAR:"
                    + "\n\t 1.Al principio de la lista"
                    + "\n\t 2.Despues de una referencia"
                    + "\n\t 3.Al final de la lista"
                    + "\n\t 4.Antes de una referencia"   
                     +"\n\n\t>>ELIMINAR:"
                    + "\n\t 5.El primer dato"
                    + "\n\t 6.Despues de una referencia dada"
                    + "\n\t 7.Misma Referencia"
                    + "\n\t 8.Antes de una referencia"
                    + "\n\t 9.Dato final "
                    + "\n\n\t 10.Mostrar Lista"
                    + "\n\t 11. Salir"
                    + "\nSeleccione su opcion: \t");
            opcion = s.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese el nombre:\t");
                    dato = Leer.nextLine();
                    ls.insertarAlPrincipio(dato);
                    break;
                }
                case 2: {
                   if (!ls.LSLVacia()) {
                         System.out.print("\n Inserte el Nombre como referencia\t");
                    dato1 = Leer.nextLine();
                    ls.insertarDespuesDe(dato1);                 
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }                  
                    break;
                }
                 case 3:{
                    System.out.print("Ingrese el nombre:\t");
                    dato = Leer.nextLine();
                    ls.insertarEnOrden(dato);
                    break;
                }
                case 4: {
                  if (!ls.LSLVacia()) {
                        System.out.print("\n Inserte el Nombre como referencia\t");
                        dato1 = Leer.nextLine();
                        ls.insertarAntesDe(dato1);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }  
                    break;
                }
                case 5: {
                    if (!ls.LSLVacia()) {
                                ls.retiraAlPrincipio();                       
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }                   
                case 6: {
                    if (!ls.LSLVacia()) {
                        System.out.println("Ingrese la referencia. El Nombre despues de esta referencia se eliminara: ");
                        dato = Leer.nextLine();
                        ls.eliminarDespuesDe(dato);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                case 7: {
                    if (!ls.LSLVacia()) {
                        System.out.println("Ingrese el Nombre de referencia a eliminar:\t");
                        dato = Leer.nextLine();
                        ls.retirar(dato);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                case 8:{
                    if (!ls.LSLVacia()) {
                        System.out.print("\n Inserte el Nombre como referencia\t");
                    dato1 = Leer.nextLine();
                    ls.eliminarAntesDe(dato1);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                 case 9:{
                    if (!ls.LSLVacia()) {
                                ls.retiraAlFinal();
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                  
                case 10: {
                    System.out.println("\nLista:\n");
                    ls.recorrer();
                    break;
                }
                
                case 11:{
                    System.out.println("Nos vemos en el siguiente semestre!!!!!");
                    System.exit(0);
                }
            }
        } while (opcion != 0);
    }
}

