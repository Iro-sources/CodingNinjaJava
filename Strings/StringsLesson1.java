import java.awt.*;
import java.util.Scanner;

public class StringsLesson1 {
    public static void main(String[] args) {
        System.out.println("");

        String str = "In java string are objects";
        String str1 = new String(str);

        char ch;
        int result, idx;

        //boolean equals(str1);
        if (str.equals(str1)) {
            System.out.println("str equals to str1");
        } else {
            System.out.println("str not equal to str1");
        }

        //int length(str);
        System.out.println(str.length());
        //char charAt(index);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            System.out.println();
        }

//        int compareTo(str);
        result = str.compareTo(str1);
        if (result == 0) {
            System.out.println("str equals to str1");
        } else if (result < 0) {
            System.out.println("str is less than str1");

        } else {
            System.out.println("str is greater than str1");
        }
//        int indexOf(str);
//        int lastIndexOf(str);

        //Arrays of strings
        String[] names = {"abdi", "jimi", "abcd"};
        for (String strs : names) {
            System.out.println(strs + " ");
        }

        //Modifying the array
        names[1] = "Mack";
        names[2] = "math";

        for (String strs : names) {
            System.out.print(strs + " ");
        }

        // Initialize Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

// Ask user for allowed characters
        System.out.print("Enter allowed characters: ");
        String allowed = scanner.nextLine();

// Ask how many words the user wants to input
        System.out.print("Enter number of words: ");
        int n = Integer.parseInt(scanner.nextLine());

// Initialize an array of strings to store the user's words
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

// Variable to count the number of consistent words
        int count = 0;

// Loop through each word to check for consistency
        for (String word : words) {
            // Assume the word is consistent initially
            boolean isConsistent = true;

            // Check each character in the word
            for (char c : word.toCharArray()) {
                // If any character is not in allowed, mark as inconsistent and stop
                if (allowed.indexOf(c) == -1) {
                    isConsistent = false;
                    break;
                }
            }

            // If word is consistent, increase the count
            if (isConsistent) {
                count++;
            }
        }

// Output the number of consistent strings
        System.out.println("Number of consistent strings: " + count);

// Close the scanner to free resources
        scanner.close();

    }
}