//Name: Ani Khachatryan
//Date: 12.01.2018
//App: Driver
//Purpose:

import javax.swing.SwingUtilities;

class Driver {

   //main
   public static void main(String[] args) {
      
      //build and show app using the event-dispatching thread
      SwingUtilities.invokeLater(new Runnable() {
         
         public void run() {
            
            GUIApp gui = new GUIApp();
            
         }
         
      });
      
   } //end main

}
