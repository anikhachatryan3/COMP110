//Name: Ani Khachatryan
//Date: 11.17.2018
//App: Queue
//Purpose:

class Queue {

   private int MAX_SIZE = 10;
   private int front;
   private int rear;
   private int[] queue;
   
   //constructor
   public Queue() {
      
      queue = new int[MAX_SIZE];
      front = -1;
      rear = -1;
      
   }
   
   //add
   public void add(int item) {
      
      if(rear == MAX_SIZE - 1) {
         
         ;
         
      }
      else {
         
         rear += 1;
         queue[rear] = item;
         
         if(front == -1) {
            
            front = 0;
            
         }
         
      }
      
   }
   
   //poll
   public void poll() {
      
      if(front == -1) {
         
         System.out.println("Queue is empty.");
         
      }
      else {
         
         System.out.println("Processing the value of the item at index: 'front' ");
         
         if(front == rear) {
            
            front = -1;
            rear = -1;
            
         }
         else {
            
            front += 1;
            
         }
         
         
      }
      
   }
   
   //peek
   public void peek() {
      
      if(front > -1) {
         
         System.out.println(queue[front]);
         
      }
      else {
         
         System.out.println("Queue is empty.");
         
      }
      
   }

}
