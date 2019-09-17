
package cine;


public class Rol {
    
    private String nombre;
    
    public Rol(String nombre){
    
    }
    
    public String getnombre(String nombre){
    
        return nombre;
       
    }
    
    public void setnombre(String nombre){
    
        this.nombre=nombre;
    }
    
    @Override
    public String toString(){
    
    return this.nombre;
    }
    
    
}
