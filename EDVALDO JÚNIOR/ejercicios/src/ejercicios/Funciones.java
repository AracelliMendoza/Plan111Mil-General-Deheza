
package ejercicios;

import javax.swing.JOptionPane;


public class Funciones {
   
    
public static void saludar(String nombre){
    
    JOptionPane.showMessageDialog(null,"HOLA BIENVENIDO" +nombre);

} 


public static void error(String nombre){
    
    JOptionPane.showMessageDialog(null,"ERROR EN LA VALIDACIÓN: "+nombre+"¿Es tu usuario?");
    
}

public static void verificar(String usuario, String password){
    String usuariovalido = "edvaldo";
    String micontrasena = "8246";
            
        if (usuariovalido.equals(usuario) && micontrasena.equals(password)){
        
        
       saludar(usuario);
      
        } else{
        error(usuario);
        
        }
 
}


    public static void main(String[] args) {
        
       Funciones llamar = new Funciones();
        String user;
        String contrasena;
        
        System.out.print("Ingresar Usuario: ");
        
        System.out.print("Ingresar contraseña: ");
        
        
        
       
     
        
    }

}
