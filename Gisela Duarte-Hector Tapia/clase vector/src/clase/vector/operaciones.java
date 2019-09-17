
package clase.vector;
import java.util.Scanner;

public class operaciones {
    public static void main(String [] args){
        float n1, n2, resultado;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        n1=teclado.nextFloat();
        System.out.println("Ingrese un numero");
        n2=teclado.nextFloat();
        resultado=n1+n2;
        System.out.println("La suma de los dos numeros es: "+resultado);
        resultado=n1-n2;
        System.out.println("La resta de los dos numeros es: "+resultado);
        resultado=n1*n2;
        System.out.println("La multiplicacion de los dos numeros es: "+resultado);
        resultado=n1/n2;
        System.out.println("La division de los dos numeros es: "+resultado);
        
        
        
                
    }
    
}
