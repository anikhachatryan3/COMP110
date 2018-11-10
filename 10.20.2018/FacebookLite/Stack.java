//Name: Ani Khacahtryan
//Date: 11/03/2018
//App: Stack
//Purpose:

class Stack {

   private int size;
   private int top;  //"master" index for our array
   private String[] stack;
   
   public Stack(int size) {
      
      this.size = size;
      stack = new String[size];  //needs loop
      top = -1;
      
   }
   
   public boolean isEmpty() {
      return (top == -1);
   }
   
   public boolean isFull() {
      return (top == size - 1);
   }
   
   public void push(String item) {
      
      if(isFull()) {
         System.out.println("Stack is full.");
         return;
      }
      stack[top++] = item;
      
   }
   
   public String pop() {
      if(isEmpty()) {
         System.out.println("Stack is empty.");
      }
      else {
         System.out.println("returns the following item: " + stack[top]);

      }
   }
   
   public void display() {
      for( int i = 0; i < stack.size; i++ ){
         System.print(stack[i] + " ");
      }
   }
}
