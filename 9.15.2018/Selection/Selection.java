//Name: Ani Khachatryan
//Date: 9/15/2018
//App: Selection
//Purpose: To use all 13 operators and Selection examples mentioned in Lecture 7.

class Selection {

   //Selection A
   public static boolean selectionA(String s) {
      
      boolean result = false;
      
      if(s.length() > 7) {
         result = !result;
      }
      
      return result;
      
   }

   //Selection B
   public static long selectionB(long number) {
      
      if(number <= 0) {
         return -number;
      }
      else {
         return +number;
      }
   }
   
   //Selection C
   public static int selectionC(int seconds) {
      
      if(seconds > 60) {
         System.out.println(seconds + " seconds is more than a minute.");
      }
      else if(seconds >= 30) {
         System.out.println(seconds + " seconds is exactly half a minute or more than half a minute.");
      }
      else {
         System.out.println(seconds + " is less than half a minute.");
      }
      return seconds;
   }
   
   //Selection D
   public static boolean selectionD(short temperatureF) {
      if(temperatureF < 60) {
         System.out.println("It's really cold! It's " + temperatureF + " degrees Fahrenheit.");
      }
      else if(temperatureF < 70) {
         System.out.println("It's a little cold. It's " + temperatureF + " degrees Fahrenheit.");
      }
      else if(temperatureF < 90) {
         System.out.println("It's great weather! It's " + temperatureF + " degrees Fahrenheit.");
      }
      else if(temperatureF == 90) {
         System.out.println("It's kind of hot. It's " + temperatureF + " degrees Fahrenheit.");
      }
      else {
         System.out.println("It's really hot! It's " + temperatureF + " degrees Fahrenheit.");
      }
      
      return (temperatureF < 90 && temperatureF > 80) ? true : false;
   }
   
   
   //Selection E
   public static String selectionE(String s1, String s2) {
      String result;
      if(s1.length() > 0 || s2.length() > 0) {
         if(s1.length() != s2.length()) {
            result = "Strings have different lengths";
         }
         else {
            result = "Strings are the same length";
         }
      }
      else {
         result = "Both strings are empty";
      }
      return result;
   }
   
   
   //Selection F
   public static void selectionF(int age) {
      switch(age) {
         case 1:
            System.out.println("baby");
            break;
         case 13:
            System.out.println("teen");
            break;
         case 16:
            System.out.println("can drive");
            break;
         default:
            System.out.println("not supported");
            break;
      }
   }
   
   public static void main(String args[]) {
      
      //Selection Problem A
      String word = "word";
      boolean val = selectionA("word");
      System.out.println("Is " + word + " greater than 7 characters? " + val + ".");
      word = "mountains";
      val = selectionA(word);
      System.out.println("Is " + word + " greater than than 7 characters? " + val + ".");
      
      //Selection Problem B
      long number = -19;
      long result = selectionB(number);
      System.out.println("Absolute Value of " + number + " is " + result);
      
      number = 31;
      result = selectionB(number);
      System.out.println("Absolute Value of " + number + " is " + result);

      //Selection Problem C
      int seconds = 72;
      int time = selectionC(seconds);
      
      seconds = 30;
      time = selectionC(seconds);
      
      seconds = 9;
      time = selectionC(seconds);
      
      //Selection Problem D
      short temperatureF = 100;
      boolean isWeather = selectionD(temperatureF);
      System.out.println("Is the weather between 80 and 90 degrees Fahrenheit? " + isWeather);
      
      temperatureF = 90;
      isWeather = selectionD(temperatureF);
      System.out.println("Is the weather between 80 and 90 degrees Fahrenheit? " + isWeather);
      
      temperatureF = 83;
      isWeather = selectionD(temperatureF);
      System.out.println("Is the weather between 80 and 90 degrees Fahrenheit? " + isWeather);

      temperatureF = 66;
      isWeather = selectionD(temperatureF);
      System.out.println("Is the weather between 80 and 90 degrees Fahrenheit? " + isWeather);

      temperatureF = 34;
      isWeather = selectionD(temperatureF);
      System.out.println("Is the weather between 80 and 90 degrees Fahrenheit? " + isWeather);

      //Selection Problem E
      String string1 = "Hello";
      String string2 = "World";
      String concat = selectionE(string1, string2);
      System.out.println(string1 + " and " + string2 + " comparison: " + concat);
      
      string1 = "Programming";
      string2 = "Language";
      concat = selectionE(string1, string2);
      System.out.println(string1 + " and " + string2 + " comparison: " + concat);
      
      string1 = "Blue";
      string2 = "Ocean";
      concat = selectionE(string1, string2);
      System.out.println(string1 + " and " + string2 + " comparison: " + concat);
      
      string1 = "";
      string2 = "";
      concat = selectionE(string1, string2);
      System.out.println(string1 + " and " + string2 + " comparison: " + concat);
      
      //Selection Problem F
      int age = 1;
      Selection.selectionF(age);
      age = 13;
      Selection.selectionF(age);
      age = 16;
      Selection.selectionF(age);
      age = 65;
      Selection.selectionF(age);
      age = 0;
      Selection.selectionF(age);
      
   }
   
}
