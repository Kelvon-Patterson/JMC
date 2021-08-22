public class Strings {
     public static void main(String [] args){
         //byte
         //short
         //int
         //long
         //float
         //double
         //char
         //boolean

         //String is a datatype in java that is not a primitive type. It's actually a class.
         //What is a string ? A sequence of charachters. (more than one)

         String myString = "This is a string";
         System.out.println(myString);
         myString= myString+ " this is a string";
         System.out.println(myString);
         myString = myString + " \u00A9 2021";
         System.out.println(myString);

         String numberString = "250.55";
         numberString = numberString + "49.95";
         System.out.println(numberString);
        String lastString = "10";
         int myInt = 50;
         lastString = lastString + myInt;
         System.out.println(lastString);
         double  doubleNumber = 120.47d;
        lastString= lastString + doubleNumber;
        System.out.println(lastString+doubleNumber);
     }
}
