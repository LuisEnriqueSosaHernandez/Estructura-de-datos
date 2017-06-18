
import java.util.Arrays;


public class metodos {
   public void imprimea(double[]arreglo){
       for(int i=0;i<arreglo.length;i++){
           System.out.print("a["+i+"]="+arreglo[i]+" ");
       }
       
   }
    public void imprimeb(float[]arreglo){
       for(int i=0;i<arreglo.length;i++){
           System.out.println("b["+i+"]="+arreglo[i]);
       }
    }
    public boolean buscarnormal(double a,double arreglo[]){
        boolean b=false;
        for(int i=0;i<arreglo.length;i++){
           if(a==arreglo[i]){
               b=true;
           } 
        }
        return b;
    }
    public boolean buscarnormal2(float a,float arreglo[]){
        boolean b=false;
        for(int i=0;i<arreglo.length;i++){
           if(a==arreglo[i]){
               b=true;
           } 
        }
        return b;
    }
    public double busquedaBinaria(double arreglo[], double elemento) {
         //para la busqueda binaria es necesario que el arreglo este ordenado
        Arrays.sort(arreglo);
        int centro;
        double primero, ultimo;
        double valorCentro;
        primero = 0;
        ultimo = arreglo.length - 1;
        while (primero <= ultimo) {
            centro = (int) ((primero + ultimo) / 2);
            valorCentro = arreglo[centro];
           
          if(elemento==valorCentro){
              return valorCentro;
          }else if(elemento<valorCentro){
              ultimo=centro-1;//Desplazarse hacia la izquierda
          }else{
              primero=centro+1;//Desplazamos hacia la derecha
              
          }
        }
        return -1;
    }
    public double busquedaBinaria2(float arreglo[], float elemento) {
        //para la busqueda binaria es necesario que el arreglo este ordenado
        Arrays.sort(arreglo);
        int centro;
        float primero, ultimo;
        float valorCentro;
        primero = 0;
        ultimo = arreglo.length -1;
        while (primero <= ultimo) {
            centro = (int) ((primero + ultimo) / 2);
            valorCentro = arreglo[centro];
           
          if(elemento==valorCentro){
              return valorCentro;
          }else if(elemento<valorCentro){
              ultimo=centro-1;//Desplazarse hacia la izquierda
          }else{
              primero=centro+1;//Desplazamos hacia la derecha
              
          }
        }
        return -1;
    }
    
}
