
import java.util.Arrays;
import java.util.Scanner;


public class Hugo {
    int arreglo[];
    int arreglo2[];
    public Hugo(int tamanio){
     arreglo=new int[tamanio];
    arreglo2=new int[tamanio];
 }
    Scanner l=new Scanner(System.in);
    
    public void llenararreglos(){
    System.out.println("LLenar arreglo1");
    for(int i=0;i<arreglo.length;i++){
      System.out.println("ingresa el elemento "+i);
      arreglo[i]=l.nextInt();
    }
    System.out.println("LLenar arreglo2");
    for(int i=0;i<arreglo2.length;i++){
      System.out.println("ingresa el elemento "+i);
      arreglo2[i]=l.nextInt();
    }
}
    public int[] sumararreglos(){
        int arreglo3[]=new int[arreglo.length];
        for(int i=0;i<arreglo.length;i++){
            arreglo3[i]=arreglo[i]+arreglo2[i];
        }
        return arreglo3;
    }
    public int[] restararreglos(){
        int arreglo3[]=new int[arreglo.length];
        for(int i=0;i<arreglo.length;i++){
            arreglo3[i]=arreglo[i]-arreglo2[i];
        }
        return arreglo3;
    }

   
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int a;
         System.out.println("Ingresa el tamanio de los arreglos");
        int tamanio=l.nextInt();
        Hugo h=new Hugo(tamanio);
        do{
            System.out.println("Menu de opciones:");
         System.out.println("1.llenar arreglo");
          System.out.println("2.sumar arreglos");
           System.out.println("3.restar arreglos");
           System.out.println("4.salir");
           System.out.println("Elige una opcion:");
         
            a=l.nextInt();
       switch(a){
           case 1:
        h.llenararreglos();
        break;
           case 2:
               System.out.println(Arrays.toString(h.sumararreglos()));
               
               break;
           case 3:
               System.out.println(Arrays.toString(h.restararreglos()));
               break;
        }
        }while(a!=4);
        
       
    }
    /*NOTA: POR LA REDACCION EN LOS COMENTARIOS PARECE SACADO DE UN TUTORIAL , DE HECHO CREO QUE SERIA BUENO HACER VIDEOTUTORIALES PARA FACILITARLES LA VIDA A LAS PERSONAS
ESTE PROGRAMA ES REALIZADO CON FINES EDUCATIVOS Y PARA PASAR LA MATERIA, DERECHOS RESERVADOS S.A. DE C.V.
DIRECCION:INSTITUTO TECNOLOGICO DE MEXICO CAMPUS VERACRUZ.
ESTE PROGRAMA ES AUSPICIADO POR COCA COLA 
PATROCINADOR OFICIAL:MOTORES SOSA
AGRADECIMIENTOS ESPECIALES A LA PERSONA A LA QUE LE ROBO EL INTERNET XS , JAJA NA , ME LO PAGA MI MAMA.
AUTO: Sosa Hernández Luis Enrique
*/
}
