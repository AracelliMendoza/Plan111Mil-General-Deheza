/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Capacitacion18
 */
public class Cuenta {
    private String titular;
    private float cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    public Cuenta(String titular, float cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + " Cuenta: " + cantidad;
    }
    
    public static void ingresar(double cantidad){
         
        if( cantidad > 0){
            this.cantidad = cantidad.floatValue();
        }
        
    }
    
    
    
}
