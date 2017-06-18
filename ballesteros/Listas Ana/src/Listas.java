
import java.util.Scanner;
public class Listas {
Scanner miEntrada= new Scanner(System.in);

    int edad;
    
    String sexo;
    String nombre;
    double estatura=0;
    double peso=0;  
    Scanner Leer = new Scanner (System.in);
    Scanner s = new Scanner(System.in);
        
    NodoLista inicio, fin;
  

    public void Lista() {
        inicio = null;
        fin = null;
    }

    public void insertarAlPrincipio(String dd) {
        NodoLista p = new NodoLista();
        
            p.nombre = dd;
            pedirDatos();

            p.edad=edad;
        
        p.sexo=sexo;
          p.estatura=estatura;
            p.peso=peso;
        if (LSLVacia()) {      
            inicio = fin = p;
        } else {
            p.next = inicio;
            inicio = p;
        }
       
    }

    public void insertarDespuesDe(String dd) {
        NodoLista anterior = inicio;
        boolean encontrado = false;
        
        

        while (anterior != null) {
            if (dd.equals(anterior.nombre)) {
                encontrado = true;
                break;
            }
            anterior = anterior.next;
        }

        if (encontrado) {
            System.out.println("Ingresa el nombre:\t"); 
            String dd2= miEntrada.next();
            pedirDatos();
            NodoLista aux = new NodoLista();
            
            aux.nombre = dd2;
            aux.edad = edad;
             aux.edad=edad;
        aux.sexo=sexo;
        aux.estatura=estatura;
        aux.peso=peso;

            aux.next = anterior.next;
            anterior.next = aux;

            if (aux.next == null) {
                fin = aux;
            } else {
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
                if (dd.equals(anterior.nombre)) {
                    encontrado = true;
                    //band =false;
              
                    if(cont==0){
                   /*System.out.println("Su registro de referencia se encuentra en el primer lugar es recomendable Usar la Opcion [1]");
                   band = false;*/
                    System.out.print("Ingrese el nombre:\t");
                    dato = Leer.nextLine();
                    NodoLista p = new NodoLista();
                    p.nombre = dato;
                    pedirDatos();
                    p.edad=edad;
                     
                    p.sexo=sexo;
                    p.estatura=estatura;
                    p.peso=peso;
                    p.next = inicio;
                    inicio = p;  
                    
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
            System.out.println("Ingresa el nombre:\t"); 
            String dd2= miEntrada.next();
            pedirDatos();
            NodoLista aux = new NodoLista();
            
            aux.nombre = dd2;
            aux.edad = edad;
             
        aux.sexo=sexo;
       aux.estatura=estatura;
        aux.peso=peso;
            
            aux.next = anterior2.next;
            anterior2.next = aux;

            if (aux.next == null) {
                fin = aux;}
        }else {
            System.out.println("No existe referencia" + dd + "en la lista");
        }
}
    }

    public void eliminarDespuesDe(String dd) {
        NodoLista anterior = inicio;
        
        boolean encontrado = false;

        while (anterior != null) {
            if (dd.equals(anterior.nombre)) {
                encontrado = true;
                break;
            }
            anterior = anterior.next;
        }

        if (encontrado) {
            anterior = anterior.next;
            if (anterior != null) {
                this.retirar(anterior.nombre);
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
                if (dd.equals(anterior.nombre)) {
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
                this.retirar(anterior2.nombre);
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
        aux.nombre = dd;
        aux.edad=edad;
        
        aux.sexo=sexo;
        aux.estatura=estatura;
        aux.peso=peso;
        if (LSLVacia()) {
            inicio = fin = aux;
        } else {
            NodoLista ant = null;
            NodoLista act = inicio;
            boolean encontrado = false;

            while (act != null) {
                if (dd == null ? (act.nombre) != null : !dd.equals(act.nombre)) {
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
        aux.nombre = dd;
         aux.edad=edad;
        aux.sexo=sexo;
        aux.estatura=estatura;
        aux.peso=peso;

        if (LSLVacia()) {
            inicio = fin = aux;
        } else {
            fin.next = aux;
            fin = aux;
        }
    }
    
    public String retiraAlPrincipio() {
        String dd = null;
        if (!LSLVacia()) {
            System.out.println("\nEl Registro "+inicio.nombre+ " fue Eliminado");
            dd = inicio.nombre;
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
            System.out.println("\nEl Registro "+fin.nombre+" fue Eliminado");
            dd = fin.nombre;
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
                if (dd.equals(act.nombre)) {
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
        
        /*System.out.println("\t>Nombre\t  Edad\t\t Puesto\t\t  Salario<"
                         + "\n\t||HrsTotales\tHrsNormales\tHrsExtras\tSaldoNeto||"
                         + "\n\t___________________________________________________________");*/
        if (LSLVacia()) {
            System.out.println("No Existen Datos");
        } else {
            NodoLista aux = inicio;
            while (aux != null) {
                imprime="Nombre: "+ aux.nombre+"Edad: "+aux.edad+" Estatura "+aux.estatura+" Sexo "+aux.sexo+" Peso "+aux.peso;
                aux = aux.next;
                System.out.println(imprime);
            }
           
        }
    }
    public void buscar(String dd){
    NodoLista buscador = inicio;
    boolean encontrado=false;
        while (buscador != null) {
            if (dd.equals(buscador.nombre)) {
                encontrado = true;
                break;
            }
            buscador = buscador.next;
        }

        if (encontrado) {
        String imprime;
        imprime="Nombre: "+ buscador.nombre+"Edad: "+buscador.edad+" Estatura "+buscador.estatura+" Sexo "+buscador.sexo+" Peso "+buscador.peso;
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
    

    do{   
    System.out.print("Ingrese la Edad   \t");
    edad=miEntrada.nextInt();
    if((edad<18) || (edad >35)){
        System.out.println("INVALIDO, RANGO 18-35 AÑOS");
    } 
    }while((edad<18 || edad >35));
    do{
    System.out.print("Ingrese la estatura   \t");
    estatura=miEntrada.nextDouble();
    if((estatura < 1.80) || (estatura > 2.10)){
          System.out.println(" INVALIDO, Rango 1.80 - 2.10 mts");
        } 
    }while((estatura < 1.80 || estatura > 2.10));
    
    System.out.print("Ingrese el sexo   \t");
    sexo=miEntrada.next();
    
    do{
        
    System.out.print("Ingrese el peso   \t");
    peso=miEntrada.nextDouble();
    if(peso>80){
          System.out.println("Rango invalido peso tiene que ser 80 o menor");
        }
    }while(peso>80 || peso<0);
  }
}


