
package cursoplan111;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args){
        float[] parx = new float[10];
        float[] pary = new float[10];
        float sumax = 0, sumay = 0;
        int cont;
        Scanner teclado = new Scanner(System.in);
        
        for(cont=0; cont<10; cont++){
            //Agrega valor al par x y lo suma
            System.out.print((cont+1)+": Ingrese el valor de x: ");
            parx[cont] = teclado.nextFloat();
            sumax = parx[cont] + sumax;
            
            //Agrega valor al pary y lo suma
            System.out.print((cont+1)+": Ingrese valor de y: ");
            pary[cont] = teclado.nextFloat();
            sumay = sumay + pary[cont];
            
        }
        for(cont=0; cont<10; cont++){
            System.out.print(parx[cont]);
        }
        System.out.println();
        for(cont=0; cont<10; cont++){
            System.out.print(pary[cont]);
        }
        System.out.println();
        
        System.out.println("La sumatoria de los valores de x es: "+sumax);
        System.out.println("La sumatoria de los valores de y es: "+sumay);
    }
}
