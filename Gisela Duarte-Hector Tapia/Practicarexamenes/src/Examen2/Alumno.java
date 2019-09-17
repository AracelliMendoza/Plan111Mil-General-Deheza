/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

/**
 *
 * @author capacitacion19
 */
public class Alumno {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Alumno (int dni, String apellido, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;    
    }
    public int getDni (){
        return dni;
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido (){
        return apellido;
    }
    public int getEdad (){
        return edad;
    }
    public boolean equals (Object o){
        Alumno a = (Alumno)o;
        if (dni == a.getDni() && nombre.equalsIgnoreCase(a.getNombre())&& apellido.equalsIgnoreCase(a.getApellido()) && edad == a.getEdad())
        {
            return true;    
    }
    else return false;
    }

    
    
}
