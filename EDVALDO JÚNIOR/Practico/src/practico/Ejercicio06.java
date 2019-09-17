
package practico;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main() {
        
        Scanner ejercicio06 = new Scanner (System.in); 
        
        System.out.println("Ejercicio6: Ingresar por teclado los precios correspondientes a cinco artículos y las cantidades vendidas de cada uno de ellos. \nCalcular e imprimir el importe total de ventas de cada uno y un importe total de lo vendido.");

    int articulos =5, precio, cantidad, importeindividual, importetotal=0;
    
    for(int i=1;i<=articulos;i++){
    System.out.println("Ingresar el precio del articulo "+i+": ");
    cantidad = ejercicio06.nextInt();
    
    System.out.println("Ingresar cantidad vendida del articulo "+i+": ");
    precio = ejercicio06.nextInt();
    importeindividual = precio * cantidad;
    System.out.println("EL importe total del Articulo ingresado es $: "+importeindividual);
    
    importetotal =importetotal + importeindividual;
    }
    System.out.print("La sumatoria del importe total de los 5 artículos ingredados es $: "+importetotal);
        
    }
}
