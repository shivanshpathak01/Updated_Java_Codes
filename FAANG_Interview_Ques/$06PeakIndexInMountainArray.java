package FAANG_Interview_Ques;

public class $06PeakIndexInMountainArray {
    public static void main(String[] args) {
   // https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    }
    static int PeakIndex(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int mid = s - ( s - e)/2;
            int mid2 = mid+1;
            if(arr[mid] < arr[mid2]) {
                s = mid2;
            }else {
                e = mid;
            }

        }
        return s;
    }
}