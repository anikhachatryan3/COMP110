//Name: Ani Khachatryan
//Date: 10/20/2018
//App: Corgi
//Purpose: Breed #3: must use default size and override at least 1 other (different) feature/method

class Corgi extends Dog {
   
   public Corgi(String name) {
      //calling Dog's constructor
      //must be the first line!
      super(name);
   }
   
   //override bark method
   @Override
   public String bark() {
      return "BORF";
   }
   
   //default speed
   //default size
   //default color
   
}
