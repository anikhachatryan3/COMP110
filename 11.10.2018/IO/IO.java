//Name: Ani Khachatryan
//Date: 11/10/2018
//App: IO
//Purpose:

import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.IOException;

class IO {
   
   String[] myArray;
   int idx;
   
   public IO() {
      myArray = new String[30000];
   }
   
   public void read() {
      try {
         Scanner sc = new Scanner(new File("dictionary.txt"));
         
         while(sc.hasNextLine()) {
            String word = sc.nextLine();
            // store word in my array and increment idx
            myArray[idx] = word;
            idx++;
            //System.out.println();

         }

      }
      
      catch(IOException e) {
         
         System.out.println(e);
         
      }
      
   }

   public void sort() {
      
      int n = myArray.length;
      for(int i = 0; i < n; i++) {
         
         for(int j = 1; j < n - i; j++) {
            
            if(myArray[j - 1].compareTo(myArray[j]) > 0) {
               
               swap(j, myArray);
               
            }
            
         }
         
      }
      
   }
   
   private void swap(int j, String[] myArray) {
      
      String str = myArray[j - 1];
      myArray[j - 1] = myArray[j];
      myArray[j] = str;
      
   }
   
   public void write() {
      
      try {
         
         PrintStream writer = new PrintStream(new File("output.txt"));
         for(int i = 0; i < 30000; i++) {
            
            writer.println(myArray[i]);
            
         }
         
         writer.close();
         
      }
      
      catch(IOException e) {
         
         System.out.println(e);
         
      }
      
   }

}
