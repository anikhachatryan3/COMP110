//Name: Ani Khachatryan
//Date: 08/25/2018
//Application: AreaOfACircle
//Purpose: To print out the area of a circle, given a radius.

class AreaOfACircle {

    public static void main(String args[]){
       
        //Declaration
        double radius;
        double area;
        final double PI = 3.14159265;
       
        //Initialization
        radius = 7;
       
        //Compute Area
        area = radius * radius * PI;
        System.out.println("Area of circle = " + area);
    }

}
