
import java.util.Scanner;
public class Listas {
Scanner miEntrada= new Scanner(System.in);

    int num;
    Scanner Leer = new Scanner (System.in);
    Scanner s = new Scanner(System.in);
        
    NodoLista inicio, fin;
  

    public void Lista() {
        inicio = null;
        fin = null;
    }

    public void insertarAlPrincipio() {
        NodoLista p = new NodoLista();
        
           
            pedirDatos();

            p.num=num;
        
        
            
            if(num>0){
        if (LSLVacia()) {      
            inicio = fin = p;
        } else {
            p.next = inicio;
            inicio = p;
        }
            }else{
                System.out.println("El numero es negativo o no es divisible entre 4");
            }
       
    }

    public void insertarDespuesDe(int dd) {
        NodoLista anterior = inicio;
        boolean encontrado = false;
        
        

        while (anterior != null) {
            if (dd==anterior.num) {
                encontrado = true;
                break;
            }
            anterior = anterior.next;
        }

        if (encontrado) {
           
            
            pedirDatos();
            NodoLista aux = new NodoLista();
            
            
            aux.num = num;
             
       
       
        if(num>0){

            aux.next = anterior.next;
            anterior.next = aux;

            if (aux.next == null) {
                fin = aux;
            } else {
            }
        }else{
            System.out.println("El numero es negativo o no es divisible entre 4");
        }
        } else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
    }
    
    public void insertarAntesDe(int dd){
    
    NodoLista anterior = inicio;
    NodoLista anterior2 = inicio;
        
        boolean encontrado = false;
        boolean band=true;
        int cont = 0;
        
            while (anterior != null&&band) {
                if (dd==anterior.num) {
                    encontrado = true;
                    //band =false;
              
                    if(cont==0){
                   /*System.out.println("Su registro de referencia se encuentra en el primer lugar es recomendable Usar la Opcion [1]");
                   band = false;*/
                    System.out.print("Ingrese el titulo:\t");
                   
                    NodoLista p = new NodoLista();
                   
                    pedirDatos();
                    p.num=num;
                     
                   
                    
                    if(num>0){
                    p.next = inicio;
                    inicio = p;  
                    }
                    else{
                        System.out.println("El numero es negativo o no es divisible entre 4");
                    }
                    band = false;
                    }
                    
                    break;
                }
                anterior = anterior.next;
               if(cont>0){
               anterior2=anterior2.next;
               } 
                
                cont++;
            }
            
        
if(band){
        if (encontrado) {
          
            pedirDatos();
            NodoLista aux = new NodoLista();
            
            
            aux.num= num;
             
       
        
        if(num>0){
            
            aux.next = anterior2.next;
            anterior2.next = aux;

            if (aux.next == null) {
                fin = aux;}
        }else{
            System.out.println("El numero es negativo y no es divisible entre 4");
        }
        }else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
}
    }

    public void eliminarDespuesDe(int dd) {
        NodoLista anterior = inicio;
        
        boolean encontrado = false;

        while (anterior != null) {
            if (dd==anterior.num) {
                encontrado = true;
                break;
            }
            anterior = anterior.next;
        }

        if (encontrado) {
            anterior = anterior.next;
            if (anterior != null) {
                this.retirar(anterior.num);
            } else {
                System.out.println("Su referencia esta al final es imposible eliminar.");
            }
        } else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
    }
    
    public void eliminarAntesDe(int dd){
    NodoLista anterior = inicio;
    NodoLista anterior2 = inicio;
      
    
    boolean encontrado = false;
        boolean band =true ;
        int cont=0;
        
       
         while (anterior != null&&band) {
                if (dd==anterior.num) {
                    encontrado = true;
              
                    if(cont==0){
                   System.out.println("Su Registro de referencia se encuentra en el primer lugar, no es posible Eliminar]");
                   band = false;
                    }
                    break;
                }
                
                anterior = anterior.next;
               
                if(cont>0){
               anterior2=anterior2.next;
               } 
                
                cont=cont+1;
            }
        
        
        if(band){
        if (encontrado) {
            //anterior2 = anterior2.next;
            if (anterior2 != null) {
                this.retirar(anterior2.num);
            } else {
                System.out.println("No hay datos");
            }
        } else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
        }
    
    }

    public void insertarEnOrden(int dd) {
        NodoLista aux = new NodoLista();
       
       
        aux.num=dd;
        
        
        
        if (LSLVacia()) {
            inicio = fin = aux;
        } else {
            NodoLista ant = null;
            NodoLista act = inicio;
            boolean encontrado = false;

            while (act != null) {
                if (dd == 0? (act.num) != 0: dd!=act.num) {
                
                } else {
                    encontrado = true;
                    break;
                }
                ant = act;
                act = act.next;
            }
            if (encontrado) {
                if (act == inicio) {
                    aux.next = inicio;
                    inicio = aux;
                } else {
                    aux.next = ant.next;
                    ant.next = aux;
                }
            } else {
                aux.next = null;
                ant.next = aux;
                fin = aux;
            }
        }
    }

