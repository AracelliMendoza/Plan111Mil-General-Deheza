/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Capacitacion18
 */
public class Prncipal {
    
    public static void main(String[] args){
        int[] array = {2, 18, 6,-4, 5, 1};
        
        calcular(array);
    }
    
    public static void calcular(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = array[i] + (array[i] / array[0]);
            System.out.println(array[i]);
        }
    }
    
}
