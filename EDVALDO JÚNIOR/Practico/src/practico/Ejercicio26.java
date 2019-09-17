
package practico;

import javax.swing.JOptionPane;


public class Ejercicio26 {
    

    //26.	Leer una serie de diez números enteros. Informar cuantos son mayores que 100. 
    
     
     
    public static void ejercicio26(){
        
        int numerosmayor = 0;
        int posicion=0;
         int [] numero = new int[10];
         
         
        JOptionPane.showMessageDialog(null, "Ejercicio26: En este ejercicio se informará de un serie de 10 números ingresados cuantos son MAYOR que 100");
     
            
        for (int i=0; i<numero.length; i++ ) {
        posicion++;
        numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(numero[i] > 100){
            
        numerosmayor++;
        
        }
        System.out.println("Numero en la posición "+posicion+" que has ingresado es: "+numero[i]);
        }
        
            if(numerosmayor >0 ){
                JOptionPane.showMessageDialog(null, "Cantidad de números MAYOR que 100 es: "+numerosmayor);
            } else {
               JOptionPane.showMessageDialog(null,"TODOS LOS NÚMEROS INGRESADOS SON MENORES QUE 100");
            
            }

    }


}


