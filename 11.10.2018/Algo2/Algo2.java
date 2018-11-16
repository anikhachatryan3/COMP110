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
   public static void firstRepeatingChar(String str) {
      
      int[] d = new int[256];
      for(int i = 0; i < str.length(); i++) {
         
         d[(int)str.charAt(i)]++;
         
      }

      int amount = 0;
      for(int i = 0; i < str.length(); i++) {
         
         if(d[(int)str.charAt(i)] > 1) {
            
            amount++;
            System.out.println("First repeating char: " + str.charAt(i));
            break;
            
         }
         
      }
      
      if(amount == 0) {
         
         System.out.println("No repeating char");
         
      }
      
   }
   
   //Last repeating char in String
   public static void lastRepeatingChar(String str) {
      
      int[] e = new int[256];
      for(int i = 0; i < str.length(); i++) {
         
         e[(int)str.charAt(i)]++;
         
      }
      
      int amount = 0;
      for(int i = str.length() - 1; i >= 0; i--) {
         
         if(e[(int)str.charAt(i)] > 1) {
            
            amount++;
            System.out.println("Last repeating char: " + str.charAt(i));
            break;
         }
         
      }
      
      if(amount == 0) {
         
         System.out.println("No repeating char");
         
      }
      
   }
   
   //First non-repeating char in String
   public static void nonRepeatChar(String str) {
      
      int[] f = new int[256];
      for(int i = 0; i < str.length(); i++) {
         
         f[(int)str.charAt(i)]++;
         
      }
      
      for(int i = 0; i < str.length(); i++) {

         if(f[(int)str.charAt(i)] == 1) {

            System.out.println("First non-repeating char: " + str.charAt(i));
            break;
            
         }
         
      }
      
   }
   
   //Count digits in String[]
   public static int countDigits(String[] digitsArray) {
      
      int count = 0;
      
      for(int i = 0; i < digitsArray.length; i++) {
         
         try {
            int parsedInt = Integer.parseInt(digitsArray[i]);
            count += 1;
         }
         catch(NumberFormatException nfe) {
            ;
         }
         
      }
      return count;
      
   }
   
   //Count Even Numbers in String[]
   public static int countEven(String[] evenDigitsArray) {
      
      int count = 0;
      
      for(int i = 0; i < evenDigitsArray.length; i++) {
         
         try {
            int parsedInt = Integer.parseInt(evenDigitsArray[i]);
            if(parsedInt % 2 == 0) {
               count += 1;
            }
         }
         catch(NumberFormatException nfe) {
            ;
         }
         
      }
      return count;
      
   }
   
   //Reverse Array
   public static void reverseArray(int[] reverseNum) {
      
      int mid = reverseNum.length/2;
      for(int i = 0; i < mid; i++) {
         
         int temp = reverseNum[i];
         reverseNum[i] = reverseNum[reverseNum.length - i - 1];
         reverseNum[reverseNum.length - i - 1] = temp;
         
      }
      
   }
   
   public static void printInt(int[] a){
      
      for(int i = 0; i < a.length; i++) {
         
         System.out.println("a[" + i + "] = " + a[i]);
         
      }
      System.out.println("--------------------");
      
   }
   
   //Reverse String
   public static void reverseStrArray(String[] reverseStr) {
      
      int mid = reverseStr.length/2;
      String temp = "";
      for(int i = 0; i < mid; i++) {
         
         temp = reverseStr[i];
         reverseStr[i] = reverseStr[reverseStr.length - i - 1];
         reverseStr[reverseStr.length - i - 1] = temp;
         
      }
      
   }
   
   //String split using any delemiter(String, delim)(returns a String[])
   public static void splitStr(String[] tArray) {
      
      for(int i = 0; i < tArray.length; i++) {
         
         System.out.println(tArray[i]);
         
      }
      System.out.println("--------------------");
      
   }
   
   //Bubble sort int[]
   public void sortInt(int[] arr) {
      
      int x = arr.length;
      for(int i = 0; i < x; i++) {
         
         for(int j = 1; j < x - i; j++) {
            
            if(arr[j - 1] > arr[j]) {
               
               swapInt(j, arr);
               
            }
            
         }
         
      }
      
   }
   
   public void swapInt(int j, int[] arr) {
      
      int temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      
   }
   
   //Bubble sort String[]
   public void sortStr(String[] sArray) {
      
      int y = sArray.length;
      for(int i = 0; i < y; i++) {
         
         for(int j = 1; j< y - i; j++) {
            
            if(sArray[j - 1].compareTo(sArray[j]) > 0) {
               
               swapStr(j, sArray);
               
            }
            
         }
         
      }
      
   }
   
   public void swapStr(int j, String[] sArray) {
      
      String temp = sArray[j - 1];
      sArray[j - 1] = sArray[j];
      sArray[j] = temp;
      
   }
   
   //Prime Number
   public boolean isPrime(int n) {
      
      if(n < 2) {
         return false;
      }
      if(n == 0) {
         return true;
      }
      if(n % 2 == 0) {
         return false;
      }
      
      for(int i = 3; i < n; i++) {
         
         if(n % i == 0) {
            return false;
         }
         
      }
      return true;
      
   }
   
   
   //print
   public static void print(int[] a){

      for(int i = 0; i < a.length; i++) {

         System.out.print(a[i] + " ");

      }
      System.out.println("");

   }
   
   public static void printStr(String[] a) {
      
      for(int i = 0; i < a.length; i++) {
         
         System.out.println("a[" + i + "] = " + a[i]);
         
      }
      System.out.println("--------------------");
      
   }
   
}

