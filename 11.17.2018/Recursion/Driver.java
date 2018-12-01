//Name: Ani Khachatryan
//Date: 11.17.2017
//App: Driver
//Purpose:

class Driver {

   public static void main(String[] args) {
   
      Recursion r = new Recursion();
      
      //Factorial
      System.out.println("Factorial of 5 is: " + r.factorial(5));
      
      System.out.println("Factorial of 10 is: " + r.factorial(10));
      
      System.out.println("Factorial of 7 is: " + r.factorial(7));
      
      //Euclidean
      System.out.println("GCD of 10 and 20 is: " + r.gcd(10, 20));
      
      System.out.println("GCD of 15 and 12 is: " + r.gcd(15, 12));
      
      System.out.println("GCD of 2 and 3 is: " + r.gcd(2, 3));
      
      //Fibonacci
      System.out.println("12 in the Fibonacci Sequence is: " + r.fib(12));
      
      System.out.println("1 in the Fibonacci Sequence is: " + r.fib(1));
      
      System.out.println("4 in the Fibonacci Sequence is: " + r.fib(4));
   
   }

}
