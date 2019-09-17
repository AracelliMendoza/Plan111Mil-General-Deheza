
package cursoplan111;

import java.util.Scanner;


public class MasaCorporal {
    public static void main(String[] args){
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese peso: ");
        peso = teclado.nextFloat();
        
        System.out.println("Ingrese altura: ");
        altura = teclado.nextFloat();
        
        imc = peso/(Math.pow(altura, 2));
        System.out.printf("Su indice de masa corporal es de: %.2f" ,imc);
        if(imc <= 18.5){
            System.out.println("Tienes un imc bajo");
        }else if(imc <= 24.90){
            System.out.println("Tienes un imc normal");
        }else{
            System.out.println("Tienes un imc alto");
        }  
        
    }
}
