
package practico;

import java.util.Scanner;


public class Ejercicio03 {
    public static void main() {
        
       Scanner ejercicio03 = new Scanner (System.in);
       System.out.println("Ejercicio3: Un pintor sabe que con una pintura determinada puede pintar 3,6 metros cuadrados por cada medio litro. \nSabiendo la altura y el largo de la pared a pintar, informar cuántos litros de pintura utilizará (Altura y Largo en metros)");
    
    int largo1, altura;
    float r, litro;
    
    
    System.out.println("Ingresar largo de la pared en metros: ");
    largo1 = ejercicio03.nextInt();
    
    System.out.println("Ingresar altura de la pared en metros: ");
    altura = ejercicio03.nextInt();
    
    r = largo1*altura;
    litro = (float) ((r*0.5)/3.6);
     
    System.out.println("La cantidad de pintura que se utilizará para pintar la pared es: "+litro);


    }
}
