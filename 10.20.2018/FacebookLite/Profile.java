public class Profile {
   
    private User u;
    private Friend f;
    private Post p;
    
    public Profile(String fname, String lname, int age) {
       
        u = new User(fname, lname, age);
        f = new Friend();
        p = new Post();
       
    }
   
    public void printProfile() {
       
        u.display();
        f.display();
        p.display();
       
    }
   
    public void setStatus(String status) {
        u.setStatus(status);
    }
   
    public void togglePosts() {
        p.toggleVisibility();
    }
   
   public void addFriend(String name) {
      f.addFriend(name);
   }
   
   public void removeLastFriend() {
      f.removeFriend();
   }
   
   public void removeAllFriends() {
      f.reset();
   }
   
   public boolean isFriendsEmpty() {
      return f.isEmpty();
   }
   
   public boolean isFriendsFull() {
      return f.isFull();
   }
   
   public void addPost(String post) {
      p.addPost(post);
   }
   
   public void removeLastPost() {
      p.removePost();
   }
   
   public void removeAllPosts() {
      p.reset();
   }
   
   public boolean isPostsEmpty() {
      return p.isEmpty();
   }
   
   public boolean isPostsFull() {
      return p.isFull();
   }
   
}
