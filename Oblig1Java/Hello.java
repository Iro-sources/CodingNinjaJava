import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static  void main (String[] args){
        System.out.println("Hello World!");
        System.out.println("Enter a digit: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;

        while (n>0){
            int digit = n%10;
            sum += digit;
            product *= digit;

            n = n/10;
        }
        System.out.println(product - sum);

        System.out.println();

        //You can convert without errors if the string is valid number into Int
        String name = "123";
        int x = Integer.parseInt(name);
        System.out.println(x * 2);

        //You can't convert if the string is not valid number it give 'NumberFormatException'
//        String test_str = "abc";
//        int test_int = Integer.parseInt(test_str);
//        System.out.println(test_int);

        //FizzBuzz
        List<String> results = new ArrayList<>();
        for ( int i = 1; i<= 15; i++) {
            if (i % 3 ==0 && i % 5 == 0)
            {
                results.add("FizzBuzz");
            }

            else if (i % 3 == 0 )
            {
                results.add("Fizz");
            }

            else if (i% 5== 0)
            {
                results.add("Buzz");
            }
            else{
                results.add(Integer.toString(i));
            }
        }
        System.out.println(results);


        //1342. Number of Steps to Reduce a Number to Zero
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;

        while (number > 0){
            if (number % 2 ==0){
                count ++;
                number /= 2;
            }
            else {
                number -= 1;
                count ++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}



