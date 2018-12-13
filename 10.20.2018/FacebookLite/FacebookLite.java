//Name: Ani Khachatryan
//Date:

import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.IOException;
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
//        loadProfiles();
    }
   
   //case 1
    public void createProfile(String fname, String lname, int age) {
       
        if(idx < profiles.length - 1) {
           
            Profile p = new Profile(fname, lname, age);
            nop++;
            idx = nop - 1;
            profiles[idx] = p;
            Util.print("\nProfile created!\n");
           
        }
        else {
           
            Util.print("\nNo room to create a new profile\n");
           
        }
       
    }
   
   //case 2
   public void removeLastProfile() {
      profiles[nop-1] = null;
      nop--;
      if(idx == nop){
         idx--;
      }
      Util.print("\nProfile deleted.");
      
   }
   
   //case 3
   public void switchProfiles() {
      
      if(nop == 1) {
         
         Util.print("\nPlease create another profile.\n");
         
      }
      else if(nop == 2) {
         
         if(idx == 0) {
            
            idx = 1;
            
         }
         else {
            
            idx = 0;
            
         }
         
         Util.print("\nProfile switched.\n");
         
      }
      else if(nop >= 3) {
         
         Util.print("Which profile do you want to switch to?");
         printProfiles();
         try {
         opt = Integer.parseInt(sc.nextLine());
           if(opt >= 1 && opt <= nop) {
              
              idx = opt - 1;
              Util.print("\nProfile switched.\n");
              printProfile();
              
           }
           else {
              Util.print("\nProfile does not exist.\n");
           }
         
         }
         catch(NumberFormatException nfe) {
            Util.print("\nNot a valid option.\n");
         }
      }
      
   }
   
   public void printProfiles() {
      
      for(int i = 0; i < nop; i++) {
         
         Util.print((i + 1) + " - " + profiles[i].getFullName());
         
      }
      
   }
   
   //case 4
   public void printProfile() {
      
      (profiles[idx]).printProfile();

   }
   
   //case 5
   public void addFriend() {
      
      if(profiles[idx].isFriendsFull() == false) {
         
         Util.print("\nEnter the name of the person you want to add: ");
         String name = sc.nextLine();
         
         if(name.length() > 0) {
            
            profiles[idx].addFriend(name);
            Util.print("\nFriend added!\n");
            
         }
         else {
            Util.print("\nMust enter a name.\n");
         }
         
      }
      else {
         
         Util.print("\nNo room to add friend.\n");
         
      }
   }
   
   //case 6
   public void removeLastFriend() {
      
      if(profiles[idx].isFriendsEmpty() == false) {
         profiles[idx].removeLastFriend();
         Util.print("\nFriend removed.\n");
         
      }
      else {
         
         Util.print("\nYou do not have any friends added.\n");
      }
      
   }
   
   //case 7
   public void removeAllFriends() {
      
      if(profiles[idx].isFriendsEmpty() == false) {
         
         profiles[idx].removeAllFriends();
         Util.print("\nAll friends removed.\n");
         
      }
      else {
         Util.print("\nYou do not have any friends added.\n");
      }
      
   }
   
   //case 8
   public void addPost() {
      
      if(profiles[idx].isPostsFull() == false) {
         
         Util.print("What would you like to post? ");
         String post = sc.nextLine();
         
         if(post.length() > 0) {
            
            profiles[idx].addPost(post);
            Util.print("\nYour post has been posted!\n");
            
         }
         else {
            Util.print("\nMust enter something to post.\n");
         }
         
      }
      else {
         Util.print("No room to add new post.");
      }
      
   }
   
   //case 9
   public void removeLastPost() {
      
      if(profiles[idx].isPostsEmpty() == false) {
         
         profiles[idx].removeLastPost();
         Util.print("\nPost removed.\n");
         
      }
      else {
         Util.print("\nYou do not have any posts to remove.\n");
      }
      
   }
   
   //case 10
   public void removeAllPosts() {
      
      if(profiles[idx].isPostsEmpty() == false) {
         
         profiles[idx].removeAllPosts();
         Util.print("\nAll posts removed.\n");
         
      }
      else {
         Util.print("\nYou do not have any posts to remove.\n");
      }
      
   }
   
   //case 11
   public void toggleAge() {
      
      profiles[idx].toggleAge();
      Util.print("\nAge has been toggled!\n");
      
   }
   
   //case 12
   public void toggleFriends() {
         
         profiles[idx].toggleFriends();
         Util.print("\nFriends list has been toggled!\n");
      
   }
   
   //case 13
   public void togglePosts() {
         
         profiles[idx].togglePosts();
         Util.print("\nPosts have been toggled!\n");
      
   }
   
   
   //case 14
   public void changeStatus() {
      
      Util.print("Update your status: ");
      String status = sc.nextLine();
      
      if(status.length() > 0) {
         
         profiles[idx].setStatus(status);
         Util.print("\nStatus updated!\n");
         
      }
      else {
         Util.print("\nYou must enter a message to update your status.\n");
      }
      
   }
   
   //case 15
   public void deleteAllProfiles() {
      
      profiles = new Profile[5];
      nop = 0;
      idx = -1;
      Util.print("\nProfiles deleted!\n");
      
   }
   
   //saveProfile
   public void saveProfiles() {

         try {

            PrintStream writer = new PrintStream(new File("profile.txt"));
            for(int i = 0; i < nop; i++) {
               
               writer.print("//INFO//\n" + profiles[i].getUser().getFName() + ";;" + profiles[i].getUser().getLName() + ";;" + profiles[i].getUser().getAge() + "\n");
               writer.print("//STATUS//\n" + profiles[i].getUser().getStatus() + "\n");
               writer.print("//FRIENDS//\n");
               String[] friends = profiles[i].getFriend().getFriends().getAllFriends();
               for( int j = 0; j < friends.length; j++ ){
//                     if(friends[j].compareTo("null") == 0){
//                        removeLastProfile();
//                     }
                     writer.print(friends[j] + "\n");
                  }
               writer.print("//POSTS//\n");
               String[] posts = profiles[i].getPost().getPosts().getAllPosts();
               for( int k = 0; k < posts.length; k++ ){
                  if( posts.length != 0 ){
                     writer.print(posts[k] + "\n");
                  }
               }
               
               writer.flush();
               
            }
            writer.flush();
            
         }
         catch(IOException e) {
            
            Util.print("Error writing file.");
            
         }

   }
   
   //loadProfile
   public void loadProfiles() {
      try {
         Scanner scan = new Scanner(new File("profile.txt"));
         String line = "";
         while(scan.hasNextLine()) {
 //           System.out.println(scan.nextLine());
            if(!line.equals("//INFO//")){
               line = scan.nextLine();
            }
            if(line.equals("//INFO//")) {
               String[] info = scan.nextLine().split(";;");
               Profile p = new Profile(info[0], info[1], Integer.parseInt(info[2]));
               String status = scan.nextLine();
               status = scan.nextLine();
               if(status != "//FRIENDS//") {
                  // status
                  p.setStatus(status);
               }
               // friends
               String friend;
               if(status == "//FRIENDS//") {
                  friend = status;
               } else {
                  friend = scan.nextLine();
               }
               while(scan.hasNextLine() && !friend.equals("//POSTS//")){
                  friend = scan.nextLine();
                  p.addFriend(friend);
               }
               String post = "//POSTS//";
               while(scan.hasNextLine() && !post.equals("//INFO//")){
                  post = scan.nextLine();
                  p.addPost(post);
               }
               if( post.equals("//INFO//")){
                  line = post;
               }
               nop++;
               idx = nop - 1;
               profiles[idx] = p;
            }
         }
      }
      catch(IOException e) {
         
         Util.print("Error reading file.");
         
      }

   }
   
    public static void main(String[] args) {
       
        FacebookLite fbl = new FacebookLite();
        fbl.loadProfiles();
       
        while(true) {
           
           Util.print("\nWelcome to Facebook Lite! Here is the menu:\n\n0 - Exit\n1 - Create Profile\n2 - Delete last Profile\n3 - Switch Profile\n4 - Print Profile\n5 - Add Friend\n6 - Remove last Friend\n7 - Remove all Friends\n8 - Add Post\n9 - Remove last Post\n10 - Remove all Posts\n11 - Toggle Age\n12 - Toggle Friends\n13 - Toggle Posts\n14 - Change Status\n15 - Delete all Profiles");
            try {
               fbl.opt = Integer.parseInt(fbl.sc.nextLine());
               switch(fbl.opt) {
                     
                   case 0: //exit
                     fbl.saveProfiles();
                     Util.print("\nGoodbye.\n");
                     return;
                   case 1: //create profile
                     Util.print("Please enter your first name");
                     String fname = fbl.sc.nextLine();
                     if(fname.length() > 0) {
                        Util.print("Please enter your last name");
                        String lname = fbl.sc.nextLine();
                        if(lname.length() > 0) {
                           Util.print("Please enter your age");
                           try {
                              int age = Integer.parseInt(fbl.sc.nextLine());
                              if(age >= 12) {
                              fbl.createProfile(fname, lname, age);
                              }
                              else {
                                 Util.print("\nMust be at least 12 years old to create a profile.\n");
                              }
                           }
                           catch(NumberFormatException nfe) {
                              Util.print("\nNot a valid age.\n");
                           }
                        }
                        else {
                           Util.print("\nLast name cannot be blank.\n");
                        }
                     }
                     else {
                        Util.print("\nFirst name cannot be blank.\n");
                     }
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
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile.\n");
                     } else {
                        fbl.addFriend();
                     }
                     break;
                   case 6:  //remove last friend
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile and add a friend to do this.\n");
                     }
                     else {
                        fbl.removeLastFriend();
                     }
                     break;
                   case 7:  //remove all friends
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile and add friends to do this.\n");
                     }
                     else {
                        fbl.removeAllFriends();
                     }
                     break;
                   case 8:  //add post
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile to add a post.\n");
                     }
                     else {
                        fbl.addPost();
                     }
                     break;
                   case 9:  //remove last post
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile and add a post to do this.\n");
                     }
                     else {
                        fbl.removeLastPost();
                     }
                     break;
                   case 10: //remove all posts
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile and add posts to do this.\n");
                     }
                     else {
                        fbl.removeAllPosts();
                     }
                     break;
                   case 11: //toggle age
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile to toggle age.\n");
                     }
                     else {
                        fbl.toggleAge();
                     }
                     break;
                   case 12: //toggle friends
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile to toggle friends.\n");
                     }
                     else {
                        fbl.toggleFriends();
                     }
                     break;
                   case 13: //toggle posts
                     if(fbl.nop == 0) {
                        Util.print("\nPlease create a profile to toggle posts.\n");
                     }
                     else {
                        fbl.togglePosts();
                     }
                     break;
                   case 14: //change status
                     if(fbl.nop > 0) {
                        fbl.changeStatus();
                     }
                     else {
                        Util.print("\nPlease create a profile first.\n");
                     }
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
                     System.out.println("\nPlease enter a valid option.\n");
                     break;
                     
               }
            }
            catch(NumberFormatException nfe) {
               
               System.out.println("\nPlease enter a valid option.\n");
               
            }
           
        }
       
    }
   
}
