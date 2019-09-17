package clase.vector;
import java.util.Scanner;

public class ClaseVector {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] notas = new int[5];
   int i;
   
   
  /* notas[0] = 2;
   notas[1] = 8;
   notas[2] = 7;
   notas[3] = 10;
   notas[4] = 3;*/
  for(i=0;i<notas.length;i++){
     System.out.print("ingrese notas: ");
     notas[i]=teclado.nextInt();
  }
   //usando for tradicional
   System.out.println("El array tiene "+notas.length+" elementos");
   System.out.println("Los elementos son:");
   for(i=0;i<notas.length;i++){
       System.out.print(notas[i]+" "); 
    }
    System.out.println();
       
    }
    
}
