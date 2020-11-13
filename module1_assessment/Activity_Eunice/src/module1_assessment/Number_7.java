
package module1_assessment;

import java.io.File;



public class Number_7 {
    
    public static void main(String[] args) {
        
        File my_files = new File ("C:\\Users\\cherelen_22\\Desktop\\photos");
        
        String[] filelist = my_files.list();
        
        for (String directory : filelist) {
            
            System.out.println(directory);
        }
    }
    
}
