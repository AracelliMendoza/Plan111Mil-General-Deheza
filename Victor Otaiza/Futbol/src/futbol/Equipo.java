/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.util.List;

/**
 *
 * @author Capacitacion18
 */
public class Equipo {
    
    private String nombre;
    private List<String> jugadores;
    private int maxJugadores;

    public Equipo(String nombre, List<String> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaxJugadores(int maxJugadores) {
        this.maxJugadores = maxJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMaxJugadores() {
        return maxJugadores;
    }
    
    public void addJugador(String nombre){
        if(jugadores.size() < maxJugadores){
            jugadores.add(nombre);
        }else{
            System.out.println("El equipo ya cuenta con todos los jugadores");
        }
        
    }
    
}
