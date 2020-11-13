/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.File;


public class javafile {
    
    public static void main(String[] args) {
        
       
        File newfile = new File("C:\\Users\\admin\\Desktop\\txt.docs");

        System.out.println(newfile.exists());
    }
}
