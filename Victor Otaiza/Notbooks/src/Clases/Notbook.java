/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Capacitacion18
 */
public class Notbook {
    private String marca, modelo, procesador;
    private float tamañodisco;

    public Notbook(String marca, String modelo, String procesador, float tamañodisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamañodisco = tamañodisco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public float getTamañodisco() {
        return tamañodisco;
    }
    
    
}
