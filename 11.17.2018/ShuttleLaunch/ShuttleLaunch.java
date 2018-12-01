//Name: Ani Khachatryan
//Date: 11.17.2018
//App: ShuttleLaunch
//Purpose:

class ShuttleLaunch {

   //1000 milliseconds = 1 second
   final static int SLEEP_TIME_MILLISECONDS = 1000;
   
   public static void main(String[] args) {
      
      String x = "Hello!\nWelcome to the Shuttle Launch!\n";
      for(int i = 0; i < x.length(); i++) {
         
         try {
            System.out.print(x.charAt(i));
            Thread.sleep(SLEEP_TIME_MILLISECONDS/10);
         }
         catch(InterruptedException e) {
            System.out.println("InterruptedException!");
         }
         
      }
      
      for(int j = 10; j >= 0; j--) {
         
         try {
            
            System.out.println("T - " + j);
            Thread.sleep(SLEEP_TIME_MILLISECONDS);
            if(j < 3 && j > 1) {
               System.out.println("Ignition...");
               Thread.sleep(SLEEP_TIME_MILLISECONDS);
            }
            if(j == 0) {
               System.out.println("We have a liftoff!");
            }
            
         }
         catch(InterruptedException e) {
            
            System.out.println("Interrupted.");
            
         }
         
      }
      
   }

}
