/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz[][]=new int[10][10];
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
               matriz[i][j]=i;
           }
       }
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
               System.out.print(matriz[i][j]+" ");
           }
           System.out.println();
       }
    }
    
}
