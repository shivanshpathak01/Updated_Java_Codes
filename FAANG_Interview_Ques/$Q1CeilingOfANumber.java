package FAANG_Interview_Ques;
public class $Q1CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(arr,target);
        System.out.println(ans);
    }
    static int Ceiling(int []nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if (target<nums[mid]){
                end = mid -1;
            } else if (target>nums[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
