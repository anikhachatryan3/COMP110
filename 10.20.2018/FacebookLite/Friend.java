//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Friend
//Purpose:

class Friend implements IDisplayable {

   private Stack friends;
   private boolean isFriendsVisible;
   
   public Friend() {
      
      friends = new Stack(5);
      isFriendsVisible = true;
      
   }
   
   public void addFriend(String name) {
      friends.push(name);
   }
   
   public void removeFriend() {
      friends.pop();
   }
   
   public void removeAllFriends() {
      friends.reset();
   }
   
   public void display() {
      if( isFriendsVisible ){
         friends.display();
         System.out.println("");
      }
   }
}
