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

public class Bicicleta {
    
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;
   
    
    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }
    
    
    public void acelerar(){
        velocidadActual = velocidadActual*2;
    }
    
    public void frenar(){
         velocidadActual = velocidadActual/2;
    }
    
    public void cambiarPlato(int plato){
        platoActual = plato;
    }
    
    public void cambiarPlato(){
        platoActual = 1;
    }
    
    public void cambiarPiñon(int piñon){
       piñonActual = piñon;
    }
    
    public void cambiarPiñon(){
        piñonActual = 1;
    }
    
    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual=" + piñonActual + '}';
    }
    
    static void metodoStatico(){
        System.out.println("Hola desde un metodo estatico");
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }
    
    public void andar() {
        System.out.println("Bicicleta andando");
    }
   
    
}
