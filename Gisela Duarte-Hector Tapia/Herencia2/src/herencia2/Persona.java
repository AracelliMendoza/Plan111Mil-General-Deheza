/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author capacitacion19
 */
public class Persona {
    private String nombre;
       private String direccion;
      
       public Persona (String nombre, String direccion){
           this.nombre=nombre;
           this.direccion=direccion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    
    @Override 
    public String toString()
    { }        
    

    
    
    
    
    
}
