//Name: Ani Khachatryan
//Date: 12.01.2018
//App: Driver
//Purpose:

class Driver {

   //main
   public static void main(String[] args) {
      
      //build and show app using the event-dispatching thread
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         
         public void run() {
            
            MyFirstGUIApp gui = new MyFirstGUIApp();
            
         }
         
      });
      
   }

}
