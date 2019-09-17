
package examen;

import java.util.List;


public class Equipo {
    
    private String nombre;
    private List <String> jugadores;
    private int maximodejugadores;
    private String categoriadelequipo;
    
public Equipo (String nombre, List jugadores, int maximodejugadores, String categoriadelequipo){

this.nombre=nombre;
this.jugadores=jugadores;
this.maximodejugadores=maximodejugadores;
this.categoriadelequipo=categoriadelequipo;
        
}

    Equipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    
    public int getMaximodejugadores() {
        return maximodejugadores;
    }

    public String getCategoriadelequipo() {
        return categoriadelequipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     //método para agregar un jugador
    public void addunJugador(String jugador) {
        this.jugadores.add(jugador);
    }
     
    public void setMaximodejugadores(int maximodejugadores) {
        this.maximodejugadores = maximodejugadores;
    }

    public void setCategoriadelequipo(String categoriadelequipo) {
        this.categoriadelequipo = categoriadelequipo;
    }
    
}
