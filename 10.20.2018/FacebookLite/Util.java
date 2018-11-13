//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Util
//Purpose:

public class Util {

   public static void print(String s) {
      System.out.print(s);
   }
   
   public static void reset(String[] s) {
      
      for(int i = 0; i < s.length; i++) {
         
         s[i] = "";
         
      }
      
   }
   
   public static void print(String[] s) {
      
      for(int i = 0; i < s.length; i++) {
         
         System.out.println(s[i]);
         
      }
      
   }
   
   /*public static void reset(String[] s) {
      Util.reset(Stack);
      top = -1;          //not sure of this (what is written inside)
   }*/

}
