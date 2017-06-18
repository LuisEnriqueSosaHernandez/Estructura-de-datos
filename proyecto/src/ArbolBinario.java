import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
public class ArbolBinario {
    NodoArbol raiz;
char []arreglo;
    public ArbolBinario() {
        raiz = null;
         arreglo=new char[]{'`','-','=','[',']','q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','i','j','k','l',';','z','x','c','v','b','n','m',',','/',
         'Q','W','E','R','S','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
    }
    public void AgregarNodo(int d, String cl,String nom,String p,String fe,String bo) {
       try{
        NodoArbol nuevo = new NodoArbol(d,cl,nom,p,fe,bo);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
       }catch(OutOfMemoryError e){
                 JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la memoria", "warning", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    public boolean estaVacio() {
        return raiz == null;
    }
    public void inOrden(NodoArbol r) {
        try{
        if (r != null) {
                
            inOrden(r.hijoIzquierdo);
            System.out.println(" Su codigo es: "+r.clave+" ,Nombre del producto: "+r.nombre+" ,Precio: $"+r.precio +",Fecha de caducidad: "+r.fecha+" ,Bodega: "+r.bodega);
            inOrden(r.hijoDerecho);
        }
        }catch(NullPointerException n){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException excepcion){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
     
     public void muestraproducto(String n,NodoArbol r) {
          try{
        if (r != null) {
            muestraproducto(n,r.hijoIzquierdo);
            if(r.nombre.equals(n)){
                System.out.println(" Su codigo es: "+r.clave+" ,Nombre del producto: "+r.nombre+" ,Precio: $"+r.precio +",Fecha de caducidad: "+r.fecha+" ,Bodega: "+r.bodega);
                   }
            
            muestraproducto(n,r.hijoDerecho);
        }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException excepcion){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
      public void editaprecio(String n,String p,NodoArbol r) {
          try{
        if (r != null) {
            editaprecio(n,p,r.hijoIzquierdo);
            if(r.nombre.equals(n)){
                r.precio=p;
                   }
            
            editaprecio(n,p,r.hijoDerecho);
        }
         }catch(NullPointerException s){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException excepcion){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }
    } 
    public NodoArbol buscarNodo(int d){
        NodoArbol aux=raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    public boolean eliminar(int d){
        try{
        NodoArbol auxiliar=raiz;
        NodoArbol padre=raiz;
        boolean esHijoIzq=true;
        while(auxiliar.dato!=d){
            padre=auxiliar;
            
            if(d<auxiliar.dato){
                esHijoIzq=true;
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                esHijoIzq=false;
                auxiliar=auxiliar.hijoDerecho;
            }
            if(auxiliar==null){
                return false;
            }
        }
        if(auxiliar.hijoIzquierdo==null&&auxiliar.hijoDerecho==null){
         if(auxiliar==raiz){
             raiz=null;
         }else if(esHijoIzq){
             padre.hijoIzquierdo=null;
         }else{
             padre.hijoDerecho=null;
         }   
        }else if(auxiliar.hijoDerecho==null){
            if(auxiliar==raiz){
             raiz=auxiliar.hijoIzquierdo;
         }else if(esHijoIzq){
             padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
         }else{
             padre.hijoDerecho=auxiliar.hijoIzquierdo;
         }  
        }else if(auxiliar.hijoIzquierdo==null){
             if(auxiliar==raiz){
             raiz=auxiliar.hijoDerecho;
         }else if(esHijoIzq){
             padre.hijoIzquierdo=auxiliar.hijoDerecho;
         }else{
             padre.hijoDerecho=auxiliar.hijoIzquierdo;
         }  
        }else{
            NodoArbol reemplazo=obtenerNodoReemplazo(auxiliar);
        if(auxiliar==raiz){
            raiz=reemplazo;
        }else if(esHijoIzq){
            padre.hijoIzquierdo=reemplazo;
        }else{
            padre.hijoDerecho=reemplazo;
        }
        reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
         }catch(NullPointerException s){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(ArrayIndexOutOfBoundsException excepcion){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en en el puntero", "warning", JOptionPane.INFORMATION_MESSAGE);
        }
        return true;
        
    }
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazarPadre=nodoReemp;
        NodoArbol reemplazo=nodoReemp;
        NodoArbol auxiliar=nodoReemp.hijoDerecho;
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if(reemplazo!=nodoReemp.hijoDerecho){
            reemplazarPadre.hijoIzquierdo=reemplazo.hijoDerecho;
            reemplazo.hijoDerecho=nodoReemp.hijoDerecho;
            
        }
        System.out.println("El nodo reemplazo es "+reemplazo);
        return reemplazo;
    }
    public int conversion(String clave){
        int suma=0;
        for(int i=0;i<clave.length();i++){
        suma+=clave.charAt(i)-'0';
        }
        return suma;
    }
    public boolean validacionprecio(String pre){
        if(pre.length()!=0){
        if(pre.charAt(0)=='-'){
            return false;
        }
        }
        for(int i=0;i<pre.length();i++){
            for(int j=0;j<arreglo.length;j++)
            if(pre.charAt(i)==arreglo[j]){
            return false;
        }
        }
        return true;
    }
        public boolean FechaValida(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
        public boolean valida(String po){
            if(po.length()==0){
                return false;
            }
            return true;
        }        
}
