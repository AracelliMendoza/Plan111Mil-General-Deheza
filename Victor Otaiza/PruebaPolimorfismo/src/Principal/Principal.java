/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Auto;
import Clases.Computadora;
import Clases.Televisor;
import Interface.IOnOff;

/**
 *
 * @author capacitacion18
 */
public class Principal {
    public static void main(String[] args){
        
        System.out.println("A continuacion usamos polimorfismo con interfaces");
        IOnOff obj = new Televisor("LG");
        obj.apagar();
        obj.encender();
        obj = new Computadora("HP");
        obj.apagar();
        obj.encender();
        obj = new Auto("Chevrolet");
        obj.apagar();
        obj.encender();
        
        System.out.println("Implementacion sin usar polimorfismo");
        
        Auto auto = new Auto("Nissan");
        Computadora compu = new Computadora("VAIO");
        Televisor tel = new Televisor("Samsung");
        
        auto.apagar();
        auto.encender();
        
        compu.apagar();
        compu.encender();
        
        tel.apagar();
        tel.encender();
    }
}
