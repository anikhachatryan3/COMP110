//Name: Ani Khachatryan
//Date: 11.17.2018
//App: Driver
//Purpose:

class Driver {

   public static void main(String[] args) {
      
      Stack st = new Stack();
      
      //isEmpty
      System.out.println("Is the stack empty? " + st.isEmpty());
      
      //pop
      System.out.println("Pop: " + st.pop());
      
      //push 13 times
      for(int i = 0; i < 13; i++) {
         st.push(i + "");
      }
      
      //search
      st.search("5");
      
      //peek
      st.peek();
      
      //pop
      System.out.println("Pop: " + st.pop());
      
      //peek
      st.peek();
      
      //isEmpty
      System.out.println("Is the stack empty? " + st.isEmpty());
      
      //pop 15 times
      for(int i = 0; i < 15; i++) {
         System.out.println("Pop: " + st.pop());
      }
      
   }

}
