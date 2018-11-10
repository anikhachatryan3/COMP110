//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Driver
//Purpose: Driver has the main method, Declare/init a new object of type Triangle, Declare/init a new object of type Rectangle, Declare an object of type Shape and assign it to the the Triangle object. Using the Shape object, call setSize method providing arguments width/height. Reassign the shape object to the rectangle object. Using the Shape object, call setSize method providing arguments width/height. Using the triangle object, print out the area of the triangle by calling getArea(). Using the rectangle object, print out the area of the rectangle by calling getArea()

public class Driver {

   public static void main(String[] args) {
      
      Triangle triangle = new Triangle();
      Rectangle rectangle = new Rectangle();
      
      Shape sh;
      sh = triangle;
      sh.setSize(5, 6);
      
      sh = rectangle;
      sh.setSize(3, 4);
      
      System.out.println("The area of the triangle is: " + triangle.getArea());
      System.out.println("The area of the rectangle is: " + rectangle.getArea());
      

   }

}


