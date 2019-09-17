
package ejercicioherencia;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Capacitacion18
 */
public class Profesor extends Persona {
    
    private List<String> cursos;
    private double salario;
    
    public Profesor(String nombre, String direccion) {
        super(nombre, direccion);
        cursos = new ArrayList();
    }
    
    @Override
    public String toString(){
        return "Profesor: " + super.toString();
    }
    
    
    
}