    public void insertarAlFinal(int dd) {
        NodoLista aux = new NodoLista();
        
         aux.num=num;
       
       
        if(num>0){
        if (LSLVacia()) {
            inicio = fin = aux;
        } else {
            fin.next = aux;
            fin = aux;
        }
        }
    }
    
    public int retiraAlPrincipio() {
        int dd=0;
        if (!LSLVacia()) {
            System.out.println("\nEl Registro "+inicio.num+ " fue Eliminado");
            dd = inicio.num;
            inicio = inicio.next;

            if (inicio == null) {
                fin = null;
            }
        } else {
            System.out.println("Lista sin Registros");
        }
        return dd;
    }

    public int retiraAlFinal() {
        int dd = 0;

        if (!LSLVacia()) {
            System.out.println("\nEl Registro "+fin.num+" fue Eliminado");
            dd = fin.num;
            if (inicio == fin) {
                inicio = fin = null;
                return dd;
            }

            NodoLista ant = inicio;
            NodoLista act = inicio.next;

            while (act != fin) {
                ant = act;
                act = act.next;
            }
            ant.next = null;
            fin = ant;
            act = null;
        } else {
            System.out.println("Listas sin datos");
        }
        return dd;
    }

    public void retirar(int dd) {
        if (!LSLVacia()) {
            NodoLista ant = null;
            NodoLista act = inicio;
            boolean encontrado = false;

            while (act != null) {
                if (dd==act.num) {
                    encontrado = true;
                    break;
                } else {
                    ant = act;
                    act = act.next;
                }
            }

            if (!encontrado) {
                System.out.println("no existe la referencia");
            } else {
                if (inicio == fin) {
                    inicio = fin = act = null;
                } else if (act == inicio) {
                    inicio = inicio.next;
                    act = null;
                } else if (act == fin) {
                    ant.next = null;
                    fin = ant;
                    act = null;
                } else {
                    ant.next = act.next;
                    act = null;
                }
                System.out.println("Dato " + dd + " fue eliminado");
            }
        } else {
           System.out.println("Lista sin Datos");
        }
    }

    public void recorrer() {
        String imprime = "";
        
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                imprime="numero: "+ aux.num;
                aux = aux.next;
                System.out.println(imprime);
            }
           
        }
    }
    public void numerospares() {
       
        int cont=0;
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                if(aux.num%2==0){
                    System.out.println(aux.num);
                
                cont++;
                }
                aux = aux.next;
            }
            System.out.println("Son "+cont+" numeros pares");
           
        }
    }
   public void numerosimpares() {
       
        int cont=0;
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                if(aux.num%2!=0){
                    System.out.println(aux.num);
                
                
                cont++;
                }
                aux = aux.next;
            }
            System.out.println("Son "+cont+" numeros impares");
           
        }
    }
    public void promedionumerospares() {
       double promedio=0;
        
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                if(aux.num%2==0){
                    promedio+=aux.num;
                
                }
                aux = aux.next;
                
            }
            System.out.println("El promedio de los pares es "+promedio);
           
        }
    }
    public void promedionumerosimpares() {
       double promedio=0;
        
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                if(aux.num%2!=0){
                    promedio+=aux.num;
               
                
                }
                 aux = aux.next;
            }
            System.out.println("El promedio de los impares es "+promedio);
           
        }
    }
    public void buscar(int dd){
    NodoLista buscador = inicio;
    boolean encontrado=false;
        while (buscador != null) {
            if (dd==buscador.num) {
                encontrado = true;
                break;
            }
            buscador = buscador.next;
        }

        if (encontrado) {
        String imprime;
       imprime="Numero: "+ buscador.num;
            System.out.println("\n-----Datos Encontrados------\n"+imprime);
        }else{
            System.out.println("\n\tDatos no encontrado\n");
        }
    }

    public boolean LSLVacia() {
        return (inicio == null);
    }
    public void numerosprimos() {
       
        int cont=0;
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                if(esPrimo(aux.num)==true){
                    System.out.println(aux.num);
                cont++;
                }
                
                aux = aux.next;
                
            }
            
             System.out.println("Son "+cont+" numeros primos");
        }
    }
      public void promedioprimos() {
       double promedio=0;
        
        
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                if(esPrimo(aux.num)==true){
                    promedio+=aux.num;
                }
                aux = aux.next;
                
                
            }
            System.out.println("El promedio de los numeros primos es "+promedio);
           
        }
    }
    
    public static boolean esPrimo(int numero){
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
      primo = false;
    contador++;
  }
  return primo;
}
   public void pedirDatos(){
    boolean band=false;
    boolean band2=true;
    
 
    System.out.print("Ingrese el numero   \t");
    num=miEntrada.nextInt();
    
    
    
    
  }
}


