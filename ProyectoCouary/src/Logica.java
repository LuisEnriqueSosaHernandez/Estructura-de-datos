import javax.swing.JOptionPane;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Logica {
Calendar c1 = GregorianCalendar.getInstance();
    Registro raiz;

    public Logica() {
        raiz = null;
    }

    

    public void AgregarNodo(int h, String nom,int p,double c,String fll,String fs) {
        
        Registro nuevo = new Registro(h, nom,p,c,fll,fs);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Registro auxiliar = raiz;
             Registro padre;
            while (true) {
                padre = auxiliar;
                if (h < auxiliar.habitacion) {
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
    }

    

    public boolean estaVacio() {
        return raiz == null;
    }

    

    public void preOrden( Registro r) {
        if (r != null) {
            JOptionPane.showMessageDialog(null, "Numero de habitacion: "+r.habitacion+" A nombre de: "+r.nombre, "warning", JOptionPane.INFORMATION_MESSAGE);
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    
    public void ChecarRegistros( Registro r) {
        String checa=c1.getTime().toLocaleString();
        if (r != null) {
            
            if(checa.equals(r.fechaSalida)){
                JOptionPane.showMessageDialog(null, "Se le agoto el tiempo al inquilino: "+ r.nombre+" De la habitacion: "+r.habitacion, "warning", JOptionPane.INFORMATION_MESSAGE);
                  eliminar(r.habitacion);
            }
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
    
   
    public  Registro buscarNodo(int d){
         Registro aux=raiz;
        while(aux.habitacion!=d){
            if(d<aux.habitacion){
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
    public  boolean checarsiesta(int d){
         Registro aux=raiz;
         
        while(aux.habitacion!=d){
            if(d<aux.habitacion){
                aux=aux.hijoIzquierdo;
            }else{
                aux=aux.hijoDerecho;
            }
            if(aux==null){
                return false;
            }
        }
        return true;
    }
    
    public boolean eliminar(int d){
         Registro auxiliar=raiz;
         Registro padre=raiz;
        boolean esHijoIzq=true;
        while(auxiliar.habitacion!=d){
            padre=auxiliar;
            
            if(d<auxiliar.habitacion){
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
             Registro reemplazo=obtenerNodoReemplazo(auxiliar);
        if(auxiliar==raiz){
            raiz=reemplazo;
        }else if(esHijoIzq){
            padre.hijoIzquierdo=reemplazo;
        }else{
            padre.hijoDerecho=reemplazo;
        }
        reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
        return true;
    }
    
    public  Registro obtenerNodoReemplazo( Registro nodoReemp){
         Registro reemplazarPadre=nodoReemp;
         Registro reemplazo=nodoReemp;
         Registro auxiliar=nodoReemp.hijoDerecho;
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if(reemplazo!=nodoReemp.hijoDerecho){
            reemplazarPadre.hijoIzquierdo=reemplazo.hijoDerecho;
            reemplazo.hijoDerecho=nodoReemp.hijoDerecho;
            
        }
        return reemplazo;
    }
    
}
