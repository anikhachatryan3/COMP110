//Name: Ani Khachatryan
//Date: 9/22/2018
//App: Loops
//Purpose: To make an application that will run forever.

import java.util.Scanner;

class Loops {
   
   //For Loop
   public static void forLoop(int decimal) {
      for(int var = decimal; var<=126; var++) {
         System.out.println(var + " = " + (char) var);
      }
   }
   
   //While Loop
   public static void whileLoop(int decimal) {
      int var = decimal;
      while(var<=126) {
         System.out.println(var + " = " + (char) var);
         var++;
      }
   }
   
   //Do-While Loop
   public static void doWhileLoop(int decimal) {
      int var = decimal;
      do {
         System.out.println(var + " = " + (char) var);
         var++;
      } while(var<=126);
   }
   

   public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int option;
      
      while(true) {
          System.out.print("Please enter an option (0 - exit, 1 - use for loop, 2 - use while loop, 3 - do/while loop): ");
          option = Integer.parseInt(sc.nextLine());
      
          if(option == 0) {
             break;
          }
          else if(option == 1 || option == 2 || option == 3) {
             System.out.print("Enter a number between 33 and 126: ");
             int input = Integer.parseInt(sc.nextLine());
         
             if(option == 1) {
                forLoop(input);
             }
             else if(option == 2) {
                whileLoop(input);
             }
             else if(option == 3 && (input >= 33 && input <= 126)) {
                doWhileLoop(input);
             }
         
          }
          else {
             System.out.println("Invalid option.");
          }
      }

      sc.close();
      
   }

}
