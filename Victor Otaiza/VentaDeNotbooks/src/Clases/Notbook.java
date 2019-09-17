/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author capacitacion18
 */
public class Notbook {
    String marca;
    String modelo;
    String procesador;
    float tamañoDisco;

    public Notbook(String marca, String modelo, String procesador, float tamañoDisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.tamañoDisco = tamañoDisco;
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

    public float getTamañoDisco() {
        return tamañoDisco;
    }
    
    
}
