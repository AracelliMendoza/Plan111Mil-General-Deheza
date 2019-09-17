/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarexamenes;
/**
 * 
 * @author capacitacion19
 */

public class Notebook {
    
    private String marca;
    private String modelo;
    private String procesador;
    private float tamañodisco;
    /**
     * 
     * @param marca
     * @param modelo
     * @param procesador
     * @param tamañodisco 
     */
     public Notebook(String marca, String modelo, String procesador,float tamañodisco) {
      this.marca=marca;
      this.modelo=modelo;
      this.procesador=procesador;
      this.tamañodisco=tamañodisco;
     }
    /**
     * 
     * @return 
     */
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
        return tamañodisco;
    } 
        
    
    }


