package Arrays;

import java.util.Arrays;

public class $10SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 5, 8},
                {10, 33, 2},
                {5, 9, 10}
        };
        int target = 55;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }

    static int[] search(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }


    // >>>>>>>>>>>>>>>>------------MAXXX VALUE...........
    static int max(int [][]hello) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < hello.length; row++) {
            for (int column = 0; column < hello[row].length; column++) {
                if (hello[row][column] > max) {
                    max = hello[row][column];
                }
            }
        }
        return max;
    }
}
