package Sorting;

import java.util.Arrays;

public class $02SelectionSort {
    public static void main(String[] args) {
      int [] arr = {5,3,4,1,2};
      Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int [] arr){
        for (int i = 0; i < arr.length; i++) {
                 int last = arr.length -i-1;
                 int maxIndex = getmaxIndex(arr, 0,last);
                 swap(arr,maxIndex,last);
        }
    }
    static void swap(int [] arr,int first, int second){
          int temp  = arr[first];
          arr[first] = arr[second];
          arr[second] = temp;
    }
    static int getmaxIndex(int [] arr,int start, int end){
         int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
