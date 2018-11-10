class Lecture6 {
   
   public static double getCircumferenceOfACircle(double r) {
      double c = 2 * 3.14 * r;
      return c;
   }

   public static void main(String args[]) {
      
      //call method
      double r = 2.367;
      double results = getCircumferenceOfACircle(r);
      System.out.println("Radius = " + r + " -- Circumference = " + results);
      
   }

}
