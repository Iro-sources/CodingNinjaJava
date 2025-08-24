
public class MethodsWithoutArgu {
    //method
    public static void printDetails(){
        System.out.println("car");
        System.out.println("green");
        System.out.println("1");

    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int x, int y) {
        return x * y + add(5, 4);
    }
    public static void main(String[]args){
        printDetails();

        int result = multiply(2, 3);
        System.out.println(result);

    }
}
