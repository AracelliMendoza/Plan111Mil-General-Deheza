
package cine;


public class Personaje {
    private String nombre; 
    private Actor actor;
    private Rol rol;
          
    
    public Personaje(String nombre, Actor actor, Rol rol){
        this.nombre = nombre;
        this.actor=actor;
        this.rol=rol;
    
    }
    
    public String getnombre(){
    
    return nombre;
    }
    
    public void setnombre(String nombre){
    this.nombre = nombre;
    }
    
    public Actor getactor(){
    return actor;
    }
    
    public void setActor(Actor actor){
    
  this.actor=actor;
    }
    
    public Rol getrol(){
    
        return rol;
    }
    
    public void setRol(Rol rol){
    this.rol = rol;
    }
    

    @Override
    public String toString(){
    
    return this.nombre+"interpretado por " +actor;
    
    }
}
