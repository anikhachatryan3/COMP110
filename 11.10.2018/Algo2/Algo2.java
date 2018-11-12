//Name: Ani Khachatryan
//Date: 11/10/2018
//App: Algo2
//Purpose:

class Algo2 {

   //Fahrenheit to Celsius
   public double F2C(double fahrenheit) {
      
      double celsius = ((fahrenheit - 32) * 5)/9;
      return celsius;
      
   }
   
   
   //Celsius to Fahrenheit
   public double C2F(double c) {
      
      double f = (9 * c)/5 + 32;
      return f;
      
   }
   
   
   //Area of Circle
   public double AreaOfCircle(double radius) {
      
      final double PI = 3.14159265;
      double area = radius * radius * PI;
      return area;
      
   }
   
   //Circumference of Circle
   public double Circumference(double r) {
      
      final double PI = 3.14159265;
      double circumference = 2 * r * PI;
      return circumference;
      
   }
   
   
   //Max Value in Array(int, array)
   public static int maxValueInArray(int[] a) {
      
      int max = a[0];
      for(int i = 0; i < a.length; i++) {
         
         if(a[i] > max) {
            
            max = a[i];
            
         }
         
      }
      return max;
      
   }
   
   //Min Value in Array(int, array)
   public static int minValueInArray(int[] b) {
      
      int min = b[0];
      for(int n = 0; n < b.length; n++) {
         
         if(b[n] < min) {
            
            min = b[n];
            
         }
         
      }
      return min;
      
   }
   
   //Number of Even Numbers in Array(int, array)
   public int evenNumInArray(int[] c) {
      
      int even = 0;
      for(int t = 0; t < c.length; t++) {
         
         if(c[t] % 2 == 0) {
            
            even++;
            
         }
         
      }
      return even;
      
   }
   
   
   //Number of Odd Numbers in Array(int, array)
   public int oddNumInArray(int[] d) {
      
      int odd = 0;
      for(int z = 0; z < d.length; z++) {
         
         if(d[z] % 2 != 0) {
            
            odd++;
            
         }
         
      }
      return odd;
      
   }
   
   
   //Palindrome
   public static boolean isPalindrome(String s) {
      
      int first = 0;
      int last = s.length() - 1;
      while(first < last) {
         
         if(s.charAt(first) != s.charAt(last)) {
            
            return false;
            
         }
         first++;
         last--;
         
      }
      return true;
      
   }
   
   
   //Is char in String
   public static boolean isCharInString(char h, String st) {
      
      for(int i = 0; i < st.length(); i++) {
         
         if(st.charAt(i) == h) {
            
            return true;
            
         }
         
      }
      return false;
      
   }
   
   //First repeating char in String
   
   //Last repeating char in String
   
   //First non-repeating char in String
   
   //Count digits in String[]
   
   //Count Even Numbers in String[]
   
   //Reverse Array
   
   //Reverse String
   
   //String split using any delemiter(String, delim)(returns a String[])
   
   //Bubble sort int[]
   
   //Bubble sort String[]
   
   //Prime Number

}
