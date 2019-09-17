package cursoplan111;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args){
       
        int prodx=1, prody=1, cont = 0, cant;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de valores a cargar:");
        cant = teclado.nextInt();
        
        int[] parx = new int[cant];
        int[] pary = new int[cant];
        
        for(cont=0; cont<cant; cont++){
            System.out.print((cont+1)+": Ingrese un valor en X: ");
            parx[cont] = teclado.nextInt();
            prodx = prodx * parx[cont];
            
            System.out.print((cont+1)+": Ingrese un valor en Y: ");
            pary[cont] = teclado.nextInt();
            prody = prody * pary[cont];
        }
        
        for(cont=0; cont<cant; cont++){
            System.out.print("-"+parx[cont]);
        }
        System.out.println();
        for(cont=0; cont<cant; cont++){
            System.out.print("-"+pary[cont]);
        }
        System.out.println();
        
        System.out.println("El producto de las X es: "+prodx);
        System.out.println("El producto de las Y es: "+prody);
    }
}
