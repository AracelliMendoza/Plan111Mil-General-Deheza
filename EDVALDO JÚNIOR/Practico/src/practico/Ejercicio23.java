
package practico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio23 {
    
    public static void main() {
        
       JOptionPane.showMessageDialog(null,"23.	Se leen el sueldo básico y la categoría de un empleado. Para calcular el sueldo neto se \n" +
            "efectúan los siguientes descuentos: Categoría 1: 30% Categoría 2: 25% \n" +
            "Categoría 3: 25% Categoría 4: 10% Para otras Categorías no hay descuentos. \n" +
            "Imprimir el sueldo neto básico y Categoría");
       
        Scanner ejercicio23 = new Scanner (System.in);
        
        int categoria, condicional=0;
        
        Float sueldo = null, porcentaje, sueldototal = null;
    
       do{
        categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de su categoria"));
       
        if (categoria >= 1 && categoria <=4){
            switch (categoria) {
            
                case 1:
                    
                    System.out.println("Ingresar sueldo básico: ");
                    sueldo = ejercicio23.nextFloat();
                    porcentaje = (sueldo*30)/100;
                    sueldototal = sueldo-porcentaje;
                    break;
            
                case 2:
                    System.out.println("Ingresar sueldo básico: ");
                    sueldo = ejercicio23.nextFloat();
                    porcentaje = (sueldo*25)/100;
                    sueldototal = sueldo-porcentaje;
                    break;
            
                case 3:
                    System.out.println("Ingresar sueldo básico: ");
                    sueldo = ejercicio23.nextFloat();
                    porcentaje = (sueldo*25)/100;
                    sueldototal = sueldo-porcentaje;
                    break;
            
                case 4:
                    System.out.println("Ingresar sueldo básico: ");
                    sueldo = ejercicio23.nextFloat();
                    porcentaje = (sueldo*10)/100;
                    sueldototal = sueldo-porcentaje;
                    break;
                    
                default: 
                    JOptionPane.showMessageDialog(null,"ERROR");
                    break;
            } JOptionPane.showMessageDialog(null,"Tu sueldo básico es: "+sueldototal+" de la categoria "+categoria);
            
      
    } else {
        JOptionPane.showMessageDialog(null,"LA CATEGORIA NO SE ENCUENTRA EN LOS PARAMETROS ESTABLECIDOS. NO HAY UN DESCUENTO PARA ESTÁ CATEGORIA, TU SUELDO ES: "+sueldo);
        }
        System.out.println("Desea repetir el ejercicio número 23, SÍ [1]  NO[0]: ");
            condicional = ejercicio23.nextInt();
       } while(condicional != 0);
    
    }
}
