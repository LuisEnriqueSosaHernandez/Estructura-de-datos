package libreria;


public class Libro {
    public int Venta;
     public String nombre;
      public int numPag;
        public double precio;
       
    public Libro siguiente;
   
    public Libro(int v,String nom,int np,double p){
    this.Venta=v;  
    this.nombre=nom;
    this.numPag=np;
    this.precio=p;
    this.siguiente=null;
    }
   
    public Libro(int v,Libro n,String nom,int np,double p){
        this.Venta=v;  
    this.nombre=nom;
    this.numPag=np;
    this.precio=p;
        siguiente=n;
    }
    
    
}
