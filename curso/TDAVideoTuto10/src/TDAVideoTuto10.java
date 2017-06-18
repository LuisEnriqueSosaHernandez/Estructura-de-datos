/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
public class TDAVideoTuto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TDAVideoTuto10 objfact=new TDAVideoTuto10();
        System.out.println("El factorial de 4 mediante metodo recursivo es: "+objfact.factorialRecursivo(5));
        System.out.println("El factorial de 4 mediante ciclo es: "+objfact.factorialCiclo(5));
    }

    //Creando el metodo factorial de manera recursiva

    public int factorialRecursivo(int n) {
        if (n < 0) {
             return 0;
        }else{
            //Caso base
            if (n == 0) {
              return 1;   
            }else{
                //Dominio (problema -1)
                return n * factorialRecursivo(n-1);
            }
        }

    }
    //Ceando facto mediante ciclo
    public int factorialCiclo(int n){
        int factor=1;
        if(n<0){
            return 0;
        }else{
           while(n!=0){
               factor=n*factor;
               n--;
           } 
           return factor;
        }
    }

}
