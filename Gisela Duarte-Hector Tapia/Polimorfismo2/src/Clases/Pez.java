package Clases;

import Interface.Ianimal;

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

 
    @Override
    public void come() {
        System.out.println("El pez come");
    }

    @Override
    public void juega() {
        System.out.println("El pez juega");
    }
    
}
