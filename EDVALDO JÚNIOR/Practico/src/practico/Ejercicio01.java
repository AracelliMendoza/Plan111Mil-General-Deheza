package practico;

import java.util.Scanner;


public class Ejercicio01 {
    
    public static void main() {
        
        Scanner ejercicio01 = new Scanner (System.in);
        
        int largo, ancho, resultado;
        System.out.println("Ejercicio1: 1. Si un lote de terreno tiene X metros de frente por Y metros de fondo: \ncalcular e imprimir la cantidad da metros de alambre para cercarlo (X e Y serán leídos al comenzar el programa).");    
  
        System.out.println("Ingresar largo del terreno: ");
        largo = ejercicio01.nextInt();

        System.out.println("Ingresar ancho del terreno: ");
        ancho = ejercicio01.nextInt(); 

        resultado = (ancho*2)+(largo*2);

          System.out.println("La cantidad de metros de alambre necesario para cercar el terreno es: "+resultado+"m");
         
     System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------");
        
    }
}
