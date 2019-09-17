
package validacionusuario;

import java.util.Scanner;


public class Usuario {
    
        
    public static void Saludar(String nombre){
        System.out.println("Hola, bienvenido " + nombre);
    }
    
    public static void Error(String nombre){
        System.out.println("Error en la validacion: " + nombre + " Es tu usuario?");
    }
    
    public static void Verificar(String usuario, String pass){
        String usuarioValido="Victor";
        String passValido="1234";
        
        if(usuarioValido.equals(usuario) && (passValido.equals(pass))){
            Saludar(usuario);
        }else{
            Error(usuario);            
        }
        
    }
    
    public static void main(String[] args){
       
        Scanner teclado= new Scanner(System.in);
        String usuario;
        String pass;
        
        
        System.out.println("Ingrese su usuario: ");
        usuario = teclado.next();
        
        System.out.println("Ingrese contrasenia: ");
        pass = teclado.next();
        
        Verificar(usuario, pass);
        
    }
}
