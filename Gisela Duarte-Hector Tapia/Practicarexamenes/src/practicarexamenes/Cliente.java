
package practicarexamenes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int dni;
    private List<Orden> orden;
    
   
    public Cliente (String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
        orden = new ArrayList<>();
    } 
    
    public String getNombre (){
        return nombre;
    }
    public int getDni (){
        return dni;
    }
   public void addOrden (Orden o){
       orden.add(o);
       
   }
     
    }
