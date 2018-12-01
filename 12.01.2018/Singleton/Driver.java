//Name: Ani Khachatryan
//Date: 12.01.2018
//App: Driver
//Purpose:

class Driver {

   public static void main(String[] args) {
   
      Singleton sObj1;
      sObj1 = Singleton.getInstance();
      sObj1.setX(7);
      Singleton sObj2 = Singleton.getInstance();
      sObj2.setX(77);
   
      System.out.println(sObj1);
      System.out.println(sObj2);
   
      System.out.println(sObj1.getX());
      System.out.println(sObj2.getX());
   }

}
