//Name: Ani Khachatryan
//Date: 12.01.2018
//App: Singleton
//Purpose:

class Singleton {

   private int x;
   private static Singleton instance = new Singleton();
   
   private Singleton() {
      //blank
   }
   
   public static Singleton getInstance() {

         return instance;
      
   }
   
   public void setX(int x) {
      this.x = x;
   }
   
   public int getX() {
      return x;
   }

}
