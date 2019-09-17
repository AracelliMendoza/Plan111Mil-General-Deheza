
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
public class Alumno extends Persona{
    
    private int añoDelIngreso;
    private List<Curso> cursadas;
    
    public Alumno(String nombre, String apellido, int dni, int añoDelIngreso) {
        super(nombre, apellido, dni);
        this.añoDelIngreso = añoDelIngreso;
        this.cursadas = new ArrayList<Curso>();
    }
    
    public int getAñoDelIngreso(){
        return añoDelIngreso;
    }
    
    public void addCurso(Curso curso){
        cursadas.add(curso);
    }
    
    
    
}
