
package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        
    
    //formula: peso/alutara al cuadrado
        
        double peso, altura, imc;
        
        Scanner masa = new Scanner(System.in);
        
        System.out.println("Ingresar la altura: ");
        altura = masa.nextFloat();
        
        System.out.println("Ingresar el peso: ");
        peso = masa.nextFloat();
        
      imc = peso/Math.pow(altura, 2);
     
        System.out.printf("Su indice de masa corporal es: %,2f",imc);
        
        if(imc <= 18.5){
        
            System.out.println("\nTienes un Indice de masa Corporal  bajo");
       
                }else if(imc<=24.90){
        
            System.out.println("Tienes un Indice de masa Corporal normal");       
        
                }else {
            System.out.println("Tienes un Indice corporal alto");
        }
        
        
    }       
    
}
