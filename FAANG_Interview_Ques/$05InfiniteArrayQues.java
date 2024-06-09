package FAANG_Interview_Ques;

public class $05InfiniteArrayQues {
    public static void main(String[] args) {
      int arr[] = {1,5,12,25,36,39,40,69};
      int target =39;
        System.out.println(range(arr,target));
    }
    static int range(int[] arr,int target){
        int start=0;
        int end =1;
        //condition for the target to lie in the range
        while (target>arr[end]){
            int newStart = end + 1;
            // new end = previous end + 2*size of current box
            end = end + (end-start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int []arr, int target,int start,int end){
        while(start<=end){
            int mid = start +(end - start)/2;
            if (target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}