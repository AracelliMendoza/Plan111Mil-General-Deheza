
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio18 {
   
    public static void main() {
        
        Scanner ejercicio18 = new Scanner (System.in);
        int numero01, numero02, numero03, numero04, numero05, totals, raiz, condicional;
        
        do {
                
            JOptionPane.showMessageDialog(null, "Ejercicio18: Leer tres números y sumarlos, si la suma es mayor que 10, calcular la raíz cuadrada"
                    + "\nde la suma e imprimirla, de lo contrario, leer dos números más y sumarlos junto a los primeros, luego imprimir la suma.");
            
            System.out.println("Ingresar tres números: ");
            numero01 = ejercicio18.nextInt();
            numero02 = ejercicio18.nextInt();
            numero03 = ejercicio18.nextInt();
            
            totals = numero01 + numero02 + numero03;
            
            if(totals>10){
                raiz = (int) Math.sqrt(totals);
            JOptionPane.showMessageDialog(null,"LA RAIZ DE LA SUMA DE LOS TRES NÚMEROS ES: "+raiz);
            } else{
            System.out.println("Ingresar dos número más: ");
            numero04 = ejercicio18.nextInt();
            numero05 = ejercicio18.nextInt();
                
            totals = numero01 + numero02 + numero03 + numero04 + numero05;
            JOptionPane.showMessageDialog(null,"LA SUMA DE LOS CINCO NÚMEROS INGRESADOS ES: "+totals);
            }
            System.out.println("Desea repetir el ejercicio número 18, SÍ [1]  NO[0]: ");
            condicional = ejercicio18.nextInt();
            }while(condicional != 0 );
        
    }
    
}
