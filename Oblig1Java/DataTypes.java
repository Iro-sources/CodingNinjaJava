import javax.swing.*;

public class DataTypes {
    public static void main(String[]args) {

        int num1 = 2;
        int num2 = 3;

        int num3 = num1 * num2;

        //When printing a single line use
        System.out.println("one\ntwo\nthree");

        //prints on the same line and does not add a new line at the end.
        System.out.print("********");

        //prints and then moves the cursor to the next line.
        System.out.println("---------");
        System.out.println(num3);

       //Moon weight
       double gravity = 0.17;
       int myWeight = 76;

       double moon_weight = gravity * myWeight;
       System.out.println(moon_weight);

       //converting inches to meters
       int counter = 0;
       double inches, meters;

       for (inches = 1; inches <= 144; inches ++){
           meters = inches / 39.37;
           System.out.println(inches + " inches " + meters +" meters");

           counter ++;
           if (counter == 12){
               System.out.println();
               counter = 0;
           }
       }

       //Limiting the decimal places into two
      // System.out.printf("The height is: %.2f meters\n", meters);


        //Converting meters to inches
       meters = 175.3;
       double inchPerMeter = 39.37;
       double heightInInch = meters * inchPerMeter;

       System.out.println("The height is : " + heightInInch + " inches");

        /*Write a program that:
        Loops from 1 to 50
        For each number:
        Prints whether it's even or odd
        Every 10 numbers, prints a divider line
        Bonus: Format the output nicely
*/
        int number;
        int lineCount = 0;
        for (number = 1; number <= 50; number++){
            if (num1 % 2 == 0) {
                System.out.println(number + " is even");
            }
            else{
                System.out.println(number + " is Odd");
                }

            lineCount ++;
            if (lineCount == 10){
            System.out.println("------------");
            lineCount = 0;
        }
        }

    }
}
