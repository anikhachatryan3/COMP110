//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Triangle
//Purpose: Triangle class inherits members of Shape class. This class has only one method called “getArea”, and the method should return the area of a triangle.

class Triangle extends Shape {
   
   public double getArea() {
      
      double area = (width * height)/2;
      return area;
      
   }

}

