
public class Nodo {
    public int dato;
     public String nombre;
      public int edad;
       public String sexo;
        public double estatura;
       public double peso;
    public Nodo siguiente;
   
    public Nodo(int d,String nom,int e,String s,double es,double p){
    this.dato=d;  
    this.nombre=nom;
    this.edad=e;
    this.sexo=s;
    this.estatura=es;
    this.peso=p;
    this.siguiente=null;
    }
   
    public Nodo(int d,Nodo n,String nom,int e,String s,double es,double p){
        dato=d;
         this.nombre=nom;
    this.edad=e;
    this.sexo=s;
    this.estatura=es;
    this.peso=p;
        siguiente=n;
    }
    
    
}
