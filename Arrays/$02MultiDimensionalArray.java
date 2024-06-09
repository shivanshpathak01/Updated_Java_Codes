package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class $02MultiDimensionalArray {
    public static void main(String[] args) {
//        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        int [][] arr = new int [3][3];
        System.out.println(arr.length);
        for (int row = 0;row<arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
//        for (int row = 0;row<arr.length;row++){
//            for (int col =0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
//
//        For enhanced for loop ------>>>>
        for (int [] a : arr){
            System.out.println(Arrays.toString(a));
        }

        }
}
