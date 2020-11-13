
package module1_assessment;


public class Number_4 {
    
    public static void main(String[] args) {
        
        String var1 = "String";
        String var2 = "ng";
        
        boolean result = true;
        
        if(var1.contains(var2)){
        
            System.out.print("The given String is: "+var1 +"\n"+ 
                     
                    "The string containing "+ var2+ " at last:"+result + "\n");
        }else {
            System.out.print("The given String is: "+var1 +"\n"+
                     
                    "The string containing "+ var2+ " at last:"+!result + "\n");
        
        }
        
    }
}
