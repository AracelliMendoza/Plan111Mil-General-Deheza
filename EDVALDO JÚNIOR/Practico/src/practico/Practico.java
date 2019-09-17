
package practico;

import javax.swing.JOptionPane;

/**
 * 
 * @author Capacitacion01
 */
public class Practico {

  
    public static void main(String[] args) {
       
        int condicional;
        
        do{
        
            Menu.Ejecutarmenu();
        
        condicional= Integer.parseInt(JOptionPane.showInputDialog("Deseas realizar otro Ejercicio SÍ[1] NO[0]"));
            if(condicional == 0){
                    JOptionPane.showMessageDialog(null,"MUCHAS GRACIAS, HASTA LA PRÓXIMA");
                   
            }
            
            
        } while(condicional!=0);
        
  
    }

}