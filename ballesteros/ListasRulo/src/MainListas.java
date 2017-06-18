
import java.io.IOException;
import java.util.Scanner;

public class MainListas {

    public static void main(String[] args) throws IOException {
        Listas ls = new Listas();

        int opcion=-1;
        int dato,dato1;
        Scanner Leer = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        do {
       try{
            System.out.print("\n\t::::: Menu ::::::\n"
                    + "\n\t>>INSERTAR:"
                    + "\n\t 1.Al principio de la lista"
                    + "\n\t 2.Despues de una referencia"
                    + "\n\t 3.Al final de la lista"
                    + "\n\t 4.Antes de una referencia"
                    + "\n\n\t>>ELIMINAR:"
                    + "\n\t 5.El primer dato"
                    + "\n\t 6.Despues de una referencia dada"
                    + "\n\t 7.Misma Referencia"
                    + "\n\t 8.Antes de una referencia"
                    + "\n\t 9.Dato final "
                    + "\n\n\t 10.Mostrar Lista"
                     + "\n\n\t 11.Numeros pares"
                     + "\n\n\t 12.Numeros impares"
                     + "\n\n\t 13.Numeros primos"
                    + "\n\n\t 14.Promedio pares"
                     + "\n\n\t 15.Promedio impares"
                    + "\n\n\t 16.Promedio primos"
                    + "\n\t 17. Salir"
                    + "\nSeleccione su opcion: \t");
            
            opcion = s.nextInt();
            

            switch (opcion) {
                case 1: {
                    
                    ls.insertarAlPrincipio();
                    break;
                }
                case 2: {
                    if (!ls.LSLVacia()) {
                        System.out.print("\n Inserte el numero como referencia\t");
                        dato1 = Leer.nextInt();
                        ls.insertarDespuesDe(dato1);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Ingrese el numero:\t");
                    dato = Leer.nextInt();
                    ls.insertarEnOrden(dato);
                    break;
                }
                case 4: {
                    if (!ls.LSLVacia()) {
                        System.out.print("\n Inserte el numero como referencia\t");
                        dato1 = Leer.nextInt();
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
                        System.out.println("Ingrese la referencia. El numero despues de esta referencia se eliminara: ");
                        dato = Leer.nextInt();
                        ls.eliminarDespuesDe(dato);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                case 7: {
                    if (!ls.LSLVacia()) {
                        System.out.println("Ingrese el numero de referencia a eliminar:\t");
                        dato = Leer.nextInt();
                        ls.retirar(dato);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                case 8: {
                    if (!ls.LSLVacia()) {
                        System.out.print("\n Inserte el numero como referencia\t");
                        dato1 = Leer.nextInt();
                        ls.eliminarAntesDe(dato1);
                    } else {
                        System.out.println("Esta lista no tiene nodos");
                    }
                    break;
                }
                case 9: {
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
                    System.out.println("Numeros pares");
                    ls.numerospares();
                    break;
                }
                case 12:{
                    System.out.println("Numeros impares");
                    ls.numerosimpares();
                    break;
                }
                case 13:{
                    System.out.println("Promedio primos");
                    ls.numerosprimos();
                    break;
                }
                case 14:{
                    System.out.println("Promedio Pares");
                    ls.promedionumerospares();
                    break;
                }
                case 15:{
                    System.out.println("Promedio Impares");
                    ls.promedionumerosimpares();
                    break;
                }
                case 16:{
                     System.out.println("Promedio primos");
                     ls.promedioprimos();
                    break;
                }

                case 17: {
                    System.out.println("Programa Finalizado");
                    
                    System.exit(0);
                }
                default:
                    System.out.println("Opcion Incorrecta ");
                    break;
            }
         }catch(Exception n){
                System.out.println("Error de formato ");
                s.next();
           }
       
        } while (opcion != 0);
        
    }
}
