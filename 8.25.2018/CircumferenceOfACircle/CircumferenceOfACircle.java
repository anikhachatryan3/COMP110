//Name: Ani Khachatryan
//Date: 08/25/2018
//Application: CircumferenceOfACircle
//Purpose: To print out the circumference of a circle, given a radius.

class CircumferenceOfACircle {

    public static void main(String args[]){
       
        //Declaration
        double radius;
        double circumference;
        final double PI = 3.14159265;

        //Initialization
        radius = 6;
        circumference = 0;
       
        //Usage
        circumference = 2 * PI * radius;
        System.out.println("Circumference of circle = " + circumference);
    }

}
