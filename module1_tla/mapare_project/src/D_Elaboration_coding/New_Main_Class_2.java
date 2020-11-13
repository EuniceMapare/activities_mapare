/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_Elaboration_coding;

import java.util.ArrayList;


public class New_Main_Class_2 {
    
     public static void main(String[] args) {

        New_Method_2 methods = new New_Method_2();

        ArrayList<String> arrs = new ArrayList<>();

        String[] newString = new String[5];

        newString[0] = "a";
        newString[1] = "b";
        newString[2] = "c";
        newString[3] = "d";
        newString[4] = "e";

        arrs = methods.arrsList(newString);

        for (int i = 0; i < arrs.size(); i++) {

            System.out.println(arrs.get(i));
        }

      }
}
