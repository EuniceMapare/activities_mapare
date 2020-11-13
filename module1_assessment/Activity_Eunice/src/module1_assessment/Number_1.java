/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1_assessment;

import static java.lang.System.arraycopy;


public class Number_1 {
    
    public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count) { 
        
        for (int i = 0; i < count; i++) {
            
           
            to[tostart + i] = from[fromstart + i];
        }
    }
    public static void main(String[] args) {
        
        int array1 [] = new int [5];
        int array2 [] = new int [5];
        
        array1 [0] = 24;
        array1 [1] = 94;
        array1 [2] = 5;
        array1 [3] = 22;
        array1 [4] = 15;
     
        arraycopy(array1, 0, array2, 0,  5 ); 
        
        for (int i = 0; i < array2.length; i++) {
            
            System.out.println(array2[i]);
        }
       
    }
      
      
    } 
        

