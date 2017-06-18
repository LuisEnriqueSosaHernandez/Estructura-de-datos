public class NodoArbol {
    int dato;
    String clave;
    String nombre;
    String precio;
    String fecha;
    String bodega;
    NodoArbol hijoIzquierdo,hijoDerecho;
    public NodoArbol(int d,String cl,String nom,String p,String fe,String bo){
        this.dato=d;
        this.clave=cl;
        this.nombre=nom;
        this.precio=p;
        this.fecha=fe;
         this.bodega=bo;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return " Su codigo es: "+clave+" ,Nombre del producto: "+nombre+" ,Precio: $"+precio +",Fecha de caducidad: "+fecha+" ,Bodega: "+bodega;
    }
}
