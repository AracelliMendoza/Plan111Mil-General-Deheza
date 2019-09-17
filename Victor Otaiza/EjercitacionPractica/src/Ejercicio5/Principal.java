/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Capacitacion18
 */
public class Principal {
    
    
    
    public static void main(String[] args){
        int[] a1 = {1,3,5,7,9};
        int[] b1 = {1,4,9,16,25};
        
                  
        misterio(a1, b1);
                
        for(int x=0; x<a1.length; x++){
            System.out.println(a1[x]);
        }
        //System.out.println(principal.misterio(int a1, int b1));
        
        
    }
      
    public static void misterio (int[] a, int[] b){
        for(int i=0; i<a.length; i++){
               a[i] += b[b.length -1 -i];
        }
    }
    
    
   
   
}
