


package practico;

import javax.swing.JOptionPane;


public class Ejercicio24 {
  
    
    public static void main() {
        //24.	Leer un número comprendido entre uno y siete, ambos inclusive e 
        //imprimir el nombre del día de la semana Correspondiente. 
     int condicional;
            int numero;
            
            
            JOptionPane.showMessageDialog(null,"Leer un número comprendido entre uno y siete, ambos inclusive e \n" +
"        imprimir el nombre del día de la semana Correspondiente.");
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número comprendido entre uno y siete: "));
            
            if(numero>0 && numero<=7){
            switch (numero){
                case 1:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES LUNES");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES MARTES");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES MIÉRCOLES");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES JUEVES");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES VIERNES");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES SÁBADO");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"EL DÍA ES DOMINGO");
                    break;
             default: 
                    JOptionPane.showMessageDialog(null,"ERROR");
                    break;
               
            }
           }else {
            
            JOptionPane.showMessageDialog(null, "Error, el parametro que has pasado no se encuentra en lo exigido \n POR FAVOR VUELVA A INGRESARLO");
            }
            
            condicional = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Deseas repetir el procedimiento SÍ[1] NO[0]?"));
            if(condicional ==0){
                JOptionPane.showMessageDialog(null,"MUCHAS GRACIAS, VUELVA SIEMPRE");
            }
        } while ( condicional !=0);
    
    
    }
}
