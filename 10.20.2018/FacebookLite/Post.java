//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Post
//Purpose:

class Post implements IDisplayable {

   private Stack posts;
   private boolean isPostsVisible;
   
   public Post() {
      posts = new Stack(5);
   }
   
   public void display() {
      posts.print();
   }
   
   public void toggleVisibility() {
      isPostsVisible = !isPostsVisible;
   }

}
