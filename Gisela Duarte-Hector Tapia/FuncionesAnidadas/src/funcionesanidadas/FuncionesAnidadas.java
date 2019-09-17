
package funcionesanidadas;

import java.util.Scanner;


public class FuncionesAnidadas {

  
    public static void main(String[] args) {
    
        String usuario="hector";
         String contraseña="12345";
         
         verificar(usuario, contraseña);
        
        //Scanner Teclado= new Scanner(System.in);
    } 
    public static void verificar(String usuario,String contraseña ){    
             String usuariobd= "hector";
             String contraseñabd = "12345"; 
             if(usuariobd.equals(usuario)&& contraseñabd.equals(contraseña)){
                saludar(usuario);
                
             }
             else{
                 error(usuario);
             
             
             }
    }
    public static String saludar(String nombre){
        System.out.println("Hola, bienveido"+nombre);
        return null;
    }
    public static String error(String nombre){
        System.out.print("Error en la validacion: "+nombre+" Es tu usuario?");
        return null;
    }
  }
    
    
       

    

