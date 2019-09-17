
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio13 {
    public static void main() {
        
        Scanner ejercicio13 = new Scanner(System.in);
        int condicional;
        float np;
    
    JOptionPane.showMessageDialog(null,"Ejercicio13: Dado un número entero positivo menor que cien, leerlo desde teclado y  "
            + "indicar si es primo. (Los números primos son aquellos que sólo son divisibles por sí mismos y por uno."
            + "- En el caso del ejemplo, por ser el número leído menor que cien, sólo hay que comprobar que el número "
            + "no sea 2 - 3 - 5 - 7 o múltiple de alguno de estos. "
            + "Si se cumple esta condición, se trata entonces de un número primo. ");
    
     do { 
     np=0;  
    
    np = Float.parseFloat(JOptionPane.showInputDialog("Ingresar un número intero menor que 100: "));
    
        if(np <100){
            if(np!=2 && np!=3 && np!=5 && np!=7){
                if(np%2!=0 && np%3!=0 && np%5!=0 && np%7 !=0){
                    System.out.println("El número ingresado es un número PRIMO");
                        } else {
                
                    System.out.println("EL NÚMERO INGRASADO ES UN NÚMERO MULTIPLO DE ALGUNO DE ESTOS NÚMERO 2, 3, 5 Y 7. \n POR FAVOR INGRESE OTRO NÚMERO QUE NO SEA MULTIPLO DE ÉSTOS");
                }
            
            }else {
             JOptionPane.showMessageDialog(null, "EL NÚMERO INGRESADO NO PUEDE SER 2, 3 , 5, 7 Y TAMPOCO SUS MULTIPLOS");
                
                
            }
            
                           
        }else {
        JOptionPane.showMessageDialog(null,"ERROR, HAS INGRESADO UN NÚMERO MAYOR QUE CIEN");
        
        }
    System.out.print("DESEA REPETIR LA OPERACIÓN SÍ[0]  NO[1]: ");
     condicional=ejercicio13.nextInt();
    } while(condicional == 0);
        
    }
}
