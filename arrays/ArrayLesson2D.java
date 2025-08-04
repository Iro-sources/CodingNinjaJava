import java.awt.*;

public class ArrayLesson2D {
    public static void main(String[]args){
        int[][] T= {{11,12,5,2},{15,6,10,6},{0,5,11,13},{10,8,12,5},{12,15,8,6}};

        for(int i=0; i<T.length; i++){ //Every row in T is an array
            for(int j=0; j<T[i].length; j++){ //Every col of the array row is element
                System.out.print(T[i][j] + " "); //Print element
            }
            System.out.println(); //New Line
        }

        System.out.println("-----------------------");
        //declares and initializes a 2d array
        //the array consists of 3 rows and 4 columns
        int table [][] = new int[3][4];
        int i, t;

        //Loops through the ith row
        for (t=0; t<3; ++t){
            //loops through
            for (i =0; i<4; ++i) {
                table[t][i] = (t*4)+i+1;
                System.out.print(table[t] [i] + " ");
            }
            System.out.println();
        }
    }
}
