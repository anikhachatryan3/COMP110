public class Post implements IDisplayable {
   
    private Stack posts;
    private boolean isPostsVisible;
    
    public Post() {
       
        posts = new Stack(5);
        isPostsVisible = true;
       
    }
    
    public void display() {
       
       if(isPostsVisible) {
          
         Util.print("Posts: ");
          
         if(posts.isEmpty()) {
            
            Util.print("no posts.");
            
         }
         else {
            
            posts.print();
            
         }
          
       }
       
    }
    
    public void toggleVisibility() {
        isPostsVisible = !isPostsVisible;
    }
   
    public boolean isEmpty() {
        return posts.isEmpty();
    }
   
   public boolean isFull() {
      return posts.isFull();
   }
   
   public void addPost(String post) {
      posts.push(post);
   }
   
   public void removePost() {
      posts.pop();
   }
   
   public void reset() {
      posts.reset();
   }
   
}
