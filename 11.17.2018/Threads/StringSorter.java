import java.util.Scanner;
import java.io.*;

class StringSorter implements Runnable {

   private Thread t;
   private final int SIZE = 30000;
   private String[] arr;
   int idx;
   
   public StringSorter() {
      arr = new String[SIZE];
   }
   
   public void run() {
      
      read();
      sort();
      write();
      
   }
   
   public void read() {
      
      try {
         Scanner sc = new Scanner(new File("dictionary.txt"));
         
         while(sc.hasNextLine()) {
            
            String word = sc.nextLine();
            arr[idx] = word;
            idx++;
            
         }
         
      }
      catch(IOException e) {
         
         System.out.println(e);
         
      }
      
   }
   
   public void sort() {
      
      int n = arr.length;
      for(int i = 0; i < n; i++) {
         
         for(int j = 1; j < n - i; j++) {
            
            if(arr[j - 1].compareTo(arr[j]) > 0) {
               
               swap(j, arr);
               
            }
            
         }
         
      }
      
   }
   
   private void swap(int j, String[] arr) {
      
      String str = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = str;
      
   }
   
   public void write() {
      
      try {
         
         PrintStream writer = new PrintStream(new File("outputStr.txt"));
         for(int i = 0; i < SIZE; i++) {
            
            writer.println(arr[i]);
            
         }
         
         writer.close();
         
      }
      catch(IOException e) {
         
         System.out.println(e);
         
      }
      
   }
   
   public void start2() {
      if(t == null) {
         t = new Thread(this, "String");
         t.start();
      }
   }

}
