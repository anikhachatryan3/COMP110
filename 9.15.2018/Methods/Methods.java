//Name: Ani Khachatryan
//Date: 9/15/2018
//App: Methods
//Purpose: To write all 5 methods in one class, and call each method 3 times.

class Methods {

   //Method 1: Area of a Circle
   public static double getAreaOfACircle(double r) {
      double a = r * r * Math.PI;
      return a;
   }
      
   //Method 2: Circumference of a Circle
   public static double getCircumferenceOfACircle(double r1) {
      double c = 2 * Math.PI * r1;
      return c;
   }
   
   //Method 3: Celsius to Fahrenheit
   public static double getCeliusToFahrenheit(double celsius) {
      double cf = (9*celsius)/5+32;
      return cf;
   }
   
   //Method 4: Fahrenheit to Celsius
   public static double getFahrenheitToCelsius(double fahrenheit) {
      double fc = ((fahrenheit - 32)*5)/9;
      return fc;
   }
      
   //Method 5: Quadratic Formula
   public static double quadraticEquationPlus(double a, double b, double c) {
      double insideSqrt = (b * b) - (4 * a * c);
      double squareRoot = Math.sqrt(insideSqrt);
      double numerator = (-1 * b) + squareRoot;
      double denominator = 2 * a;
      double x = numerator/denominator;
      return x;
   }
   
   public static double quadraticEquationMinus(double a, double b, double c) {
      double insideSqrt = (b * b) - (4 * a * c);
      double squareRoot = Math.sqrt(insideSqrt);
      double numerator = (-1 * b) - squareRoot;
      double denominator = 2 * a;
      double x = numerator/denominator;
      return x;
   }

   
   public static void main(String args[]) {
      
      //Calling Method 1
      double r = 2.45;
      double aResult = getAreaOfACircle(r);
      System.out.println("The radius is: " + r + ", which means the area of the circle is: " + aResult + ".");

      r = 23.21;
      aResult = getAreaOfACircle(r);
      System.out.println("The radius is: " + r + ", which means the area of the circle is: " + aResult + ".");
      
      r = 15.78;
      aResult = getAreaOfACircle(r);
      System.out.println("The radius is: " + r + ", which means the area of the circle is: " + aResult + ".");
      
      
      //Calling Method 2
      double r1 = 7.91;
      double cResult = getCircumferenceOfACircle(r1);
      System.out.println("The radius is " + r1 + ", which means the circumference of the circle is " + cResult + ".");
      
      r1 = 33.62;
      cResult = getCircumferenceOfACircle(r1);
      System.out.println("The radius is " + r1 + ", which means the circumference of the circle is " + cResult + ".");
      
      r1 = 54.90;
      cResult = getCircumferenceOfACircle(r1);
      System.out.println("The radius is " + r1 + ", which means the circumference of the circle is " + cResult + ".");
      
      
      //Calling Method 3
      double celsius = 27.2;
      double cfResult = getCeliusToFahrenheit(celsius);
      System.out.println(celsius + " degrees Celsius is " + cfResult + " degrees Fahrenheit.");
      
      celsius = 31.9;
      cfResult = getCeliusToFahrenheit(celsius);
      System.out.println(celsius + " degrees Celsius is " + cfResult + " degrees Fahrenheit.");
      
      celsius = -12;
      cfResult = getCeliusToFahrenheit(celsius);
      System.out.println(celsius + " degrees Celsius is " + cfResult + " degrees Fahrenheit.");
      
      
      //Calling Method 4
      double fahrenheit = 92;
      double fcResult = getFahrenheitToCelsius(fahrenheit);
      System.out.println(fahrenheit + " degrees Fahrenheit is " + fcResult + " degrees Celsius.");
      
      fahrenheit = 24.7;
      fcResult = getFahrenheitToCelsius(fahrenheit);
      System.out.println(fahrenheit + " degrees Fahrenheit is " + fcResult + " degrees Celsius.");
      
      fahrenheit = 111;
      fcResult = getFahrenheitToCelsius(fahrenheit);
      System.out.println(fahrenheit + " degrees Fahrenheit is " + fcResult + " degrees Celsius.");
      
      
      //Calling Method 5
      double a = 1;
      double b = 0;
      double c = 1;
      double xPlus = quadraticEquationPlus(a, b, c);
      double xMinus = quadraticEquationMinus(a, b, c);
      double x = 1;
      double y = 1;
      if(Double.isNaN(xPlus) && Double.isNaN(xMinus)) {
         System.out.println("No solution.");
      }
      else if(xPlus == xMinus) {
         System.out.println("Solution is: " + xPlus + ".");
      }
      else {
         System.out.println("Solutions are: " + xPlus + ", and " + xMinus);
      }

      
      a = 1;
      b = -2;
      c = 1;
      xPlus = quadraticEquationPlus(a, b, c);
      xMinus = quadraticEquationMinus(a, b, c);
      if(Double.isNaN(xPlus) && Double.isNaN(xMinus)) {
         System.out.println("No solution.");
      }
      else if(xPlus == xMinus) {
         System.out.println("Solution is: " + xPlus + ".");
      }
      else {
         System.out.println("Solutions are: " + xPlus + ", and " + xMinus);
      }
      
      a = 10;
      b = 13;
      c = 2;
      xPlus = quadraticEquationPlus(a, b, c);
      xMinus = quadraticEquationMinus(a, b, c);
      if(Double.isNaN(xPlus) && Double.isNaN(xMinus)) {
         System.out.println("No solution.");
      }
      else if(xPlus == xMinus) {
         System.out.println("Solution is: " + xPlus + ".");
      }
      else {
         System.out.println("Solutions are: " + xPlus + ", and " + xMinus);
      }
      
      a = 3;
      b = 0;
      c = 2;
      xPlus = quadraticEquationPlus(a, b, c);
      xMinus = quadraticEquationMinus(a, b, c);
      if(Double.isNaN(xPlus) && Double.isNaN(xMinus)) {
         System.out.println("No solution.");
      }
      else if(xPlus == xMinus) {
         System.out.println("Solution is: " + xPlus + ".");
      }
      else {
         System.out.println("Solutions are: " + xPlus + ", and " + xMinus);
      }
      
      a = 2;
      b = 8;
      c = 8;
      xPlus = quadraticEquationPlus(a, b, c);
      xMinus = quadraticEquationMinus(a, b, c);
      if(Double.isNaN(xPlus) && Double.isNaN(xMinus)) {
         System.out.println("No solution.");
      }
      else if(xPlus == xMinus) {
         System.out.println("Solution is: " + xPlus + ".");
      }
      else {
         System.out.println("Solutions are: " + xPlus + ", and " + xMinus);
      }
      
      a = 3;
      b = 7;
      c = 2;
      xPlus = quadraticEquationPlus(a, b, c);
      xMinus = quadraticEquationMinus(a, b, c);
      if(Double.isNaN(xPlus) && Double.isNaN(xMinus)) {
         System.out.println("No solution.");
      }
      else if(xPlus == xMinus) {
         System.out.println("Solution is: " + xPlus + ".");
      }
      else {
         System.out.println("Solutions are: " + xPlus + ", and " + xMinus);
      }
      
   }

}
