//Name: Ani Khachatryan
//Date: 10/6/2018
//App: Jiminy
//Purpose: To make an assistant app that can be used in the terminal.

import java.time.LocalDate;

class Jiminy {

   public static void main(String[] args) {
      
      if(args.length == 0) {
        
         System.out.println("Welcome to Jiminy!\nHere are the following options to choose from:\n-date: prints today's date\n-time: prints today's time\n-proc: prints the available processor(s)\n-freemem: prints free memory\n-maxmem: prints maximum memory\n-totmem: prints total memory.");
         
      }
      else {
         
         for(int i = 0; i < args.length; i++) {
            
            if(args[i].equals("-date")) {
               
               System.out.println("Date: " + java.time.LocalDate.now());
               
            }
            else if(args[i].equals("-time")) {
               
               System.out.println("Time: " + java.time.LocalTime.now());
               
            }
            else if(args[i].equals("-proc")) {
               
               int processor = Runtime.getRuntime().availableProcessors();
               System.out.println("CPU cores: " + processor);
               
            }
            else if(args[i].equals("-freemem")) {
               
               System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory() + " bytes");
               
            }
            else if(args[i].equals("-maxmem")) {
               
               System.out.println("Maximum Memory: " + Runtime.getRuntime().maxMemory() + " bytes");
               
            }
            else if(args[i].equals("-totmem")) {
               
               System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory() + " bytes");
               
            }
            else {
               
               System.out.println("Invalid option.");
               
            }
            
         }
         
      }
   }

}
