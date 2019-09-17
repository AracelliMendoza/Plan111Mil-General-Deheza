
package practico;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio22 {
    
    public static void main() {
        
        Scanner ejercicio22 = new Scanner(System.in);
        int [] vector = new int[4];
        int condicional;
        do{    
            JOptionPane.showMessageDialog(null, "Ejercicio22: Leer cuatro números distintos e imprimirlos en orden ascendente");
            
            for(int j=0; j<vector.length;j++){

                System.out.println("Ingresar un número: ");
                vector[j] = ejercicio22.nextInt();

            }

            Arrays.sort(vector);
            //Es una función de la libreria "import java.util.Arrays" que ordena los números de un arreglo de forma ascendente.

            JOptionPane.showMessageDialog(null,"Los elementos ordenados del vector/Array son: "+Arrays.toString(vector));
            //Arrays.toString() te imprime todos los elementos de un vector que pases como parametro.

            System.out.println("Desea repetir el ejercicio número 21, SÍ [1]  NO[0]: ");
                    condicional = ejercicio22.nextInt();
              } while(condicional != 0);
        
    }
    
}
