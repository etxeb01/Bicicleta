/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author Etxeb
 */
public class BicicletaMontaña extends Bicicleta {
    
    private int suspension;

    public BicicletaMontaña(int velocidadActual, int platoActual, int piñonActual, int suspension) {
        super(velocidadActual, platoActual, piñonActual);
        this.suspension = suspension;
    }
    
    public void cambiarSuspension(int susp){
        suspension = susp;
    }

    @Override
    public String toString() {
        return "BicicletaMonta\u00f1a{" + "velocidadActual=" + super.getVelocidadActual() + 
                ", platoActual=" + super.getPlatoActual() + ", piñonActual=" 
                + super.getPiñonActual() +" suspension=" + suspension + '}';
    }
    
    @Override
    public void andar(){
              
        System.out.println("Bicicleta Montaña andando");
    }
    
    
}
