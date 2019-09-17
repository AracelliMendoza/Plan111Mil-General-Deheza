
package ejercicios;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        //1.	Si un lote de terreno tiene X metros de frente por Y metros de fondo: 
        //calcular e imprimir la cantidad da metros de alambre para cercarlo 
        //(X e Y serán leídos al comenzar el programa).
        Scanner terreno = new Scanner (System.in);
        
        int x, y, resultado;
        
        System.out.println("Ingresar lado del terreno: ");
        x = terreno.nextInt();
        
        System.out.println("Ingresar el otro lado del terreno: ");
        y = terreno.nextInt();
        
        resultado = x*y;
        
        System.out.println("La cantidad de metros es: "+resultado+"Metros cuadrados");
        
                
    }
    
    
    
}
