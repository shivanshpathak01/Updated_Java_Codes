package Rec_Striver;


public class Re4 {
    public static void main(String[] args) {
        int [] arr = {1,5,6,4,35,12};
        Reverse(arr,0, arr.length-1);

    }

    static void Reverse(int[] arr, int i, int j) {
        if (i >= j) return;
        swap(arr, i, j);
         Reverse(arr, i + 1, j - 1);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
