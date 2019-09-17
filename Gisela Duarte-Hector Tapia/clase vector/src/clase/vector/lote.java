
package clase.vector;
import java.util.Scanner;

public class lote {
    
    public static void main(String[]args){
       Float mf, ml, mt;
         Scanner teclado = new Scanner (System.in);
         
        System.out.print("ingrese los metros de frente ");
        mf=teclado.nextFloat();
        System.out.print("ingrese los metros de largo ");
        ml=teclado.nextFloat();
        mt=(mf*2)+(ml*2);
        System.out.println("LA CANTIDAD DE METROS DE ALAMBRE PARA CERCAR EL LOTE ES: "+mt );
    }        
}
