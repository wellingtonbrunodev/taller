package main.java.taller;



public class MyClass {
  public static void main(String args[]) {
    
    String str = "abcabac"; 
    
   String expected = "aba";
   
   // String str = "abaeefee"; // eefeeaba i =  e j = a   p = aba
    
   // String expected = "eefee";
    
    String returned = checkLongest(str);
    
    System.out.println(returned);
    System.out.println(expected.equals(returned));
    
  }
  
  public static String checkLongest(String str){
      
      StringBuilder reversed = new StringBuilder(str).reverse();
      String reversedStr = reversed.toString();
      
     StringBuilder palindrome = new StringBuilder("");
     String bigger = "";
    
        for(int j =0, i = 0; ; ){
            
            if(i == str.length()){
                break;
            }else if(j == str.length()) {
                i++;
                j = 0;
                palindrome = new StringBuilder("");
            }
            
            char c = str.charAt(i);
            if( c != reversedStr.charAt(j)){
                j++;
            } else{
                palindrome.append(""+c);
                i++;
                j++;
            }

         }  
         
        if(palindrome.length() > bigger.length()){
            bigger = palindrome.toString();
            System.out.println("found "+bigger);
        }
         
        return bigger;
   
      //reverting it
      
      //compare it 
      // i[0] != j[0]
      //   j++
      // i[0] == j[0]
      //   i++
      
     
  }
}  

/**		
 * 
 * abaeefee
 * 
* longest palindromic substring: Given a string, find the longest substring which is palindrome.				
*				
* Input: abac	//caba	= aba	
* output: aba				
*				
* Input: tacag	// gacat			
* output:  aca				
*				
* Input: wegeeksskeegyuwe,				
* Output: "geeksskeeg"				
*				
*				
*/
