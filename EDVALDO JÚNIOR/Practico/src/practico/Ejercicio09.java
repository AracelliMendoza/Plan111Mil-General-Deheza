
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio09 {
    
    public static void main() {
        
        Scanner ejercicio09 = new Scanner (System.in);
        
        JOptionPane.showMessageDialog(null,"Ejercicio9: Teniendo como dato el tiempo transcurrido desde el inicio hasta el final de un acontecimiento cualquiera expresado en días, \nhacer los cálculos necesarios e imprimirlo en MINUTOS.  ");
    int dia, minutos;
    
    System.out.println("Ingresar la cantidad de Días del acontecimiento: ");
    dia = ejercicio09.nextInt();
    
    minutos = dia*24*60;
    
    JOptionPane.showMessageDialog(null,"La cantidad de minutos de estos días transcurridos son: "+minutos);
    }
}
