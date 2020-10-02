/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

import java.util.ArrayList;

/**
 *
 * @author Etxeb
 */
public class Test {
    
    
    public static void main(String[] args){
        
        ArrayList<Bicicleta> bicicletas = new ArrayList();

        Bicicleta miBicicleta = new Bicicleta(100, 3, 8);
        BicicletaMontaña mtb = new BicicletaMontaña(50, 2, 4, 140);
        BicicletaTandem bt = new BicicletaTandem(20, 1, 3, 2);
        Bicicleta tuBicicleta = new Bicicleta(10, 1, 4);

        bicicletas.add(miBicicleta);
        bicicletas.add(mtb);
        bicicletas.add(bt);
        bicicletas.add(tuBicicleta);

        for (int i = 0; i < bicicletas.size(); i++) {

            bicicletas.get(i).andar();

        }
        
         
    }
}
