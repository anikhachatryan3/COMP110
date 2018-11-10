//Name: Ani Khachatryan
//Date: 10/20/2018
//App: Driver
//Purpose:

class Driver {
   
   public static void main(String[] args) {
      
      String name = "Max";
      Corgi myCorgi = new Corgi(name);
      System.out.println("My dogs name is " + myCorgi.getName());
      System.out.println(myCorgi.getName() + " barks like this [" + myCorgi.bark() +"]");
      System.out.println(name + " has an average speed of: " + myCorgi.getSpeed());
      System.out.println("The color of " + name + " is " + myCorgi.getColor());
      System.out.println("The size of " + name + " is " + myCorgi.getSize());
      
      GermanShepherd myGS = new GermanShepherd();
      System.out.println("My dogs name is " + myGS.getName());
      System.out.println(myGS.getName() + " barks like this [" + myGS.bark() +"]");
      System.out.println(myGS.getName() + " has an average speed of: " + myGS.getSpeed());
      System.out.println("The color of " + myGS.getName() + " is " + myGS.getColor());
      System.out.println("The size of " + myGS.getName() + " is " + myGS.getSize());
      
      GoldenRetriever myGR = new GoldenRetriever();
      System.out.println("My dogs name is " + myGR.getName());
      System.out.println(myGR.getName() + " barks like this [" + myGR.bark() +"]");
      System.out.println(myGR.getName() + " has an average speed of: " + myGR.getSpeed());
      System.out.println("The color of " + myGR.getName() + " is " + myGR.getColor());
      System.out.println("The size of " + myGR.getName() + " is " + myGR.getSize());
      
      Maltese myM = new Maltese();
      System.out.println("My dogs name is " + myM.getName());
      System.out.println(myM.getName() + " barks like this [" + myM.bark() +"]");
      System.out.println(myM.getName() + " has an average speed of: " + myM.getSpeed());
      System.out.println("The color of " + myM.getName() + " is " + myM.getColor());
      System.out.println("The size of " + myM.getName() + " is " + myM.getSize());
      
      Yorkie myY = new Yorkie();
      System.out.println("My dogs name is " + myY.getName());
      System.out.println(myY.getName() + " barks like this [" + myY.bark() +"]");
      System.out.println(myY.getName() + " has an average speed of: " + myY.getSpeed());
      System.out.println("The color of " + myY.getName() + " is " + myY.getColor());
      System.out.println("The size of " + myY.getName() + " is " + myY.getSize());
      
   }
   
}
