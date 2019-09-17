
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio21 {
    
    public static void main() {
        
        Scanner ejercicio21 = new Scanner (System.in);
        int ladob, ladoh, perimetror=0, condicional;
        
        do {
              
                JOptionPane.showMessageDialog(null, "Ejercicio21: Leer la base y la altura de un rectángulo, calcular e imprimir el perímetro del rectángulo, "
                    + "\ninformando además si se trata esta figura de un cuadrado (los cuatro lados iguales).");
                        
                  System.out.print("Ingresar base: ");
                  ladob = ejercicio21.nextInt();
                  
                  System.out.print("Ingresar altura: ");
                  ladoh = ejercicio21.nextInt();
                  
                  if(ladob != ladoh){
                      perimetror = (ladob+ladoh)*2;
                      JOptionPane.showMessageDialog(null, "Los números ingresados se trata de un rectángulo y su perimetro es: "+perimetror);
                  
                    }else {
                        JOptionPane.showMessageDialog(null, "Los números ingresados se trata cuadrado y su perimetro es: "+perimetror);
                    
                        }
            
            
            System.out.println("Desea repetir el ejercicio número 21, SÍ [1]  NO[0]: ");
            condicional = ejercicio21.nextInt();
            } while(condicional != 0);
        
    }
    
}
