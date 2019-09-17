
package practico;

import java.util.Scanner;


public class Ejercicio05 {
    public static void main() {
        
        Scanner ejercicio05 = new Scanner (System.in);
        
        System.out.println("Ejercicio5: Ingresar como dato el perímetro de un cuadrado. \nCalcular e imprimir el volumen del cubo que tiene como lado el cuadrado antes mencionado. (V=a3). ");
    
    int lado, perimetro, volumen;
    
    System.out.println("Ingresar perimetro del cuadrado: ");
    perimetro = ejercicio05.nextInt();
    
    lado = perimetro/4;
    
    volumen = (int) Math.pow(lado,3); 
    System.out.println("El volumen del cubo es: "+volumen);
    }
}
