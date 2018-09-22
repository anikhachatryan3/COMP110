// Name: Ani Khachatryan
// Date: 09/08/2018
// Application: Utilities
// Purpose: Demo Java classes.

import java.util.Scanner;
import javax.swing.JOptionPane;

class Utilities {

   public static void main(String[] args) {
      
      //Demo String
      String testStr = "Mountain";
      int indexOfN = testStr.indexOf('n');
      System.out.println("The index of the letter n in Mountain is: " + indexOfN + ".");
      System.out.println("The length of the word Mountain is: " + testStr.length() + ".");
      
      String firstStr;
      String secondStr;
      firstStr = "This is my first string.";
      secondStr = " This one is my second string.";
      firstStr = firstStr.concat(secondStr);
      System.out.println("firstStr = " + firstStr);
      
      
      //Demo Math
      double cosOfX = Math.cos(1);
      System.out.println("Cos of 1 is: " + cosOfX);
      
      double rand = Math.random() * 80 + 1;
      System.out.println("Some random number between [0,80] is: " + rand);
      int intRand = (int) rand;
      System.out.println("Some random number (without a fraction) is: " + intRand);
      
      int absoluteInt;
      absoluteInt = -45;
      absoluteInt = Math.abs(absoluteInt);
      System.out.println("The absolute value of -45 is: " + absoluteInt + ".");
      
      
      //Demo Scanner
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter year: ");
      int year = sc.nextInt();
      System.out.println("\nYou entered: " + year);
      
      System.out.println("Enter a four digit number: ");
      short digit = sc.nextShort();
      System.out.println("\nYou entered: " + digit);
      
      System.out.print("Enter your age: ");
      byte age = sc.nextByte();
      System.out.println("\nYou entered: " + age);
      
      
      sc.close();
      
      
      //Demo JOptionPane
      String retVal = JOptionPane.showInputDialog(null, "Enter anything.");
      
      JOptionPane.showMessageDialog(null, "You entered: " + retVal);
      
      JOptionPane.showConfirmDialog(null, "Do you like ice cream?", "Choose one.", JOptionPane.YES_NO_OPTION);
      
   }
   
}
