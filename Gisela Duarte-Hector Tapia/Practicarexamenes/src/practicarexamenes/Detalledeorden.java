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
public class Detalledeorden {
  private Notebook item;
  private float preciounitario;
  private int cantidad;
  
  public Detalledeorden (Notebook item, float preciounitario, int cantidad){
      this.item = item;
      this.preciounitario = preciounitario;
      this.cantidad = cantidad;
        
    }
  public float getPreciounitario (){
      return preciounitario;
      
  }
  public int getCantidad (){
      return cantidad;
  }
  public  Notebook getItem(){
      return item;
      
  }
}
