
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacitacion18
 */
public class Curso {
    
    private String nombre;
    private int maximoAlumnos;
    private List<Alumno> alumnos;
    private List<Float> notas;

    public Curso(String nombre, int maximoAlumnos) {
        this.nombre = nombre;
        this.maximoAlumnos = maximoAlumnos;
        this.alumnos = new ArrayList<Alumno>();
        this.notas = new ArrayList<Float>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean tieneIngresanteAnteriorA(int añoDelIngreso){
        Iterator<Alumno> it = this.alumnos.iterator();
        while(it.hasNext()){
            Alumno alumno = it.next();
            if(alumno.getAñoDelIngreso()<añoDelIngreso){
                return true;
            }
        }
        return false;
    }
    
    
    
}
