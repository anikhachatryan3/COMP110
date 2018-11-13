//Name: Ani Khachatryan
//Date: 11/03/2018
//App: Person
//Purpose:

public abstract class Person {

   private String fname;
   private String lname;
   private int age;
   
   public Person(String fname, String lname, int age) {
      
      this.fname = fname;
      this.lname = lname;
      this.age = age;
      
   }
   
   //getters
   public String getFName() {
      return fname;
   }
   
   public String getLName() {
      return lname;
   }
   
   public int getAge() {
      return age;
   }
   
   //setters
   public void setFName(String fname) {
      this.fname = fname;
   }
   
   public void setLName(String lname) {
      this.lname = lname;
   }
   
   public void setAge(int age) {
      this.age = age;
   }

}
