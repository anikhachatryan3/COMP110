//Name: Ani Khachatryan
//Date:

import java.util.Scanner;
import java.lang.NumberFormatException;

public class FacebookLite {
   
    private Scanner sc;
    private Profile[] profiles;
    private int idx; //index for profiles array
    private int nop; //number of profiles
    private int opt; //option
    
    public FacebookLite() {
       
        profiles = new Profile[5];
        sc = new Scanner(System.in);
        idx = -1;
        nop = 0;
       
    }
   
   //case 1
    public void createProfile(String fname, String lname, int age) {
       
        if(idx < profiles.length - 1) {
           
            Profile p = new Profile(fname, lname, age);
            idx++;
            profiles[idx] = p;
            nop++;
            Util.print("Profile created!\n");
           
        }
        else {
           
            Util.print("\nNo room to create a new profile\n");
           
        }
       
    }
   
   //case 2
   public void removeLastProfile() {
      profiles[nop-1] = null;
      nop--;
      idx--;
      Util.print("\nProfile deleted.");
      
   }
   
   //case 3
   public void swapProfiles(int profile1, int profile2) {
      Profile temp = profiles[profile2];
      profiles[profile2] = profiles[profile1];
      profiles[profile1] = temp;
   }
   
   public void switchProfiles() {
      
      if(nop == 1) {
         
         Util.print("\nPlease create another profile.\n");
         
      }
      else if(nop == 2) {
         swapProfiles(0, 1);
         Util.print("\nProfile switched.\n");
         
      }
      else if(nop >= 3) {
         
         Util.print("Which profile do you want to switch to? ex. 1, 2...");
         opt = Integer.parseInt(sc.nextLine());
           if(opt >= 1 && opt <= nop) {
              swapProfiles(opt-1, nop-1);
              Util.print("\nProfile switched.\n");
              printProfile();
           }
           else {
              Util.print("\nProfile does not exist.\n");
           }
      }
      
   }
   
   //case 4
   public void printProfile() {
         (profiles[nop-1]).printProfile();

   }
   
   //case 5
   public void addFriend() {
      
      
      
   }
   
   //case 15
   public void deleteAllProfiles() {
      
      profiles = new Profile[5];
      nop = 0;
      idx = -1;
      Util.print("\nProfiles deleted!\n");
      
   }
   
   
    public static void main(String[] args) {
       
        FacebookLite fbl = new FacebookLite();
       
        while(true) {
           
           Util.print("\nWelcome to Facebook Lite! Here is the menu:\n\n0 - Exit\n1 - Create Profile\n2 - Delete last Profile\n3 - Switch Profile\n4 - Print Profile\n5 - Add Friend\n6 - Remove last Friend\n7 - Remove all Friends\n8 - Add Post\n9 - Remove last Post\n10 - Remove all Posts\n11 - Toggle Age\n12 - Toggle Friends\n13 - Toggle Posts\n14 - Change Status\n15 - Delete all Profiles");
            try {
               fbl.opt = Integer.parseInt(fbl.sc.nextLine());
               switch(fbl.opt) {
                     
                   case 0: //exit
                     Util.print("Goodbye");
                     return;
                   case 1: //create profile
                     Util.print("Please enter your first name");
                     String fname = fbl.sc.nextLine();
                     Util.print("Please enter your last name");
                     String lname = fbl.sc.nextLine();
                     Util.print("Please enter your age");
                     int age = Integer.parseInt(fbl.sc.nextLine());
                     fbl.createProfile(fname, lname, age);
                     break;
                   case 2: //delete last profile
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile first.\n\n");
                     }
                     else {
                        fbl.removeLastProfile();
                     }
                     break;
                   case 3:  //switch profiles
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile first.\n");
                     }
                     else {
                        fbl.switchProfiles();
                     }
                     break;
                   case 4:  //print profile
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile.\n");
                     }
                     else {
                       fbl.printProfile();
                     }
                     break;
                   case 5:  //add friend
                     fbl.addFriend();
                     break;
                   case 6:  //remove last friend
                     break;
                   case 7:  //remove all friends
                     break;
                   case 8:  //add post
                     break;
                   case 9:  //remove last post
                     break;
                   case 10: //remove all posts
                     break;
                   case 11: //toggle age
                     break;
                   case 12: //toggle friends
                     break;
                   case 13: //toggle posts
                     break;
                   case 14: //change status
                     break;
                   case 15: //delete all profiles
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile first.\n");
                     }
                     else {
                        fbl.deleteAllProfiles();
                     }
                     break;
                  default:
                     System.out.println("Please enter a valid option.");
                     break;
               }
            }
            catch(NumberFormatException e) {
               System.out.println("Please enter a valid option.");
            }
           
        }
       
    }
   
}
