//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Shape
//Purpose: An abstract class that declares public member variables (double width, double height), declares and implements a method called "setSize" with 2 parameters (double width, double height) that sets/initializes the member variables width and height, and declares an abstract method called “getArea” with no parameters with a return type of double.

public abstract class Shape {

   public double width;
   public double height;
   
   public void setSize(double width, double height) {
      
      this.width = width;
      this.height = height;
      
   }
   
   public abstract double getArea();
      

}
