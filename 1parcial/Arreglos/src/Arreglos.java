
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("almacena 7 datos dobles usando asignacion");
       double x[]=new double[7];
       x[0]=0.0;
       x[1]=1.0;
       x[2]=2.0;
       x[3]=3.0;
       x[4]=4.0;
       x[5]=5.0;
       x[6]=6.0;
       System.out.println("Datos almacenados");
     System.out.println("lee 14 datos flotantes y los almacena en arreglo");
     Scanner l=new Scanner(System.in);
     float y[]=new float[14];
     for(int i=0;i<y.length;i++){
         System.out.println("Ingresa el valor de la posicion["+i+"]");
         y[i]=l.nextInt();
     }
     System.out.println("imprime los datos del inciso a en una columna");
     metodos m=new metodos();
     m.imprimea(x);
     //salto de linea
     System.out.println();
     //
     m.imprimeb(y);
     //salto de linea
     System.out.println();
     System.out.println("Buscar un elemento en el arreglo");
     System.out.println("En que arreglo quieres buscar? 1 o 2?, no buscar 3");
     int a=l.nextInt();
    while(a!=3){
        switch(a){
            case 1:
         System.out.println("Ingresa el numero a buscar");
         double valor=l.nextDouble();
        System.out.println(m.buscarnormal(valor, x));
         break;
            case 2:
             System.out.println("Ingresa el numero a buscar");
         float valor2=l.nextFloat();
        System.out.println( m.buscarnormal2(valor2, y));
        break;
        default:
        System.out.println("opcion incorrecta");
        break;
        }
        System.out.println("En que arreglo quieres buscar? 1 o 2?, no buscar 3");
        a=l.nextInt();
    } 
    System.out.println("Busqueda binaria o busqueda mas rapida");
     System.out.println("En que arreglo quieres buscar? 1 o 2?, no buscar 3");
     int c=l.nextInt();
    while(c!=3){
        switch(c){
            case 1:
         System.out.println("Ingresa el numero a buscar");
         double valor=l.nextDouble();
        System.out.println(m.busquedaBinaria(x, valor));
         break;
            case 2:
             System.out.println("Ingresa el numero a buscar");
         float valor2=l.nextFloat();
        System.out.println( m.busquedaBinaria2(y, valor2));
        break;
        default:
        System.out.println("opcion incorrecta");
        break;
        }
         System.out.println("En que arreglo quieres buscar? 1 o 2?, no buscar 3");
         c=l.nextInt();
    } 
    }
    
}
