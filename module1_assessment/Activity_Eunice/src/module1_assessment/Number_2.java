
package module1_assessment;


public class Number_2 {
    
    public static void main(String[] args) {
        
       
       String[][] num = new String [10] [10];
        
        for (int num1 = 0; num1 < num.length;num1++) {
        
        for (int num2 = 0; num2 < num[num1].length; num2++) {
                
                num[num1][num2] = " @";
           
                System.out.print(num[num1][num2]);
         }
                System.out.println("");
        }
    }
    
}
