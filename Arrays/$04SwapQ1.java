package Arrays;

//import java.lang.module.FindException;
import java.util.Arrays;

public class $04SwapQ1 {
    public static void main(String[] args) {
        int [] arr={1, 5, 41, 52, 10, 8, 10};
        swap(arr, 0 , 3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
