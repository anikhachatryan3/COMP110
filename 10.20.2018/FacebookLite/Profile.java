//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Profile
//Purpose:

class Profile {

   private User u;
   private Friend f;
   private Post p;
   
   public Profile(String f, String l, int a) {
      
      u = new User(f, l, a);
      this.f = new Friend();
      p = new Post();
      
   }
   
   public void printProfile() {
      
      u.display();
      f.display();
      p.display();
      
   }
   
   public void removeLastProfile() {
      
      
      
   }
   
   public void setStatus(String status) {
      u.setStatus(status);
   }
   
   public void togglePosts() {
      p.toggleVisibility();
   }

}
