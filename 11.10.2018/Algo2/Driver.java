//Name: Ani Khachatryan
//Date: 11/10/2018
//App: Driver
//Purpose:

class Driver {

   public static void main(String[] args) {
      
      Algo2 algo = new Algo2();
      
      //Fahrenheit to Celsius
      double fahrenheit = 74;
      double result = algo.F2C(fahrenheit);
      System.out.println(result + " degrees Celsius");
      
      fahrenheit = 98;
      result = algo.F2C(fahrenheit);
      System.out.println(result + " degrees Celsius");
      
      fahrenheit = 52;
      result = algo.F2C(fahrenheit);
      System.out.println(result + " degrees Celsius");
      
      
      
      //Celsius to Fahrenheit
      double c = 32;
      double result1 = algo.C2F(c);
      System.out.println(result1 + " degrees Fahrenheit");
      
      c = 0;
      result1 = algo.C2F(c);
      System.out.println(result1 + " degrees Fahrenheit");
      
      c = -13;
      result1 = algo.C2F(c);
      System.out.println(result1 + " degrees Fahrenheit");
      
      
      //Area of Circle
      double radius = 12;
      double result2 = algo.AreaOfCircle(radius);
      System.out.println("Area of circle: " + result2);
      
      radius = 27;
      result2 = algo.AreaOfCircle(radius);
      System.out.println("Area of circle: " + result2);
      
      radius = -40;
      result2 = algo.AreaOfCircle(radius);
      System.out.println("Area of circle: " + result2);
      
      
      //Circumference of Circle
      double r = 17;
      double result3 = algo.Circumference(r);
      System.out.println("Circumference of circle: " + result3);
      
      r = -51;
      result3 = algo.Circumference(r);
      System.out.println("Circumference of circle: " + result3);
      
      r = 22;
      result3 = algo.Circumference(r);
      System.out.println("Circumference of circle: " + result3);
      
      
      //Max Value in Array(int, array)
      int[] maxArray = new int[6];
      maxArray[0] = 37;
      maxArray[1] = 8000;
      maxArray[2] = 85;
      maxArray[3] = 409;
      maxArray[4] = 273;
      maxArray[5] = 65;
      int result4 = algo.maxValueInArray(maxArray);
      System.out.println("Max value: " + result4);
      
      maxArray = new int[5];
      maxArray[0] = 37;
      maxArray[1] = 2400;
      maxArray[2] = -450;
      maxArray[3] = 9764;
      maxArray[4] = -9271;
      result4 = algo.maxValueInArray(maxArray);
      System.out.println("Max value: " + result4);
      
      maxArray = new int[7];
      maxArray[0] = -23847;
      maxArray[1] = 4752;
      maxArray[2] = 48732;
      maxArray[3] = 2863;
      maxArray[4] = 2498;
      maxArray[5] = -15000;
      maxArray[6] = 14009;
      result4 = algo.maxValueInArray(maxArray);
      System.out.println("Max value: " + result4);
      
      
      //Min Value in Array(int, array)
      int[] minArray = new int[5];
      minArray[0] = 9372;
      minArray[1] = -6438;
      minArray[2] = -2387;
      minArray[3] = 35;
      minArray[4] = 1297;
      int result5 = algo.minValueInArray(minArray);
      System.out.println("Min value: " + result5);
      
      minArray = new int[6];
      minArray[0] = 36;
      minArray[1] = 2;
      minArray[2] = 463;
      minArray[3] = -384;
      minArray[4] = -23753;
      minArray[5] = 3492239;
      result5 = algo.minValueInArray(minArray);
      System.out.println("Min value: " + result5);
      
      minArray = new int[8];
      minArray[0] = 453;
      minArray[1] = 2378;
      minArray[2] = 920;
      minArray[3] = 328;
      minArray[4] = 341;
      minArray[5] = -36228;
      minArray[6] = 0;
      minArray[7] = 26;
      result5 = algo.minValueInArray(minArray);
      System.out.println("Min value: " + result5);
      
      
      //Number of Even Numbers in Array(int, array)
      int[] evenArray = new int[5];
      evenArray[0] = 24;
      evenArray[1] = 13;
      evenArray[2] = 5;
      evenArray[3] = 248;
      evenArray[4] = 1479;
      int result6 = algo.evenNumInArray(evenArray);
      System.out.println("Number of even numbers in array: " + result6);
      
      evenArray = new int[6];
      evenArray[0] = 31;
      evenArray[1] = 47;
      evenArray[2] = 39;
      evenArray[3] = 3983;
      evenArray[4] = 4735;
      evenArray[5] = 3921;
      result6 = algo.evenNumInArray(evenArray);
      System.out.println("Number of even numbers in array: " + result6);
      
      evenArray = new int[7];
      evenArray[0] = 687;
      evenArray[1] = 0;
      evenArray[2] = 2;
      evenArray[3] = 4821;
      evenArray[4] = 463;
      evenArray[5] = 352;
      evenArray[6] = 3482;
      result6 = algo.evenNumInArray(evenArray);
      System.out.println("Number of even numbers in array: " + result6);
      
      
      //Number of Odd Numbers in Array(int, array)
      int[] oddArray = new int[5];
      oddArray[0] = 376;
      oddArray[1] = 3289;
      oddArray[2] = 36283;
      oddArray[3] = 83871;
      oddArray[4] = 33;
      int result7 = algo.oddNumInArray(oddArray);
      System.out.println("Number of odd numbers in array: " + result7);
      
      oddArray = new int[6];
      oddArray[0] = 282;
      oddArray[1] = 34;
      oddArray[2] = 68;
      oddArray[3] = 3872;
      oddArray[4] = 21;
      oddArray[5] = 45;
      result7 = algo.oddNumInArray(oddArray);
      System.out.println("Number of odd numbers in array: " + result7);
      
      oddArray = new int[7];
      oddArray[0] = 64;
      oddArray[1] = 37626;
      oddArray[2] = 2510;
      oddArray[3] = 8348;
      oddArray[4] = 490;
      oddArray[5] = 24;
      oddArray[6] = 3004;
      result7 = algo.oddNumInArray(oddArray);
      System.out.println("Number of odd numbers in array: " + result7);
      
      
      //Palindrome
      String s = "civic";
      boolean result8 = algo.isPalindrome(s);
      System.out.println("Is the given word a palindrome? " + result8);
      
      s = "butter";
      result8 = algo.isPalindrome(s);
      System.out.println("Is the given word a palindrome? " + result8);
      
      s = "potato";
      result8 = algo.isPalindrome(s);
      System.out.println("Is the given word a palindrome? " + result8);
      
      
      //Is char in String
      char h = 'c';
      String st = "Snickers";
      boolean result9 = algo.isCharInString(h, st);
      System.out.println("Is char in word? " + result9);
      
      h = 'g';
      st = "cookie";
      result9 = algo.isCharInString(h, st);
      System.out.println("Is char in word? " + result9);
      
      h ='z';
      st = "zebra";
      result9 = algo.isCharInString(h, st);
      System.out.println("Is char in word? " + result9);
      
      
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

}
