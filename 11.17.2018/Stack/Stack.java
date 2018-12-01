//Name: Ani Khachatryan
//Date: 11.17.2018
//App: Stack
//Purpose:

public class Stack {
   
   //member variables
   private int MAX_SIZE = 10;
   private int top;
   private String[] stack;
   
   
   //constructor
   public Stack() {
      
      stack = new String[MAX_SIZE];
      top = -1;
      
   }
   
   //push
   public void push(String item) {
      
      if(isFull()) {
         
         ;
         
      }
      else {
         top++;
         stack[top] = item;
         System.out.println("Process complete!");
         
      }
      
   }
   
   //pop
   public String pop() {

      if(!isEmpty()) {
         
         return stack[top--];
         
      }
      else {
         
         return null;
         
      }
      
   }
   
   //peek
   public void peek() {
      
      System.out.println(stack[top]);
      
   }
   
   //isEmpty
   public boolean isEmpty() {
      return (top == -1);
   }
   
   //search
   public void search(String item) {
      
      int i = 0;
      while(i < top) {
         
         if(stack[i] == item) {
            
            System.out.println(top - i);
            
         }
         i++;
         
      }
      if(i == top) {
         
         System.out.println("Item not found.");
         
      }
      
   }
   
   public boolean isFull() {
      return (top == MAX_SIZE - 1);
   }
   
}
