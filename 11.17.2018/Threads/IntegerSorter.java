import java.io.*;

class IntegerSorter implements Runnable {
      
      private Thread t;
      private final int SIZE = 100000;
      private int[] arr;
   
   public IntegerSorter() {
      arr = new int[SIZE];
   }
   
   public void run() {
      
      generate();
      sort(arr);
      write();
      
   }
   
   public void generate() {
      for(int i = 0; i < SIZE; i++) {
         arr[i] = (int)(Math.random() * SIZE);
      }
   }
   
   public void sort(int[] arr) {
      
      int n = arr.length;
      for(int i = 0; i < n; i++) {
         
         for(int j = 1; j < n - i; j++) {
            
            if(arr[j - 1] > arr[j]) {
               
               swap(j, arr);
               
            }
            
         }
         
      }
      
   }
   
   public void swap(int j, int[] arr) {
      
      int temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      
   }
   
   public void write() {
      
      try {
         
         PrintStream writer = new PrintStream(new File("outputInt.txt"));
         for(int i = 0; i < SIZE; i++) {
            
            writer.println(arr[i]);
            
         }
         
         writer.close();
         
      }
      catch(IOException e) {
         
         System.out.println(e);
         
      }
      
   }
   
   public void start1() {
      
      if(t == null) {
         
         t = new Thread(this, "Name");
         t.start();
         
      }
      
   }

}
