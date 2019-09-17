
package clase.vector;
import java.util.Scanner;
public class lmc {
    public static void main(String[] args){
        double peso, altura, imc;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su altura");
        altura = teclado.nextFloat();
        System.out.println("Ingrse su peso");
        peso = teclado.nextFloat();
        imc = peso/Math.pow(altura, 2);
        System.out.printf("Su indice de masa coporal es: %.2f", imc);
        if (imc <= 18.5){
            System.out.println("tienes in imc bajo");
         } else if (imc<= 24.90){
             System.out.println("tienes un imc normal");
         }    else{
                     System.out.println("tienes un imc alto");
                     }
         }
        
        
    }
    
