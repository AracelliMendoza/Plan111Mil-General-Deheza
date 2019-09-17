
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio15 {
    
    
    public static void main() {
        Scanner ejercicio15 = new Scanner (System.in);
         int nu1, nu2, nu3, condicional=0;
         
        do{
    JOptionPane.showMessageDialog(null, "Ejercicio15: Leer tres números distintos e imprimir el mayor."); 
       
        
        System.out.println("Ingresar el primero número: ");
        nu1 = ejercicio15.nextInt();
        
        System.out.println("Ingresar el segundo número: ");
        nu2 = ejercicio15.nextInt();
        
        System.out.println("Ingresar el tercero número: ");
        nu3 = ejercicio15.nextInt();
    
            if(nu1>nu2 && nu1>nu3){
            JOptionPane.showMessageDialog(null,"El mayor número es: "+nu1);
            
            }else {
                if (nu2>nu3){
                    JOptionPane.showMessageDialog(null,"El mayor número es: "+nu2);
                
                } else {
                    JOptionPane.showMessageDialog(null,"El mayor número es: "+nu3);
                }
            }
            System.out.println("Deseas Repetir el ejercicio 15, SÍ[1]  NO [0]: ");
    } while (condicional != 0);
        
    }
            
}
