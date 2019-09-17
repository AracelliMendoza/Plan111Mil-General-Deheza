
package cine;


public class Personaje {
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;
    
    public Personaje(){
    }
    public Personaje(String nombreEnPelicula, Actor actor, Rol rol){
        this.nombreEnPelicula=nombreEnPelicula;
        this.actor=actor;
        this.rol=rol;
    }
    public String getNombreEnPelicula(){
        return nombreEnPelicula;
    }
    public void setnombreEnPelicula(String nombreEnPelicula){
        this.nombreEnPelicula=nombreEnPelicula;
    }
    public Actor getActor(){
        return actor;
    }
    public void setActor(Actor actor){
        this.actor=actor;
    }
    public Rol getRol(){
        return rol;
    }
    public void setRol(Rol rol){
        this.rol=rol;
    }
    @Override
    public String toString(){
        return nombreEnPelicula + "interpretado por" + actor;
    } 
}
