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
public class Principal {
    public static void main(String[] args){
        Interface obj = new Gato();
        obj.comer();
        obj.jugar();
        
        obj = new Pez();
        obj.comer();
        obj.jugar();
        
    }
}
