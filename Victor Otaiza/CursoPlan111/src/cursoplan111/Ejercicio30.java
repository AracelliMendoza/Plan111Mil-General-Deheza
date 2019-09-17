
package cursoplan111;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args){
        int cant, cont;
        float cocient;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de pares a ingresar:");
        cant = teclado.nextInt();
        
        int[] parx = new int[cant];
        int[] pary = new int[cant];
        
        for(cont=0; cont<cant; cont++){
            System.out.println("Ingrese valor de X");
            parx[cont] = teclado.nextInt();
            System.out.println("Ingrese valor de Y");
            pary[cont] = teclado.nextInt();
            
            cocient = parx[cont]/pary[cont];     
            System.out.printf("El cociente de los pares eingresados es:  %.2f",cocient);
            System.out.println();
        }
    }
}
