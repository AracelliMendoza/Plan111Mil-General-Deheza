
import java.util.ArrayList;
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
public class Profesor extends Persona {
    
    private int cantidadHoras;
    private float sueldo;
    private List<Curso> cursosDictados;
    
    public Profesor(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.cursosDictados = new ArrayList<Curso>();
    }
    
    public void setCantidadHoras(int horas){
        this.cantidadHoras = horas;
    }
    
    public int getCantidadHoras(){
        return cantidadHoras;
    }
    
    public void setSueldo(float sueldo){
        this.sueldo = sueldo;
    }
    
    public float getSueldo(){
        return sueldo;
    }
    
    public void addCurso(Curso curso){
        this.cursosDictados.add(curso);
    }
    
    public void obtenerCursos(Alumno añoDeIngreso){
        
    }
    
}
