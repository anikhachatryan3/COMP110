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
         Util.print("New profile created.");
         
      }
      else {
         Util.print("No room to create new profile.");
      }
      
   }
   
   public static void main(String[] args) {
      
      FacebookLite fbl = new FacebookLite();
      while(true) {

         Util.print("Welcome to FacebookLite! Choose an option:\n0 - Exit\n1 - Create Profile\n2 - Delete Last Profile\n3 - switch Profile\n4 - Print Profile\n5 - Add Friend\n6 - Remove Last Friend\n7 - Remove All Friends\n8 - Add Post\n9 - Remove Last Post\n10 - Remove All Posts\n11 - Toggle Age\n12 - Toggle Friends\n13 - Toggle Posts\n14 - Change Status\n15 - Delete All Profiles");

         fbl.opt = Integer.parseInt(sc.nextLine());
         
         switch(fbl.opt) {
               
            case 0: //exit
               Util.print("Goodbye.");
               return;
            case 1: //create Profile
               Util.print("Please enter your first name: ");
               String fname = sc.nextLine();
               Util.print("Please enter your last name: ");
               String lname = sc.nextLine();
               Util.print("Please enter your age: ");
               int age = Integer.parseInt(sc.nextLine());
               fbl.createProfile(fname, lname, age);
               break;
            case 2: //delete last Profile
               if(fbl.nop == 0) {
                  Util.print("Please create a profile first.");
               }
               else {
                  fbl.removeLastProfile();
               }
               break;
            /*case 3: //switch Profile
               break;
            case 4: //print Profile
               break;
            case 5: //add Friend
               break;
            case 6: //remove Last Friend
               break;
            case 7: //remove All Friends
               break;
            case 8: //add Post
               break;
            case 9: //remove Last Post
               break;
            case 10: //remove All Posts
               break;
            case 11: //toggle Age
               break;
            case 12: //toggle Friends
               break;
            case 13: //toggle Posts
               break;
            case 14: //change Status
               break;
            case 15: //delete All Profiles
               break; */
               
         }
         
      }
      
   }

}
