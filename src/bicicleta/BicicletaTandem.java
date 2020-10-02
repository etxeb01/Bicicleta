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
public class BicicletaTandem extends Bicicleta {
    
    private int numAsientos;
    
     
        
    public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
        super(velocidadActual, platoActual, piñonActual);
        
        this.numAsientos = numAsientos;        
        
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "BicicletaTandem{" + "velocidadActual=" + super.getVelocidadActual() + 
                ", platoActual=" + super.getPlatoActual() + ", piñonActual=" 
                + super.getPiñonActual()+ " numAsientos=" + numAsientos + '}';
    }

    @Override
    public void andar() {
    
        System.out.println("Bicicleta tandem andando");
    
    }
    
    
    
   
    
    
    
}
