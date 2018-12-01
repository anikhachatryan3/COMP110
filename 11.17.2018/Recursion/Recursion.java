//Name: Ani Khachatryan
//Date: 11.17.2018
//App: Recursion
//Purpose:

class Recursion {

   //Factorial
   public int factorial(int n) {
      
      if(n <= 1) {
         
         return 1;
         
      }
      return n * factorial(n - 1);
      
   }
   
   //Euclidean Algorithm
   public int gcd(int x, int y) {
      
      if(y == 0) {
         return x;
      }
      return gcd(y, (x % y));
      
   }
   
   //Fibonacci Sequence
   public int fib(int i) {
      
      if(i <= 1) {
         return 1;
      }
      return fib(i - 1) + fib(i - 2);
      
   }

}
