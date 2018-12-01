public class Friend implements IDisplayable {
   
    private Stack friends;
    private boolean isFriendsVisible;
    
    public Friend() {
       
        friends = new Stack(5);
        isFriendsVisible = true;
       
    }
   
    public void display() {
       
        if(isFriendsVisible) {
           
            Util.print("Friends: ");
           
            if(friends.isEmpty()) {
               
               Util.print("no friends");
               
            }
            else {
               
               friends.print();
            }
           
        }
       
    }
   
    public void toggleVisibility() {
        isFriendsVisible = !isFriendsVisible;
    }
   
    public void addFriend(String name) {
        friends.push(name);
    }
   
    public void removeFriend() {
        friends.pop();
    }
   
    public void reset() {
        friends.reset();
    }
   
    public boolean isEmpty() {
       return friends.isEmpty();
    }
   
   public boolean isFull() {
      return friends.isFull();
   }
   
}
