package libreria;


public class Ventas {
   protected Libro inicio,fin;
   public Ventas(){
       inicio=null;
       fin=null;
   }
   
  
   public void agregarAlInicio(int v,String nom,int np,double p){
       
       inicio=new Libro(v,inicio,nom,np,p);
       if(fin==null){
           fin=inicio;
       }
   }
   
   public void agregarAlFinal(int v,String nom,int np,double p){
       if(!LibreriaVacia()){
           fin.siguiente=new Libro(v,nom,np,p);
           fin=fin.siguiente;
       }else{
           inicio=fin=new Libro(v,inicio,nom,np,p);
       }
   }
   
   
   
   public void mostrarLibreria(){
       Libro recorrer=inicio;
       System.out.println("");
       while(recorrer!=null){
           System.out.println("Num.Venta: "+recorrer.Venta+" Titulo: "+recorrer.nombre+" Num.Paginas: "+recorrer.numPag+" $"+recorrer.precio);
       recorrer=recorrer.siguiente;
               
       }
   }
  
   public int borrarInicio(){
       int elemento=inicio.Venta;
       if(inicio==fin){
          inicio=fin=null; 
        }else{
    inicio=inicio.siguiente;
}
   return elemento;
   
}
   
   public int borrarFinal(){
       int elemento=fin.Venta;
       if(inicio==fin){
           inicio=fin=null;
       }else{
           Libro temporal=inicio;
           while(temporal.siguiente!=fin){
               temporal=temporal.siguiente;
           }
          fin=temporal;
          fin.siguiente=null;
       }
       return elemento;
   }
   
   public void eliminar(int elemento){
       if(!LibreriaVacia()){
           if(inicio==fin&&elemento==inicio.Venta){
               inicio=fin=null;
           }else if(elemento==inicio.Venta){
               inicio=inicio.siguiente;
           }else{
               Libro anterior,temporal;
               anterior=inicio;
               temporal=inicio.siguiente;
               while(temporal!=null&&temporal.Venta!=elemento){
                   anterior=anterior.siguiente;
                   temporal=temporal.siguiente;
               }
               if(temporal!=null){
                   anterior.siguiente=temporal.siguiente;
                   if(temporal==fin){
                       fin=anterior;
                   }
               }
           }
       }   
   }
    public boolean Existe(int elemento){
       Libro temporal=inicio;
       while(temporal!=null&&temporal.Venta!=elemento){
           temporal=temporal.siguiente;
       }
       return temporal!=null;
   }
  
    public boolean LibreriaVacia(){
       if(inicio==null){
           return true;
       }else{
           return false;
       }
   }
}
