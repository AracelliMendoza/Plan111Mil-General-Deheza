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
public class Gato implements Ianimal{

    @Override
    public void comer() {
      System.out.println("El gato come placton");
    }

    @Override
    public void jugar() {
      System.out.println("El gato juega");
    }
    
}
