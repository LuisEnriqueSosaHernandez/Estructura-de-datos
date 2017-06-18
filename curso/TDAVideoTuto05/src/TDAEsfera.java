/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisenrique
 */
public class TDAEsfera {
    private double radio;
    //Constructor
    public TDAEsfera(double radioInicial){
        if(radioInicial>0){
            this.radio=radioInicial;
        }else{
            this.radio=0.0;
        }
    }
    //Creamos metodos u operaciones del tda esfera
    public double getRadio(){
        return this.radio;
    }
    public double getDiametro(){
    return (radio*2);
}
    public double getCircunferencia(){
        return (Math.PI*getDiametro());
    }
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio, 3))/3;
    }     
    
}
