/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Shaker {
 public void ordenacionShaker(int[] v) {
     int cont[]=new int[5];
        final int N = v.length;
        int limInferior = 0;
        int limSuperior = N-1;
        while(limInferior <= limSuperior) {
            cont[0]++;
            
            for(int j=limInferior; j<limSuperior; j++) {
                cont[1]++;
                if(v[j]>v[j+1]) {
                    cont[2]++;
                    int tmp = v[j];
                    v[j]    = v[j+1];
                    v[j+1]  = tmp;
                }
            }
            limSuperior--;
            for(int j=limSuperior;j>limInferior; j--) {
                cont[3]++;
                if(v[j]<v[j-1]) {
                    cont[4]++;
                    int tmp = v[j];
                    v[j]    = v[j-1];
                    v[j-1]  = tmp;
                }
            }
            limInferior++;
        }
        System.out.println("entradas al while "+cont[0]);
        System.out.println("entradas al for "+cont[1]);
        System.out.println("entradas al if "+cont[2]);
        System.out.println("entradas al segundo for "+cont[3]);
        System.out.println("entradas al segundo if "+cont[4]);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shaker s=new Shaker();
        int []arreglo={5,4,3,-1,-2};
        
        s.ordenacionShaker(arreglo);
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]+" ");
        }
    }
    
}
