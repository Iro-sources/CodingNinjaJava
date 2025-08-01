import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oppgave2_2 {
    public static void main(String[] args){
        int earthWeight = 76;
        double moonGravity = 0.17;
        double moonWeight = earthWeight *  moonGravity;

        System.out.println("My weight on Earth is " + earthWeight +
                " kgs, which will be " + moonWeight + " kgs on the moon.");

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        int count = 0;
        while (sum > 0){
            if (sum % 2 ==0){
                sum /= 2;
                count ++;

            }
            else {
                sum -= 1;
                count ++;
            }
        }
        System.out.println(count);

    }
}


