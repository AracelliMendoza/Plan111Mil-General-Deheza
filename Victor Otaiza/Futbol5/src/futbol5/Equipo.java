package futbol5;

import java.util.List;


public class Equipo {
    private String nombre;
    private List<String> jugadores;
    private int maxJugadores;
    
    public Equipo(){
        
    }
    
    public Equipo(String nombre, List<String> jugadores, int maxJugadores){
        this.nombre=nombre;
        this.jugadores=jugadores;
        this.maxJugadores=maxJugadores;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public List<String> getJugador(){
        return jugadores;
    }
    
    public void addJugador(String jugador){
        this.jugadores.add(jugador);
    }
    
    public int getMaxJugadores(){
        return maxJugadores;
    }
    
    public void setMaxJugadores(int maxJugadores){
        this.maxJugadores=maxJugadores;
    }
    
    
    
    
    
    
}
