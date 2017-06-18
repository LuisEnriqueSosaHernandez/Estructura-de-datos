
import java.util.Scanner;
public class Listas {
Scanner miEntrada= new Scanner(System.in);

    int numpag;
    
    
    String nombre;
    
    double precio=0;  
    Scanner Leer = new Scanner (System.in);
    Scanner s = new Scanner(System.in);
        
    NodoLista inicio, fin;
  

    public void Lista() {
        inicio = null;
        fin = null;
    }

    public void insertarAlPrincipio(String dd) {
        NodoLista p = new NodoLista();
        
            p.titulo= dd;
            pedirDatos();

            p.numpag=numpag;
        
        
            p.precio=precio;
            if(numpag>=300){
        if (LSLVacia()) {      
            inicio = fin = p;
        } else {
            p.next = inicio;
            inicio = p;
        }
            }else{
                System.out.println("El libro tiene menos de 301 paginas, no se registro");
            }
       
    }

    public void insertarDespuesDe(String dd) {
        NodoLista anterior = inicio;
        boolean encontrado = false;
        
        

        while (anterior != null) {
            if (dd.equals(anterior.titulo)) {
                encontrado = true;
                break;
            }
            anterior = anterior.next;
        }

        if (encontrado) {
            System.out.println("Ingresa el titulo:\t"); 
            String dd2= miEntrada.next();
            pedirDatos();
            NodoLista aux = new NodoLista();
            
            aux.titulo = dd2;
            aux.numpag = numpag;
             
       
        aux.precio=precio;
        if(numpag>300){

            aux.next = anterior.next;
            anterior.next = aux;

            if (aux.next == null) {
                fin = aux;
            } else {
            }
        }else{
            System.out.println("El libro tiene menos de 301 paginas, no se registro");
        }
        } else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
    }
    
    public void insertarAntesDe(String dd){
    
    NodoLista anterior = inicio;
    NodoLista anterior2 = inicio;
        
        boolean encontrado = false;
        boolean band=true;
        int cont = 0;
        String dato;
            while (anterior != null&&band) {
                if (dd.equals(anterior.titulo)) {
                    encontrado = true;
                    //band =false;
              
                    if(cont==0){
                   /*System.out.println("Su registro de referencia se encuentra en el primer lugar es recomendable Usar la Opcion [1]");
                   band = false;*/
                    System.out.print("Ingrese el titulo:\t");
                    dato = Leer.nextLine();
                    NodoLista p = new NodoLista();
                    p.titulo = dato;
                    pedirDatos();
                    p.numpag=numpag;
                     
                   
                    p.precio=precio;
                    if(numpag>300){
                    p.next = inicio;
                    inicio = p;  
                    }
                    else{
                        System.out.println("El libro tiene menos de 301 paginas, no se registro");
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
            System.out.println("Ingresa el titulo:\t"); 
            String dd2= miEntrada.next();
            pedirDatos();
            NodoLista aux = new NodoLista();
            
            aux.titulo = dd2;
            aux.numpag= numpag;
             
       
        aux.precio=precio;
        if(numpag>300){
            
            aux.next = anterior2.next;
            anterior2.next = aux;

            if (aux.next == null) {
                fin = aux;}
        }else{
            System.out.println("El libro tiene menos de 301 paginas, no se registro");
        }
        }else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
}
    }

    public void eliminarDespuesDe(String dd) {
        NodoLista anterior = inicio;
        
        boolean encontrado = false;

        while (anterior != null) {
            if (dd.equals(anterior.titulo)) {
                encontrado = true;
                break;
            }
            anterior = anterior.next;
        }

        if (encontrado) {
            anterior = anterior.next;
            if (anterior != null) {
                this.retirar(anterior.titulo);
            } else {
                System.out.println("Su referencia esta al final es imposible eliminar.");
            }
        } else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
    }
    
    public void eliminarAntesDe(String dd){
    NodoLista anterior = inicio;
    NodoLista anterior2 = inicio;
      
    
    boolean encontrado = false;
        boolean band =true ;
        int cont=0;
        
       
         while (anterior != null&&band) {
                if (dd.equals(anterior.titulo)) {
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
                this.retirar(anterior2.titulo);
            } else {
                System.out.println("No hay datos");
            }
        } else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
        }
    
    }

    public void insertarEnOrden(String dd) {
        NodoLista aux = new NodoLista();
        pedirDatos();
        aux.titulo = dd;
        aux.numpag=numpag;
        
        
        aux.precio=precio;
        if (LSLVacia()) {
            inicio = fin = aux;
        } else {
            NodoLista ant = null;
            NodoLista act = inicio;
            boolean encontrado = false;

            while (act != null) {
                if (dd == null ? (act.titulo) != null : !dd.equals(act.titulo)) {
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

    public void insertarAlFinal(String dd) {
        NodoLista aux = new NodoLista();
        aux.titulo = dd;
         aux.numpag=numpag;
       
        aux.precio=precio;
        if(numpag>300){
        if (LSLVacia()) {
            inicio = fin = aux;
        } else {
            fin.next = aux;
            fin = aux;
        }
        }
    }
    
    public String retiraAlPrincipio() {
        String dd = null;
        if (!LSLVacia()) {
            System.out.println("\nEl Registro "+inicio.titulo+ " fue Eliminado");
            dd = inicio.titulo;
            inicio = inicio.next;

            if (inicio == null) {
                fin = null;
            }
        } else {
            System.out.println("Lista sin Registros");
        }
        return dd;
    }

    public String retiraAlFinal() {
        String dd = null;

        if (!LSLVacia()) {
            System.out.println("\nEl Registro "+fin.titulo+" fue Eliminado");
            dd = fin.titulo;
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

    public void retirar(String dd) {
        if (!LSLVacia()) {
            NodoLista ant = null;
            NodoLista act = inicio;
            boolean encontrado = false;

            while (act != null) {
                if (dd.equals(act.titulo)) {
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
                imprime="Titulo: "+ aux.titulo+" Num.Paginas: "+aux.numpag+"  Precio "+aux.precio;
                aux = aux.next;
                System.out.println(imprime);
            }
           
        }
    }
    public void buscar(String dd){
    NodoLista buscador = inicio;
    boolean encontrado=false;
        while (buscador != null) {
            if (dd.equals(buscador.titulo)) {
                encontrado = true;
                break;
            }
            buscador = buscador.next;
        }

        if (encontrado) {
        String imprime;
       imprime="Titulo: "+ buscador.titulo+"Num.paginas: "+buscador.numpag+"  Precio "+buscador.precio;
            System.out.println("\n-----Datos Encontrados------\n"+imprime);
        }else{
            System.out.println("\n\tDatos no encontrado\n");
        }
    }

    public boolean LSLVacia() {
        return (inicio == null);
    }
   public void pedirDatos(){
    boolean band=false;
    boolean band2=true;
    
 
    System.out.print("Ingrese el numero de paginas   \t");
    numpag=miEntrada.nextInt();
    
    
    precio=(5+(numpag*0.2));
    if(numpag>300){
        precio+=10;
    }
    
    
  }
}


