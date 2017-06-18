/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercion;

/**
 *
 * @author SAMSUNG
 */
public class Insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []A={1,2,3,4,5,6,7,8,9,10};
        int []B={10,9,8,7,6,5,4,3,2,1};
        orden o=new orden();
        o.insercion(A);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
       o.insercion(B);
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }
    
}
