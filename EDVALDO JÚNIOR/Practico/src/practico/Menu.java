
package practico;

import javax.swing.JOptionPane;


public class Menu {
    public static void Ejecutarmenu() {
        
    
    int numeroej;
     
    numeroej = Integer.parseInt(JOptionPane.showInputDialog(null, "--(POR FAVOR ELIJA UNO DE LOS EJERCICIOS A SEGUIR, DIGITANDO SU NÚMERO)--"
 +"\n1.Lote de un terreno \n2. Lectura de dos números \n3. Cantidad de pintura para pintar una pared"
         +"\n4. Intercambio de variables \n5. Perimetro de un cuadrado \n6. Articulos \n7. Ecuación de segundo grado"+
         "\n8. Distancia entre dos puntos en Dtms \n9. Tiempo transcurrido desde el inicio hasta el final de un acontecimiento"+
         "\n10. Aquí se encuentra resuelto los siguientes ejercicios: "
         +"\n  -10. Indicar si un número ingresado es par o impar. " 
         + "\n -11. Leer un número e indicar si este es múltiplo de dos. " 
         +"\n  -12. Leer un número e indicar si el mismo es divisible por tres." 
         + "\n13. Número primo \n14. Número mayor \n15. Número mayor entre tres números ingresado"
         +"16. Cociente entre dos números \n17. Leer dos números, si el primero es el mayor, sumarlos, si no multiplicarlos"
         +"18. Raíz cuadrada de la suma de tres números \n19. Lados de un triangulo \n20.Suma de dos números, es mayor que 730?"
         +"\n21. Perímetro de un Rectangulo \n22. Orden ascendente de 4 números \n23. Sueldo básico y la categoría de un empleado"
         +"\n24. Leer un número comprendido entre uno y siete e imprimir el nombre del día de la semana Correspondiente."
         +"\n25. Ingresar un número entero comprendido entre cero y nueve. ambos inclusive e imprimirlo expresado en letras. "
         +"\n26. Leer una serie de diez números enteros. Informar cuantos son mayores que 100."
         +"\n\n ¿QUÉ EJERCICIO DESEAS?: "));

       
    switch(numeroej){
    
        case 1:
           
            Ejercicio01.main();
            
            break;
       
        case 2: 
            
            Ejercicio02.main();
           
            break;
      
        case 3: 
            
            Ejercicio03.main();
            
            break;
       
        case 4: 
            
            Ejercicio04.main();
            
            break;
        
        case 5: 
            
            Ejercicio05.main();
            
            break;
        
        case 6:
            
            Ejercicio06.main();
            
            break;
        
        case 7: 
            
             Ejercicio07.main();
            
            break;
        
        case 8: 
            
             Ejercicio08.main();
            
            break;
        case 9: 
            
             Ejercicio09.main();
            
            break;
        
        case 10: 
            
             Ejercicio10.main();
                        
            break;
        
                
        case 13:
            
             Ejercicio13.main();
            
            break;
        
        case 14: 
            
             Ejercicio14.main();
                        
            break;
        
        case 15: 
            
             Ejercicio15.main();
            
            break;
        
        case 16:
            
             Ejercicio16.main();
            
            break;
        
        case 17: 
            
             Ejercicio17.main();
            
            break;
        case 18: 
            
             Ejercicio18.main();
            
            break;
        
        case 19: 
            
             Ejercicio19.main();
            
            break;
        
        case 20: 
            
             Ejercicio20.main();
            
            break;
        
        case 21: 
            
            Ejercicio21.main();
            
            break;
        
        case 22: 
            
            Ejercicio22.main();
            
            break;
        
        case 23: 
            
            Ejercicio23.main();
            
            break;
        
        case 24: 
            
            Ejercicio24.main();
            
            break;
        case 25:
           Ejercicio25.main();
            break;
            
        case 26:
            Ejercicio26.ejercicio26();
            break;
        
        default: 
            JOptionPane.showMessageDialog(null,"ERRO EL EJERCICIO NO SE ENCUENTRA EN LOS PARAMETROS");
            break;
  }
 }

    
}