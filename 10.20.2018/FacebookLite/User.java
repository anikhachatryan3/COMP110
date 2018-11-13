//Name: Ani Khachatryan
//Date: 11/03/2018
//App: User
//Purpose:

public class User extends Person implements IDisplayable {

   private String status;
   private boolean isAgeVisible;
   
   public User(String f, String l, int a) {
      
      super(f, l, a);
      status = "What are you doing today?";
      isAgeVisible = true;
      
   }
   
   public void display() {
      System.out.println("Name: " + getFName() + " " + getLName());
      System.out.println("Status: " + status);
      
      if(isAgeVisible == true) {
         System.out.println("Age: " + getAge());
      }
   }
      
   public void toggleVisibility() {
      isAgeVisible = !isAgeVisible;
   }
   
   public String getStatus() {
      return status;
   }
   
   public void setStatus(String status){
      this.status = status;
   }
   
}
