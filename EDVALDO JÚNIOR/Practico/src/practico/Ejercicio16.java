
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio16 {
    
    public static void main() {
        
        Scanner ejercicio16 = new Scanner(System.in);
        
        int nume1, nume2, re, condicional; 
        do {
          
    JOptionPane.showMessageDialog(null, "Ejercicio16: Leer dos números, calcular e imprimir el cociente entre el mayor y el menor."); 
    
    System.out.println("Ingresar dos número: ");
    nume1 = ejercicio16.nextInt();
    nume2 = ejercicio16.nextInt();
   
    if(nume1>nume2){
    re = nume1/nume2;
        JOptionPane.showMessageDialog(null,"El coeciente entre en número uno que es mayor y el segundo por ser el menor es: "+re);
        } else {
        re = nume2/nume1;
            JOptionPane.showMessageDialog(null,"El cociente entre el segundo número por ser el mayor y el primero el menor es: "+re);
           }
        System.out.println("Desea repetir el ejercicio número 16, SÍ [1]  NO[0]: ");
            condicional = ejercicio16.nextInt();
        }while(condicional != 0 );
        
    }
    
}
