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
public class Curso {
    private String nombre;
    private int maximoAlumno;
    private List<Alumno> alumno;
    private List<Float> notas;
    
    public Curso (String nombre, int maximoAlimno){
        this.nombre = nombre;
        this.maximoAlumno = maximoAlumno;
        this.alumno = new ArrayList <>();
        this.notas = new ArrayList <>();
    }
    public String getNombre (){
        return nombre;
    }
    public boolean agregarAlumno(Alumno nuevoAlumno){
        if(this.alumno.size()<this.maximoAlumno){
            this.alumno.add(nuevoAlumno);
            nuevoAlumno.addCurso(this);
            return true;
        }
        return false;
    }
    public boolean tieneIngresantesAnterioresA(int añodeingreso){
        Iterator <Alumno> it = this.alumno.iterator();
        while (it.hasNext()){
            Alumno alumno = it.next();
            if (alumno.getAñodeIngreso()<añodeingreso)
                return true;
        }
        return false;
    }

    
}
    
}
