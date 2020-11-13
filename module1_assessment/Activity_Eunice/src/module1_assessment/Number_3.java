
package module1_assessment;

public class Number_3 {

    public static void main(String[] args) {
        
        int array [] = new int [3];
        
        array [0]= 5;
        array [1]= 82;
        array [2]= 1;
      
      
       int total = 0;
       int average = 0;
     
        for (int i = 0; i < array.length; i++) {
            
            total = total + array[i];
            average = total / array.length;
            
            System.out.println(array[i]);
            
        } System.out.println(" The average value of array elements is: "+average);
       
    }
    
}
