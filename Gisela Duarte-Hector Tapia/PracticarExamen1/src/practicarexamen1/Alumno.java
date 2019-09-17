/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarexamen1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion19
 */
public class Alumno extends Persona{
    private int añodeingreso;
    private List<Curso> cursadas;
    
    public Alumno (String nombre,String apellido, int dni, int añodeingreso){
        super (nombre, apellido, dni);
        this.añodeingreso = añodeingreso;
        this.cursadas = new ArrayList <>();
        
    }
    public int getAñodeIngreso (){
        return añodeingreso;
    }
    public void addCurso (Curso curso){
        cursadas.add(curso);
    }
    @Override
    public String toString(){
        return super.toString()+" "+ this.añodeingreso+" "+this.cursadas.size();
        
    }
    }
    

