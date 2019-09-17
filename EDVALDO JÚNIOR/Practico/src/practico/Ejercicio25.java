
package practico;

import javax.swing.JOptionPane;


public class Ejercicio25 {

public static void main(){
    int condicional=0, numero;
//25.	Ingresar un número entero comprendido entre cero y nueve. ambos inclusive e imprimirlo expresado en letras. 


            do{
            JOptionPane.showMessageDialog(null,"25.	Ingresar un número entero comprendido entre cero y nueve. ambos inclusive e imprimirlo expresado en letras");

            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar un número: "));
       
            if(numero>=0 && numero <=9){
        
                switch(numero){
            
                    case 0:
                        JOptionPane.showMessageDialog(null,"J");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,"A");
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null,"B");
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null,"C");
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null,"D");
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null,"E");
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null,"F");
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null,"G");
                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null,"H");
                        break;

                    case 9:
                        JOptionPane.showMessageDialog(null,"I");
                        break;

                    default: JOptionPane.showMessageDialog(null, "EL NÚMERO NO SE ENCUENTRA EN LOS PARAMETROS EXIGIDO");
                }
            }


            }while(condicional!= 0);
}
}
