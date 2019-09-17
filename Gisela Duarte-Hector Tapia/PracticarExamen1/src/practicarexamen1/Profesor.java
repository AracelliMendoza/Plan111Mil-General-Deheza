/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarexamen1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion19
 */
public class Profesor extends Persona{
    private int cantidadHoras;
    private float sueldo;
    private List<Curso> cursosDictados;
   
    public Profesor (String nombre, String apellido, int dni){
        super (nombre, apellido, dni);
        cursosDictados = new ArrayList <>();
    }
    public void setcantidadHoras (int horas){
        this.cantidadHoras = horas;
    }
    public int getcantidadHoras (){
        return cantidadHoras;
    }
    public void setSueldo (float sueldo){
        this.sueldo = sueldo;
    }
    public float getSueldo (){
        return sueldo;
    }
    public void addCurso (Curso curso){
        cursosDictados.add(curso);
    }
    public List<Curso> obtenerCursosConIngresanteAnterioresA(int añoDeIngreso){
      Iterator <Curso> it = this.cursosDictados.iterator();
      List<Curso> cursosConIngresantesAnterirores = new ArrayList<>();
      while (it.hasNext()){
          Curso curso = it.next();
          if (curso.tieneIngresantesAnterioresA(añoDeIngreso)){
              cursosConIngresantesAnteriores.add(curso);
          }
      }
      return cursosConIngresantesAnteriores;
    }
}
