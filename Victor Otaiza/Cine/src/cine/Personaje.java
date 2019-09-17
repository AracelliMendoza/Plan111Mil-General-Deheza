
package cine;


public class Personaje {
    private String nombre;
    private Actor actor;
    private Rol rol;
    
    public Personaje(){    
    }
    
    public Personaje (String nombre, Actor actor, Rol rol){
        this.nombre=nombre;
        this.actor=actor;
        this.rol=rol;
    }
    
    public String getNombre(String nombre){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Actor getActor(Actor actor){
        return actor;
    }
    
    public void setActor(Actor actor){
        this.actor=actor;
    }
    
    public Rol getRol(Rol rol){
        return rol;
    }
    
    public void setRol(Rol rol){
        this.rol=rol;
    }
    @Override
    public String toString(){
        return nombre+" interpretado por "+actor;
    }
}
