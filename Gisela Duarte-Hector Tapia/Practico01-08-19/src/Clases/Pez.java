package Clases;


import Ianimal.Ianimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacitacion19
 */
public class Pez implements Ianimal {

    public Pez(String coco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
      System.out.println("El pez come placton");
    }

    @Override
    public void jugar() {
     System.out.println("El pez juega");
    }
    
}
