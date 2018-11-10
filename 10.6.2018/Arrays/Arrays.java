//Name: Ani Khachatryan
//Date: 10.6.2018
//App: Arrays
//Purpose: To create 3 different methods and call each method 3 times.

class Arrays {

   //Sum Method
   public static int sumOfAnArray(int[] a) {
      
      int sum = 0;
      for(int i = 0; i < a.length; i++) {
         
         sum += a[i];
         
      }
      return sum;
   }
   
   
   //Max Method
   public static int maxValueinArray(int[] b) {
      
      int max = b[0];
      for(int n = 0; n < b.length; n++) {
         
         if(b[n] > max) {
            
            max = b[n];
         }
         
      }
      return max;
   }

   
   //String Method
   public static boolean isStringinArray(String[] s, String find) {
      
      for(int t = 0; t < s.length; t++) {
         
         if(find.equals(s[t])) {
            
            return true;
            
         }
         
      }
      return false;
   }
   
   
   //Calling Sum Method
   public static void main(String[] args) {
      int[] sumArray = new int[6];
      sumArray[0] = 22;
      sumArray[1] = -2;
      sumArray[2] = 57;
      sumArray[3] = 14;
      sumArray[4] = -200;
      sumArray[5] = 67;
      int result = sumOfAnArray(sumArray);
      System.out.println("Sum = " + result);
      
      sumArray[0] = 11;
      sumArray[1] = -71;
      sumArray[2] = 502;
      sumArray[3] = 29;
      sumArray[4] = -111;
      sumArray[5] = -220;
      result = sumOfAnArray(sumArray);
      System.out.println("Sum = " + result);
      
      sumArray = new int[7];
      sumArray[0] = -98;
      sumArray[1] = 43;
      sumArray[2] = 74;
      sumArray[3] = 21;
      sumArray[4] = 450;
      sumArray[5] = -700;
      sumArray[6] = 301;
      result = sumOfAnArray(sumArray);
      System.out.println("Sum = " + result);
      
      
      //Calling Max Method
      int[] maxArray = new int[7];
      maxArray[0] = 332;
      maxArray[1] = 21;
      maxArray[2] = -1000;
      maxArray[3] = 250;
      maxArray[4] = 780;
      maxArray[5] = 347;
      maxArray[6] = -231;
      int result1 = maxValueinArray(maxArray);
      System.out.println("Max value = " + result1);
      
      maxArray = new int[8];
      maxArray[0] = 675;
      maxArray[1] = 348;
      maxArray[2] = -3401;
      maxArray[3] = 314;
      maxArray[4] = 809;
      maxArray[5] = 3932;
      maxArray[6] = -310;
      maxArray[7] = 453;
      result1 = maxValueinArray(maxArray);
      System.out.println("Max value = " + result1);
      
      maxArray = new int[9];
      maxArray[0] = -355;
      maxArray[1] = 975;
      maxArray[2] = 7658;
      maxArray[3] = 239;
      maxArray[4] = 754;
      maxArray[5] = -347;
      maxArray[6] = -231;
      maxArray[7] = 429;
      maxArray[8] = 2974;
      result1 = maxValueinArray(maxArray);
      System.out.println("Max value = " + result1);
      
      
      //Calling String Method
      String[] stringArray = new String[5];
      String findArray = "computer";
      stringArray[0] = "this";
      stringArray[1] = "string";
      stringArray[2] = "says";
      stringArray[3] = "computer";
      stringArray[4] = "now";
      boolean result2 = isStringinArray(stringArray, findArray);
      System.out.println("Is the given string in the array? " + result2);
      
      stringArray = new String[5];
      findArray = "dog";
      stringArray[0] = "the";
      stringArray[1] = "cat";
      stringArray[2] = "likes";
      stringArray[3] = "drinking";
      stringArray[4] = "milk";
      result2 = isStringinArray(stringArray, findArray);
      System.out.println("Is the given string in the array? " + result2);
      
      stringArray = new String[6];
      findArray = "program";
      stringArray[0] = "I";
      stringArray[1] = "am";
      stringArray[2] = "done";
      stringArray[3] = "writing";
      stringArray[4] = "this";
      stringArray[5] = "code";
      result2 = isStringinArray(stringArray, findArray);
      System.out.println("Is the given string in the array? " + result2);
      
   }
   
}
