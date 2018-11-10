//Name: Ani Khachatryan
//Date: 10/6/2018
//App: Algo
//Purpose: To write and call each method 3 times.

class Algo {

   //Min Method
   public static int getMin(int a, int b) {
      
      if(a < b) {
         
         return a;
         
      }
      return b;
   }
   
   
   //Max Method
   public static int getMax(int c, int d) {
      
      if(c > d) {
         
         return c;
         
      }
      return d;
      
   }
   
   
   //Odd Method
   public static boolean isOdd(int e) {
      
      if(e % 2 != 0) {
         
         return true;
         
      }
      return false;
   }
   
   
   //Even Method
   public static boolean isEven(int f) {
      
      if(f % 2 == 0) {
         
         return true;
         
      }
      return false;
   }
   
   
   //Palindrome Method
   public static boolean isPalindrome(String str) {
      
      int first = 0;
      int last = str.length() - 1;
      while(first < last) {
         
         if(str.charAt(first) != str.charAt(last)) {
            
            return false;
            
         }
         first++;
         last--;
      }
      return true;
   }
   
   
   //Char in String Method
   public static boolean isCharInString(char h, String st) {
      
      for(int i = 0; i < st.length(); i++) {
         
         if(st.charAt(i) == h) {
            
            return true;
            
         }
         
      }
      return false;
   }
   
   
   public static void main(String args[]) {
      
      //Calling Min Method
      int min = getMin(645, 239);
      System.out.println("Minimum value = " + min);
      
      min = getMin(340, 548);
      System.out.println("Minimum value = " + min);
      
      min = getMin(1987, -2344);
      System.out.println("Minimum value = " + min);
      
      
      //Calling Max Method
      int max = getMax(25, 2);
      System.out.println("Maximum value = " + max);
      
      max = getMax(5986, 9436);
      System.out.println("Maximum value = " + max);
      
      max = getMax(-258, 234);
      System.out.println("Maximum value = " + max);
      
      
      //Calling Odd Method
      boolean odd = isOdd(335);
      System.out.println("Is the number given odd? " + odd);
      
      odd = isOdd(542);
      System.out.println("Is the number given odd? " + odd);
      
      odd = isOdd(-789);
      System.out.println("Is the number given odd? " + odd);
      
      
      //Calling Even Method
      boolean even = isEven(248);
      System.out.println("Is the number given even? " + even);
      
      even = isEven(459);
      System.out.println("Is the number given even? " + even);
      
      even = isEven(-256);
      System.out.println("Is the number given even? " + even);
      
      
      //Calling Palindrome Method
      boolean palin = isPalindrome("radar");
      System.out.println("Is the word/string given a palindrome? " + palin);
      
      palin = isPalindrome("hello");
      System.out.println("Is the word/string given a palindrome? " + palin);
      
      palin = isPalindrome("kayak");
      System.out.println("Is the word/string given a palindrome? " + palin);
      
      
      //Calling Char in String Method
      boolean result = isCharInString('n', "Mountain");
      System.out.println("Is the given char found in the given string? " + result);
      
      result = isCharInString('g', "Snickers");
      System.out.println("Is the given char found in the given string? " + result);
      
      result = isCharInString('b', "Sprite");
      System.out.println("Is the given char found in the given string? " + result);
      
   }
   
   
   
   
}
