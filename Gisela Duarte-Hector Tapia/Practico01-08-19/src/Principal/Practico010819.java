/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Pez;
import Clases.Gato;

public class Practico010819 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Gato gato = new Gato ("miau");
     Pez pez = new Pez ("coco");
     
     gato.comer();
     gato.jugar();
     pez.comer();
     pez.jugar();
    }

   

 
}
