
package ejercicios;


public class Sumavectores {
    public static void main(String[] args) {
       
        
        /*int notas[], cont, nota, numpro = 0;
       
         
         Scanner vectores = new Scanner (System.in);
         
              
        System.out.println("Ingresar la cantidad de notas: ");
        nota=vectores.nextInt();
        
        notas = new int[nota];
        
         for(int i=0;i<notas.length;i++){
         System.out.println("Ingresar Nota: ");
         notas[i]=vectores.nextInt();
         }
         
         for(int a=0;a<notas.length;a++){
            numpro = numpro+1;
         System.out.println("Nota número "+numpro+" es: "+notas[a]);
                  
         }*/
         
         int [][] suma = new int[5][5];
         
         for(int i =0; i<5;i++){
             for(int j =0; j<5;j++){
                 suma[i][j] = i+j;
                 
                 System.out.print(suma[i][j]+" ");
                                 
             }
                System.out.println(" ");
             
         }
          
    }
}

