//Name: Ani Khachatryan
//Date: 09/4/2018
//Application: FahrenheitToCelsius
//Purpose: To convert fahrenheit to celsius.

class FahrenheitToCelsius {
    
    public static void main(String args []) {
       
        //Declaration
        double fahrenheit;
        double celsius;
       
        //Initialization
        fahrenheit = 87;
        celsius = ((fahrenheit - 32)*5)/9;
       
        //Usage
        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius.");
    }
    
}
