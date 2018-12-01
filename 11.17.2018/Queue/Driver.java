//Name: Ani Khachatryan
//Date: 11.17.2018
//App: Driver
//Purpose:

class Driver {

   public static void main(String[] args) {
      
      Queue queue = new Queue();
      
      //peek 2 times
      for(int i = 0; i < 2; i++) {
         
         queue.peek();
         
      }
      
      //poll 2 times
      for(int i = 0; i < 2; i++) {
         
         queue.poll();
         
      }
      
      //add 13 times
      for(int i = 0; i < 13; i++) {
         
         queue.add(i);
         
      }
      
      //peek
      queue.peek();
      
      //poll
      queue.poll();
      
      //peek
      queue.peek();
      
      //poll 15 times
      for(int i = 0; i < 15; i++) {
         
         queue.poll();
         
      }
      
      //peek
      queue.peek();
      
   }

}
