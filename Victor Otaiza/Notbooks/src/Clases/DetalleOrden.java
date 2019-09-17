/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.math.BigDecimal;

/**
 *
 * @author Capacitacion18
 */
public class DetalleOrden {
    
    private Notbook item;
    private float precioUnitario;
    private int cantidad;

    public DetalleOrden(Notbook item, float precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Notbook getItem() {
        return item;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public BigDecimal totalItem(){
        BigDecimal total = new BigDecimal(cantidad * precioUnitario);
        return total;
    }
    
    
}
