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
         
         for(int i = 0; i < ) {
            
         }
         
      }
      
   }

}
