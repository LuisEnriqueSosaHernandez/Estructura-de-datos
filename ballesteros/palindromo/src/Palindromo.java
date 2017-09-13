
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class Palindromo {                                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resp="";
        String resp2="";
        char []a;
        int tam,tam2;
        boolean bandera=true;
        Scanner l=new Scanner(System.in);
        do{
            System.out.println("Ingresa el tamanio del arreglo");
            tam=l.nextInt();
            a=new char[tam];
            tam2=tam;
            for(int i=0;i<tam;i++){
                System.out.println("Ingresa una letra Nota: si ingresas una palabra , solo se tomara en cuenta la primera letra");
                a[i]=l.next().charAt(0);
                if(i<tam-1){
                    System.out.println("Te has arrepentido , presiona s/si - n/no");
                    resp2=l.next();
                    if(resp2.equals("s")){
                        tam2=i+1;
                        break;
                    }
                }
            }
            System.out.println("Tus resultados");
            for(int i=0;i<tam2;i++){
                for(int j=tam2-1-i;j>=0;j--){
                    if(a[i]!=a[j]){
                        bandera=false;
                    }
                    break;
                }
            }
            if(bandera){
                System.out.println("Es palindromo");
            }else{
                System.out.println("No es palindromo");
            }
            
            resp2="";
            System.out.println("Deseas repetir el proceso n/no");
        }while(resp.equals("n"));
    }
}
