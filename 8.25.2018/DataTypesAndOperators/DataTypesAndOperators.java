//Name: Ani Khachatryan
//Date: 08/25/2018
//Application: DataTypesAndOperators
//Purpose: To declare and initialize a variable using all Java primitive types.

class DataTypesAndOperators {

    public static void main(String args[]) {
        
        //Primitive Types
        boolean booleanValue;
        booleanValue = true;
        System.out.println("This is the value of a boolean: " + booleanValue);
        
        char charValue;
        charValue = 'c';
        System.out.println("This is the value of a char: " + charValue);
        
        byte byteValue;
        byteValue = 5;
        System.out.println("This is the value of a byte: "+ byteValue);
        
        short shortValue;
        shortValue = -32000;
        System.out.println("This is the value of a short: "+ shortValue);
        
        int intValue;
        intValue = 21000000;
        System.out.println("This is the value of an int: "+ intValue);
        
        long longValue;
        longValue = 530000000;
        System.out.println("This is the value of a long: "+ longValue);
        
        float floatValue;
        floatValue = 710000000;
        System.out.println("This is the value of a float: " + floatValue);
        
        double doubleValue;
        doubleValue = 990000000;
        System.out.println("This is the value of a double: " + doubleValue);
        
        //String
        String firstString;
        firstString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("My first string says: " + firstString);
        
        //Multiplication
        int multiplicand;
        int multiplier;
        int product;
       
        multiplicand = 3;
        multiplier = 4;
        product = multiplicand*multiplier;
       
        System.out.println(multiplicand + " multiplied by " + multiplier + " equals " + product + ".");
        
        //Division
        int dividend;
        int divisor;
        int quotient;
       
        dividend = 21;
        divisor = 7;
        quotient = dividend/divisor;
       
        System.out.println(dividend + " divided by " + divisor + " equals " + quotient + ".");
        
        //Addition
        double addend1;
        double addend2;
        double sum;
      
        addend1 = 4.5;
        addend2 = 5.3;
        sum = addend1+addend2;
       
        System.out.println(addend1 + " plus " + addend2 + " equals " + sum + ".");
        
        //Subtraction
        double minuend;
        double subtrahend;
        double difference;
       
        minuend = 11.9;
        subtrahend = 6.2;
        difference = minuend-subtrahend;

        System.out.println(minuend + " minus " + subtrahend + " equals " + difference + ".");
        
        //Remainder
        int dividend_Mod;
        int divisor_Mod;
        int remainder_Mod;

        dividend_Mod = 31;
        divisor_Mod = 7;
        remainder_Mod = dividend_Mod%divisor_Mod;

        System.out.println(dividend_Mod + " divided by " + divisor_Mod + " gives a remainder of " + remainder_Mod + ".");
        
        //Shorthand Operators
        int num;
        num = 6;
        System.out.println(num + " pre incremented by 1 equals " + ++num + ".");
        System.out.println(num + " pre decremented by 1 equals " + --num + ".");
        System.out.println(num + " plus 2 equals " + (num += 2) + ".");
        
    }

}
