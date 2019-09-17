
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio10 {
 
    
    public static void main() {
                
         Scanner ejercicio10 = new Scanner (System.in);
         
         int condicional;
         
         do {
 
    JOptionPane.showMessageDialog(null, "Ejercicios: 10.Indicar si un número ingresado es par o impar. \n" +
"11.	Leer un número e indicar si este es múltiplo de dos. \n" +
"12.	Leer un número e indicar si el mismo es divisible por tres.");

    
      int number;     
        
    System.out.println("Ingresar un número: ");
    number = ejercicio10.nextInt();
    
    if(number % 2 == 0) {
    System.out.println("EL NÚMERO INGRESADO ES UN NÚMERO PAR");
    System.out.println("ES UN NÚMERO MULTIPLO POR DOS");
    
    }else {
        System.out.println("EL NÚMERO INGRESADO ES UN NÚMERO IMPAR");
        if(number%3 == 0){
        System.out.println("EL NÚMERO INGRESADO ES DIVISIBLE POR TRES");
        } else {
        System.out.println("El número ingresado no es divisible por tres");
        }
    }
    System.out.println("Desea repetir el ejercicio número 18, SÍ [1]  NO[0]: ");
    condicional = ejercicio10.nextInt();
}while(condicional != 0 );
         
    }
}
