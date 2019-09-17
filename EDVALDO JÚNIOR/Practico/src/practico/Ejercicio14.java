
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio14 {
    
    public static void main() {
        Scanner ejercicio14 = new Scanner(System.in);
         int num, num2, mayor; 
       
         JOptionPane.showMessageDialog(null, "Ejercicio14: Leer dos números e imprimir el mayor, suponer que son distintos."); 
    
     
     System.out.println("Ingresar un número intero: ");
     num = ejercicio14.nextInt();
     
     System.out.println("Ingresar otro número intero distinto al primero: ");
     num2 = ejercicio14.nextInt();
            if(num>num2){
                JOptionPane.showMessageDialog(null, "El primero número es mayor que el segundo");
            }else {
            JOptionPane.showMessageDialog(null, "El segundo número es mayor que el primero");
            }
           
    }
    
}
