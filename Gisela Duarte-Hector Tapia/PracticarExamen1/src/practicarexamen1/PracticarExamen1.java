/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarexamen1;

/**
 *
 * @author capacitacion19
 */
public class PracticarExamen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso111= new Curso("111", 40); 
        Alumno alumno=new Alumno("Joffrey", " Baratheon", 25346123, 2018);
        alumno.addCurso(curso111);
        
        System.out.println(alumno.getNombre()+" "+ alumno.getApellido()+" "+ alumno.getDni()+" "+ alumno.getAñodeIngreso());
        System.out.println (curso111.getNombre());
    }
    
}
