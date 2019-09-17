
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio20 {
    
    public static void main() {
        
        Scanner ejercicio20 = new Scanner (System.in);
        
         int numero06, numero07, totalsuma, condicional; 
        
               do {
            
                JOptionPane.showMessageDialog(null, "Ejercicio20: Leer dos números e indicar mediante un mensaje si la suma es mayor que setecientos treinta ");
               
            
                System.out.println("Ingresar dos números: ");
                numero06 = ejercicio20.nextInt();
                numero07 = ejercicio20.nextInt();
                
                totalsuma = numero06 + numero07;
                if(totalsuma > 730){
                    JOptionPane.showMessageDialog(null,"LA SUMA DE LOS DOS NÚMEROS SUPERA LOS 730 Y EL RESULTADO ES: "+totalsuma);
                
                }else {
                    JOptionPane.showMessageDialog(null,"LA SUMA DE LOS DOS NÚMEROS NO SUPERA LOS 730 Y EL RESULTADO ES : "+totalsuma);
                }
            System.out.println("Desea repetir el ejercicio número 20, SÍ [1]  NO[0]: ");
            condicional = ejercicio20.nextInt();
            } while(condicional != 0);
        
    }
    
}
