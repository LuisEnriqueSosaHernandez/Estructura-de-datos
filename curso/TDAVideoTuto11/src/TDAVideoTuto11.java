/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
public class TDAVideoTuto11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       TDAVideoTuto11 objfibo=new TDAVideoTuto11();
       System.out.println("La sucesion fibonnaci de 12 mediante recursividad es "+objfibo.fibonnaciRecursivo(12));
      System.out.println("La sucesion fibonnaci de 12 mediante ciclo es "+objfibo.fibonnaciCiclo(12));
    }
    //cREANDO METODO RECURSIVO PARA FIBONNACI
     public int fibonnaciRecursivo(int n){
         if(n==1||n==2){
             //Caso base(Respuesta explicita)
             return 1;
         }else{
            //Dominio(problema -1)
             return fibonnaciRecursivo(n-1)+fibonnaciRecursivo(n-2);
         }
     }
     //Creando metodo con ciclo
     
     public int fibonnaciCiclo(int n){
         int fibo=0,primero=1,segundo=0;
         while(n>0){
             fibo=primero+segundo;
             primero=segundo;
             segundo=fibo;
             n--;
         }
         return fibo;
     }
}
