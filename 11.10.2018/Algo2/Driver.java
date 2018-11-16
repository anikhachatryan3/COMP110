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
      String str = "tomatosauce";
      algo.firstRepeatingChar(str);
      
      str = "carousel";
      algo.firstRepeatingChar(str);
      
      str = "science";
      algo.firstRepeatingChar(str);
      
      
      //Last repeating char in String
      str = "randomness";
      algo.lastRepeatingChar(str);
      
      str = "candy";
      algo.lastRepeatingChar(str);
      
      str = "popcorn";
      algo.lastRepeatingChar(str);
      
      
      //First non-repeating char in String
      str = "spam";
      algo.nonRepeatChar(str);
      
      str = "good";
      algo.nonRepeatChar(str);
      
      str = "marshmellow";
      algo.nonRepeatChar(str);
      
      
      //Count digits in String[]
      String[] digitsArray = {"21", "242", "abc", "hello", "57", "world"};
      int result10 = algo.countDigits(digitsArray);
      System.out.println("How many digits in array? " + result10);
      
      digitsArray = new String[] {"293", "cake", "computer", "12", "homework", "for", "7483", "hi"};
      result10 = algo.countDigits(digitsArray);
      System.out.println("How many digits in array? " + result10);
      
      digitsArray = new String[] {"cookie", "board", "class", "keyboard", "typing"};
      result10 = algo.countDigits(digitsArray);
      System.out.println("How many digits in array? " + result10);
      
      
      //Count Even Numbers in String[]
      String[] evenDigitsArray = {"12", "nothing", "79", "word", "26", "000"};
      int result11 = algo.countEven(evenDigitsArray);
      System.out.println("Number of even digits in array: " + result11);
      
      evenDigitsArray = new String[] {"13", "15", "17", "19", "empty"};
      result11 = algo.countEven(evenDigitsArray);
      System.out.println("Number of even digits in array: " + result11);
      
      evenDigitsArray = new String[] {"13", "42", "1094", "376", "120", "38"};
      result11 = algo.countEven(evenDigitsArray);
      System.out.println("Number of even digits in array: " + result11);
      
      
      //Reverse Array
      int[] reverseNum = new int[5];
      reverseNum[0] = 0;
      reverseNum[1] = 1;
      reverseNum[2] = 2;
      reverseNum[3] = 3;
      reverseNum[4] = 4;
      algo.reverseArray(reverseNum);
      System.out.println("Array reversed is: ");
      algo.printInt(reverseNum);
      
      reverseNum = new int[6];
      reverseNum[0] = 24;
      reverseNum[1] = 26;
      reverseNum[2] = 28;
      reverseNum[3] = 30;
      reverseNum[4] = 32;
      reverseNum[5] = 34;
      algo.reverseArray(reverseNum);
      System.out.println("Array reversed is: ");
      algo.printInt(reverseNum);

      reverseNum = new int[7];
      reverseNum[0] = 0;
      reverseNum[1] = -2;
      reverseNum[2] = -4;
      reverseNum[3] = -6;
      reverseNum[4] = -8;
      reverseNum[5] = -10;
      reverseNum[6] = -12;
      algo.reverseArray(reverseNum);
      System.out.println("Array reversed is: ");
      algo.printInt(reverseNum);
      
      
      //Reverse String
      String[] reverseStr = {"code", "typing", "am", "I", "hello"};
      algo.reverseStrArray(reverseStr);
      System.out.println("String reversed is: ");
      algo.printStr(reverseStr);
      
      reverseStr = new String[] {"moon", "the", "over", "jumped", "cow", "the"};
      algo.reverseStrArray(reverseStr);
      System.out.println("String reversed is: ");
      algo.printStr(reverseStr);
      
      reverseStr = new String[] {"am", "I", "Yoda", "like", "talking"};
      algo.reverseStrArray(reverseStr);
      System.out.println("String reversed is: ");
      algo.printStr(reverseStr);
      
      
      //String split using any delemiter(String, delim)(returns a String[])
      String t = "I like to eat cookies";
      String[] tArray = t.split(" ");
      System.out.println("String split is: ");
      algo.splitStr(tArray);
      
      t = "11/10/2018";
      tArray = t.split("/");
      System.out.println("String split is: ");
      algo.splitStr(tArray);
      
      t = "This\\string\\is\\now\\split";
      tArray = t.split("\\\\");
      System.out.println("String split is: ");
      algo.splitStr(tArray);
      
      
      //Bubble sort int[]
      int[] arr = new int[5];
      arr[0] = 12;
      arr[1] = 56;
      arr[2] = 34;
      arr[3] = 90;
      arr[4] = 78;
      System.out.println("Before sort: ");
      algo.print(arr);
      algo.sortInt(arr);
      System.out.println("Int sorted is: ");
      algo.print(arr);
      System.out.println("--------------------");
      
      arr = new int[6];
      arr[0] = 60;
      arr[1] = 0;
      arr[2] = 20;
      arr[3] = 80;
      arr[4] = 40;
      arr[5] = 100;
      System.out.println("Before sort: ");
      algo.print(arr);
      algo.sortInt(arr);
      System.out.println("Int sorted is: ");
      algo.print(arr);
      System.out.println("--------------------");
      
      arr = new int[7];
      arr[0] = 50;
      arr[1] = 10;
      arr[2] = 70;
      arr[3] = 30;
      arr[4] = 60;
      arr[5] = 20;
      arr[6] = 40;
      System.out.println("Before sort: ");
      algo.print(arr);
      algo.sortInt(arr);
      System.out.println("Int sorted is: ");
      algo.print(arr);
      System.out.println("--------------------");
      
      
      //Bubble sort String[]
      String[] sArray = {"a", "c", "b", "e", "d"};
      System.out.println("Before sort: ");
      algo.printStr(sArray);
      algo.sortStr(sArray);
      System.out.println("String sorted is: ");
      algo.printStr(sArray);
      
      sArray = new String[] {"y", "x", "z", "w", "u", "v"};
      System.out.println("Before sort: ");
      algo.printStr(sArray);
      algo.sortStr(sArray);
      System.out.println("String sorted is: ");
      algo.printStr(sArray);
      
      sArray = new String[] {"apple", "cookie", "egg", "dish", "banana"};
      System.out.println("Before sort: ");
      algo.printStr(sArray);
      algo.sortStr(sArray);
      System.out.println("String sorted is: ");
      algo.printStr(sArray);
      
      
      //Prime Number
      int n = 5;
      boolean result12 = algo.isPrime(n);
      System.out.println("Is the given number a prime number? " + result12);
      
      n = 12;
      result12 = algo.isPrime(n);
      System.out.println("Is the given number a prime number? " + result12);
      
      n = 517;
      result12 = algo.isPrime(n);
      System.out.println("Is the given number a prime number? " + result12);
      
   }

}
