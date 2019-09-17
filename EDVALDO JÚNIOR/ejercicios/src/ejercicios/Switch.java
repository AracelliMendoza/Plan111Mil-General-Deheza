
package ejercicios;

import javax.swing.JOptionPane;


public class Switch {
    public static void main(String[] args) {
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota: "));
        
        switch(nota){
           
            case 1:
               JOptionPane.showMessageDialog(null,"Tienes un 1");
                
                break;
           
            
            case 2:
                JOptionPane.showMessageDialog(null,"Tienes un 2");
                
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null,"Tienes un 1");
                break;
        
            default: JOptionPane.showMessageDialog(null,"Tienes una nota diferente a 1, 2, 3");
        
        }
        
    }
}
