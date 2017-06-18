
public class Registro {
    int habitacion;
    String nombre;
    int personas;
    double costo;
    String fechallegada;
    String fechaSalida;
    Registro hijoIzquierdo,hijoDerecho;
    public Registro(int h,String nom,int p,double c,String fll,String fs){
        this.habitacion=h;
        this.nombre=nom;
        this.personas=p;
        this.costo=c;
        this.fechallegada=fll;
        this.fechaSalida=fs;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return "Numero de habitacion: "+habitacion+" A nombre de: "+nombre+" Ocupantes: "+personas+" Total a pagar: $"+costo+" Fecha de llegada: "+fechallegada+" Fecha de salida: "+fechaSalida;
    }
}
