package main.java.taller;



public class MyClass {

  static Boolean LOG = false;
  
  public static void main(String args[]) {

   test("aba", "aba");
   test("abac", "aba"); 
   test("abaeefee", "eefee");
   test("tacag", "aca");
   test("wegeeksskeegyuwe", "geeksskeeg");
   
  }
  
  public static void test(String str, String expected){
    String returned = checkLongest(str);
    
    System.out.println("for entry "+ str + " was expecting " +expected + " - Got "+ returned+ " - success = "+ 
        expected.equals(returned));
  }
  
  public static void log(String log){
      if(LOG){
         System.out.println(log);
      }
  }
  
  public static String checkLongest(String str){
      
      StringBuilder reversed = new StringBuilder(str).reverse();
      String reversedStr = reversed.toString();
      
     StringBuilder palindrome = new StringBuilder("");
     String bigger = "";
    
        for(int j =0, i = 0; ; ){
            
            if(i == str.length()){
                palindrome = new StringBuilder("");
                log("break ");
                break;
            }else if(j == str.length()) {
                //i++;
                j = 0;
                palindrome = new StringBuilder("");
                log("reset j - increasing i to " +i);
            }
            
            char c = str.charAt(i);
            if( c != reversedStr.charAt(j)){
                if(palindrome.length() > 0){
                    j = 0;
                    palindrome = new StringBuilder("");
                    log("reseting j to 0  - closing palindrome "+bigger);
                }else {
                    j++;
                    log("increasing j to "+j);
                }
                
            } else{
                palindrome.append(""+c);
                i++;
                j++;
                log("increasing j to "+j + " increasing i to " + i + " - palindrome "+palindrome.toString());
            }
            
            if(palindrome.length() > bigger.length()){
                bigger = palindrome.toString();
                log("found "+bigger);
            }

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
