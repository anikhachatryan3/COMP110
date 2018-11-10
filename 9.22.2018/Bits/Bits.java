//Name: Ani Khachatryan
//Date: 9/22/2018
//App: Bits
//Purpose: To use all operators discussed in Lecture 8.

import javax.swing.JOptionPane;

class Bits {

   public static void main(String args[]) {
      
      //Bitwise AND (&)
      /* 110101 (53)
        &101000 (40)
       ---------
         100000 (32)
       */
      
      int firstInt = 53;
      int secondInt = 40;
      int resultOne = firstInt & secondInt;
      String resultOneStr = String.format("%32s", Integer.toBinaryString(resultOne)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "53 & 40 = " + resultOne);
      
      
      //Bitwise incluse OR (|)
      /* 11111 (31)
        |10101 (21)
       --------
         11111 (31)
       */
      
      int intOne = 31;
      int intTwo = 21;
      int result1 = intOne | intTwo;
      String result1Str = String.format("%32s", Integer.toBinaryString(result1)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "31 | 21 = " + result1);
      
      
      //Bitwise exclusive OR (^)
      /* 11000 (24)
        ^10001 (17)
       --------
         01001 (9)
       */
      
      int int3 = 24;
      int int4 = 17;
      int result2 = int3 ^ int4;
      String result2Str = String.format("%32s", Integer.toBinaryString(result2)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "24 ^ 17 = " + result2);
      
      
      //Bitwise compliment operator (~)
      /* ~1100 (12)
        -------
         1111 1111 1111 1111 1111 1111 1111 0011 (-13)
       */
      
      int int5 = 12;
      int result3 = ~int5;
      String result3Str = String.format("%32s", Integer.toBinaryString(result3)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "~12 = " + result3);
      
      
      //Bitshift left shift (<<)
      /* <<2 00011110 (30)
         -------------
             01111000 (120)
       */
      
      int int6 = 30;
      int result4 = int6 <<2;
      String result4Str = String.format("%32s", Integer.toBinaryString(result4)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "30 <<2 = " + result4);
      
      
      //Bitshift right shift (>>)
     /* >>2 00011110 (30)
        -------------
            00000111 (7)
      */
      
      int6 = 30;
      int result5 = int6 >>2;
      String result5Str = String.format("%32s", Integer.toBinaryString(result5)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "30 >>2 = " + result5);
      
      
      //Bitshift zero fill right (>>>)
      /* >>>2 00011010 (26)
         --------------
              00000110 (6)
      */
      
      int int7 = 26;
      int result6 = int7 >>>2;
      String result6Str = String.format("%32s", Integer.toBinaryString(result6)).replace(' ', '0');
      JOptionPane.showMessageDialog(null, "26 >>>2 = " + result6);
      
   }

}
