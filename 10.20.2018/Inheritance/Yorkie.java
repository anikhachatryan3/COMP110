//Name: Ani Khachatryan
//Date: 10/20/2018
//App: Yorkie
//Purpose: Breed #1 must use default name and override at least 1 other (different) feature/method

class Yorkie extends Dog {

   public Yorkie() {
      
   }
   
   //override bark method
   @Override
   public String bark() {
      return "ARF";
   }
   
   //override color method
   @Override
   public String getColor() {
      return "black/brown";
   }
   
   //default name
   //default speed
   //default size

}
