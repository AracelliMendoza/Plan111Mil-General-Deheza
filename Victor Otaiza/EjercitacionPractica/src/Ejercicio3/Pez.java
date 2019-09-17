/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Capacitacion18
 */
public class Pez implements Interface {
    public Pez(){        
    }
    
    @Override
    public void comer() {
        System.out.println("El pez come plancton.");
    }

    @Override
    public void jugar() {
        System.out.println("El pez juega");
    }
    
}
