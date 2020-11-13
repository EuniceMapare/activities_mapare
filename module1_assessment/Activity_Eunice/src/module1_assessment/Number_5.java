
package module1_assessment;


public class Number_5 {
    
    public static void main(String[] args) {
        
        String givenString = "the quick brown fox";
       
        
        int result = 0;
        
       while(result < givenString.length()){
       
           if( givenString.charAt(result) !='q'&&givenString.charAt(result) != 'u'
                   && givenString.charAt(result) != 'e'&& givenString.charAt(result) !='e'&& givenString.charAt(result) != 'n'){
               
               System.out.print(givenString.charAt(result));
           
           }
       result++;
       }
            
    }
}
