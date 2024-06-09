package Arrays;

public class $14OrderAgnosticBinarySearch_BS {
    public static void main(String[] args) {
        int [] arr ={1,2,5,6,8,9,10,11,54,58,60,68,69,70};
        int target = 500;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }else {
            isAsc=false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }

        }

        }return -1;
    }
}
