//Name: Ani Khachatryan
//Date: 10/20/2018
//App: FacebookLite
//Purpose:

import java.util.Scanner;

class FacebookLite {

   private static Scanner sc;
   private static Profile[] profiles;
   private static int idx;  //index for profiles array
   private static int nop;      //number of profiles
   private static int opt;      //option
   
   public FacebookLite() {
      
      profiles = new Profile[5];
      sc = new Scanner(System.in);
      idx = -1;
      nop = 0;
      
   }
   
   public void createProfile(String f, String l, int a) {
      
      if(idx < profiles.length - 1) {
         
         Profile profile = new Profile(f, l, a);
         idx++;
         profiles[idx] = profile;
         nop++;
         
      }
      else {
         Util.print("No room to create profile.");
      }
      
   }
   
   public static void main(String[] args) {
      
      FacebookLite fbl = new FacebookLite();
      while(true) {
         
//         printMenu();
         opt = Integer.parseInt(sc.nextLine());
         
         switch(opt) {
            case 0:
               Util.print("Goodbye.");
               return;
            case 1:
               Util.print("Please enter your first name: ");
               String fname = sc.nextLine();
               Util.print("Please enter your last name: ");
               String lname = sc.nextLine();
               Util.print("Please enter your age: ");
               int age = Integer.parseInt(sc.nextLine());
               fbl.createProfile(fname, lname, age);
               break;
//            case 2:
//               if(fbl.nop == 0) {
//                  Util.print("Please create a profile first.");
//               }
//               else {
//                  fbl.removeLastProfile();
//               }
//               break;
//
         }
         
      }
      
   }

}
