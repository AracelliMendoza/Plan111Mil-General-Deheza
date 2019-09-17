/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Capacitacion18
 */
public class Estudiante extends Persona {
    
    private List<String> cursos;
    private List<Float> calificaciones;
    
    public Estudiante(String nombre, String direccion) {
        super(nombre, direccion);
        cursos = new ArrayList();
        calificaciones = new ArrayList();
    }
    
    @Override
    public String toString(){
        return "Estudiante" + super.toString();
    }
    
    public void agregarCalificacion(String curso, Float calificacion){
        cursos.add(curso);
        calificaciones.add(calificacion);
    }
       
}
