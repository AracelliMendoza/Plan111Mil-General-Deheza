
package practico;

import java.util.Scanner;


public class Ejercicio02 {
    public static void main() {
        
        Scanner ejercicio02 = new Scanner (System.in);
        
        System.out.println("Ejercicio2: Realizar algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y división.");    
    
      int numero1, numero2, producto, suma, resta;
      float division;
    
    System.out.println("Ingresar un número: ");
    numero1 = ejercicio02.nextInt();
    
    System.out.println("Ingresar otro número: ");
    numero2 = ejercicio02.nextInt();
    
    suma = numero1+numero2;
    resta = numero1-numero2;
    producto = numero1*numero2;
    
    System.out.println("La Suma de estos dos números es: "+suma);
    System.out.println("La Resta de estos dos números es: "+resta);
    System.out.println("El Producto de estos dos números es: "+producto);
    
    if(numero1 ==0 || numero2 ==0 )
        {
            System.out.println("No se peude dividir por Cero"); 
    
            } else {
            division = numero1/numero2;
        System.out.println("La División de estos dos números es: "+division);                
    }
        
        
        
        
    }
}
