
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;

 class Ejercicio07 {
    
     public static void main() {
         
         
         Scanner ejercicio07 = new Scanner (System.in);
         
         System.out.println("Ejercicio7: Dados los coeficientes A, B, C; de una ecuación de segundo grado, calcular e imprimir las raíces de dicha ecuación.\n- NOTA: Suponer la no existencia de raíces complejas.");
    
    int coeficienteA, coeficienteB, coeficienteC, raiz, x1, x2;
    
    System.out.println("Ingresar el coeficiente A: ");
    coeficienteA = ejercicio07.nextInt();
    
    System.out.println("Ingresar el coeficiente B: ");
    coeficienteB = ejercicio07.nextInt();
    
    System.out.println("Ingresar el coeficiente C: ");
    coeficienteC = ejercicio07.nextInt();
    
    //la función Mart.sqrt sirve para calcular la raiz de un número y Math.pow, sirve para calcular un número elevado a una potencia.
    raiz= (int) Math.sqrt((Math.pow(coeficienteB, 2))-(4*coeficienteA*coeficienteB*coeficienteC));
    x1 = ((-coeficienteB)+raiz)/(2*coeficienteA);
    x2 = ((-coeficienteB)-raiz)/(2*coeficienteA);
   
    if (raiz<0){
        System.out.print("No existe soluciones para está ecuación");
        JOptionPane.showMessageDialog(null,"La incógnita es = "+raiz);
                
    } 
    
    if (raiz==0){
        System.out.print("Existe una única solución para este ecuación");
    
    
    } else{
        System.out.print("Existen dos posibles soluciones para esta ecuación: ");
        JOptionPane.showMessageDialog(null,"Primera solución es: "+x1);
        JOptionPane.showMessageDialog(null,"Segunda solución es: "+x2);
       }
         
         
         
     }
     
     
     
}
