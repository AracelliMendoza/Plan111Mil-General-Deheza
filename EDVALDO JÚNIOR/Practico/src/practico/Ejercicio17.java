
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio17 {
    
    public static void main() {
        
        Scanner ejercicio17 = new Scanner (System.in);
              
            int nume01 =0, nume02 = 0, nume3, resu, condicional;
        
        
                do{
                                 
    JOptionPane.showMessageDialog(null, "Ejercicio17: Leer dos números, si el primero es el mayor, sumarlos, si no multiplicarlos, imprimir el resultado."); 
    System.out.println("Ingresar dos número: ");
    nume01 = ejercicio17.nextInt();
    nume02 = ejercicio17.nextInt();
    
            if(nume01>nume02){
            
            resu = nume01+nume02;
            JOptionPane.showMessageDialog(null, "COMO EL PRIMERO NÚMERO ES MAYOR, SE REALIZA LA SUMA DE ÉSTOS QUE ES: "+resu);
            } else{
                resu = nume01*nume02;
                JOptionPane.showMessageDialog(null, "COMO EL SEGUNDO NÚMERO ES MAYOR, SE REALIZA LA MULTIPLICACIÓN DE ÉSTOS QUE ES: "+resu);
              }
            
            System.out.println("Desea repetir el ejercicio número 17, SÍ [1]  NO[0]: ");
            condicional = ejercicio17.nextInt();
            }while(condicional != 0);
        
    }
    
}
