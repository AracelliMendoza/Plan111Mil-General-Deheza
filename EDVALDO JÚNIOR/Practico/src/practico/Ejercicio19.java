
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio19 {
    
    public static void main() {
        
        Scanner ejercicio19 = new Scanner (System.in);
        int lado1, lado2, lado3, condicional;
        
        do {
              
            
        JOptionPane.showMessageDialog(null, "Ejercicio19: Dados los tres lados de un triángulo, informar si se trata de un triángulo equilátero, isósceles o escaleno.");
            
    
            System.out.println("Ingresar tres lados de un triángulo: ");
            lado1 = ejercicio19.nextInt();
            lado2 = ejercicio19.nextInt();
            lado3 = ejercicio19.nextInt();
            
            if (lado1 == lado2 && lado1 == lado3){        
                JOptionPane.showMessageDialog(null,"El triángulo es EQUILATERO");
            
            }else{
                    if(lado1 == lado2 || lado1 == lado3){
                    JOptionPane.showMessageDialog(null,"El triángulo es ISÓSCELES");
                    
                    } else {
                    JOptionPane.showMessageDialog(null,"El triángulo es ESCALENO");
                    
                    }
            
                }
            
            System.out.println("Desea repetir el ejercicio número 19, SÍ [1]  NO[0]: ");
            condicional = ejercicio19.nextInt();
            } while(condicional != 0);
        
    }
    
}
