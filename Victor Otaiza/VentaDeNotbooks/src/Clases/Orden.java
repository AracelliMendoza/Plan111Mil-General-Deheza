/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author capacitacion18
 */
public class Orden {
    
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    /**
     * 
     * @param id ID
     * @param creacion Creacion
     */
    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
    }
    
    /**
     * 
     * @param detalle htgdvfd
     */
    public void agregarItem(DetalleOrden detalle){
        items.add(detalle);
    }
    
    /**
     * 
     * @return Items
     */
    public int getNroItems(){
        int nroItems = items.size();
        
        return nroItems;
    }

    /**
     * 
     * @param envio envio
     */
    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    
    /**
     * 
     * @param items Items
     * @return Nada
     */
    public float calcularTotalOrden(List<DetalleOrden> items){
        float precioTotal = 0;
        int cant;
        float precioUnitario;
        
        /*for(int i=0; i<items.size(); i++){
            cant = items.get(i).getCantidad();
            precioUnitario = items.get(i).getPrecioUnitario();
            precioTotal = cant*precioUnitario;
        }
        */
        
        for(DetalleOrden item: items){
            cant = item.getCantidad();
            precioUnitario = item.getPrecioUnitario();
            precioTotal = cant*precioUnitario;
    
        }
        
        return precioTotal;
    }
    
    
}
