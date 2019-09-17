/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Capacitacion18
 */
public class Orden {
    
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        this.items = new ArrayList<DetalleOrden>();
    }
    
    public void agregarItem(DetalleOrden item){
        this.items.add(item);
    }
    
    public int getNroItems(){
        return items.size();
    }
    
    public void setEnvio(Date envio){
        this.envio = envio;
    }
    
    public BigDecimal totalOrden(){
        BigDecimal total = new BigDecimal(0);
        for(Iterator<DetalleOrden> it = items.iterator(); it.hasNext();){
            total = total.add(it.next().totalItem());
        }
        return total;
    }
    
}
