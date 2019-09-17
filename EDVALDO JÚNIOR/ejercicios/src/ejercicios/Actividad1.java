
package ejercicios;
import java.util.Scanner;

public class Actividad1 {
     
    public static void main(String[]args){
    
        int numero, numero2, suma, multiplicacion, resta;
        float division;
     Scanner Teclado = new Scanner(System.in);
    
     
    System.out.print("Ingresar dos  número: ");
    numero = Teclado.nextInt();
    numero2 = Teclado.nextInt();
   
    
          suma= numero+numero2;
          multiplicacion = numero*numero2;
          division = numero%numero2;
          resta = numero-numero2;
          
     System.out.println("La suma de los número es: "+ suma);
     System.out.println("La resta de los números es: "+resta);
     System.out.println("La multiplicacion de los número es: "+multiplicacion);
     System.out.println("La division de los número es: "+division);
     
     
    }

}