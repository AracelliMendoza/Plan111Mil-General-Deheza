
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio08 {
    
    public static void main() {
        
    
    Scanner ejercicio08 = new Scanner(System.in);
    
    JOptionPane.showMessageDialog(null,"Ejercicio8: Leer desde el teclado un valor que corresponda a la distancia entre dos puntos \nexpresada en Dmts. y transformarla en Cms., Imprimirla. ");
    float punto1, punto2, distancia, distancia2;
    
    System.out.println("Ingresar la distancia del primero punto en Dmts: ");
    punto1 = ejercicio08.nextFloat();
    
    System.out.println("Ingresar la distancia del segundo punto en Dmts: ");
    punto2 = ejercicio08.nextFloat();
    distancia = (float) (punto1*0.01);
    distancia2 = (float) (punto2*0.01);
    
    JOptionPane.showMessageDialog(null, "La distancia del punto uno en Cms es: "+distancia+"\nLa distancia del punto dos en Cms es: "+distancia2);
    
    
    } 
}
