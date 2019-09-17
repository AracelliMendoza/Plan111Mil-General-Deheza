package ejercicios;

import java.util.Scanner;




public class Passoword {

public static void main (String[]args){

    String user="edvaldo",  clave="edvaldojunior", usuario, contrasena;
    
    
    Scanner login = new Scanner (System.in); 

    System.out.println("Ingresar el nombre de usuario: ");
    usuario = login.next();
    System.out.println("Ingresar la contraseña: ");
    contrasena = login.next();
    
    
    if (usuario.equals(user) && contrasena.equals(clave)){
        
        System.out.println("--BIENVENIDO SEÑOR--");
           
    } else {
    System.out.println("CONTRASEÑA INCORRECTA");
    }
    
}

}

