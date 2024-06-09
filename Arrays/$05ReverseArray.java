package Arrays;

import java.util.Scanner;

public class $05ReverseArray {
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5};
//
//        // Reverse the array.
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//
//        // Print the reversed array.
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

        //when array input is user defined---->>>

        Scanner in = new Scanner(System.in);

        // Get the size of the array from the user.
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        // Create an array of the specified size.
        int[] arr = new int[size];

        // Get the elements of the array from the user.
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = in.nextInt();

        }
        // Reverse the array.
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}