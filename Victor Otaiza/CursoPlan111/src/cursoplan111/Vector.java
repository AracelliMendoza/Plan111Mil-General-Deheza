
package cursoplan111;
import java.util.Scanner;


public class Vector {
    public static void main (String[] args){
        
        int[] notas = new int[5];
        int i;
        Scanner teclado = new Scanner(System.in);
        
       for(i=0; i<notas.length; i++){
           System.out.println("Ingrese un valor: ");
           notas[i] = teclado.nextInt();
       }
        
        System.out.println("El array tiene " + notas.length + " elementos");
        System.out.println("Los elementos son:");
        for(i=0; i<notas.length; i++){
            System.out.print(notas[i]+" ");
        }
        System.out.println();
    }
}
