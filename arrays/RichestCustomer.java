import java.awt.*;
import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[]args) {
        // Import Scanner if you plan to allow user input (optional)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of banks: ");

        // Initialize the 2D array representing customer accounts (or get it from input)
        int customers = sc.nextInt();

        System.out.println("Enter banks per customer: ");

        int banks = sc.nextInt();

        int accounts[][] = new int[customers][banks];

        // Initialize a variable to store the maximum wealth found so far
        int maximumWealth = 0;

        //Fill the 2D array from user input
        System.out.println("Enter balance: ");
        for (int i = 0; i<customers; i++){
            for (int j = 0; j<banks; j++){
                accounts[i][j] = sc.nextInt();

            }
        }
        // Loop through each customer (each row of the 2D array)
        for ( int i = 0; i< customers; i++){
            int customerWealth =0;

            for (int j =0; j<banks; j++){
                customerWealth += accounts[i][j];
            }
            if (customerWealth > maximumWealth){
                maximumWealth = customerWealth;
            }
        }
        System.out.println("The maximum wealth is: " +maximumWealth);

                    //1
//        class Solution {
//            public int maximumWealth(int[][] accounts) {
//                int maximumWealth = 0;
//
//                for (int i = 0; i < accounts.length; i++) {
//                    int customerWealth = 0;
//
//                    for (int j = 0; j < accounts[i].length; j++) {
//                        customerWealth += accounts[i][j];
//                    }
//
//                    if (customerWealth > maximumWealth) {
//                        maximumWealth = customerWealth;
//                    }
//                }
//
//                return maximumWealth;
//            }
//        }

                //2
//        class Solution {
//            public int maximumWealth(int[][] accounts) {
//                int maximumWealth = 0;
//
//
//                for ( int i = 0; i< accounts.length; i++){
//                    int customerWealth =0;
//
//                    for (int j =0; j<accounts[i].length; j++){
//                        customerWealth += accounts[i][j];
//                    }
//                    maximumWealth = Math.max(maximumWealth, customerWealth);
//
//                }
//                return maximumWealth;
//            }
//        }
    }

}
