
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
public class TDAVideoTuto08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TDAVideoTuto08 objEsc=new TDAVideoTuto08();
        objEsc.bajarEscalera(20);
    }
    //Creando un metodo para bajar una escalera de manera recursiva
    public void bajarEscalera(int escalones){
        if(escalones==0||escalones<0){
            //Caso base, respuesta esxplicita
            System.out.println("Has terminado de bajar la escalera");
        }else{
            try {
                //Dominio,division del problema original en problema-1
                Thread.sleep(500);
                System.out.println("Bajando escalon "+escalones);
                //Haciendo uso de la recursividad
                bajarEscalera(escalones - 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(TDAVideoTuto08.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
