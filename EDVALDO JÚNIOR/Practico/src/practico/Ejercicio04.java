
package practico;

import java.util.Scanner;


public class Ejercicio04 {
    public static void main() {
        
        Scanner ejercicio04= new Scanner (System.in);
        
        System.out.println("Ejercicio4: Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables \ny muestre cuánto valen al final las dos variables (recuerda la asignación) ");
    
    int a, b, aux=0;
    
    System.out.println("Ingresar número 1: ");
    a = ejercicio04.nextInt();
    
    System.out.println("Ingresar número 2: ");
    b = ejercicio04.nextInt();
    
    a = aux;
    a = b;
    b = aux;
    
    System.out.println("Los valores intercambiados son: " +"número 1 es = "+a +"Y número 2 es = "+b);
                
    }
}
