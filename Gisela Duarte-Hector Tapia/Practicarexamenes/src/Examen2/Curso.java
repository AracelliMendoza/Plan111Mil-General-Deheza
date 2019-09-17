/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion19
 */
public class Curso {
    private String nombreCurso;
    private int cupo;
    private float notaAprobacion;
    private List<Inscripcion> inscripciones;
    
    public Curso (float nota, int cupo){
        this.notaAprobacion = nota;
        this.cupo = cupo;
        this.inscripciones = new ArrayList<>();
    }
    public void setNombreCurso (String n){
        this.nombreCurso = n;
        
    }
    public float getNotaAprobacion (){
        return notaAprobacion;
    
        
        
    }
 
    
}
