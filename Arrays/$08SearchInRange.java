package Arrays;

public class $08SearchInRange {
    public static void main(String[] args) {
           int [] nums = {5,10,41,78,55,1,5,3,6,7};
           int target = 55;
        System.out.println(LinearSearch(nums,target,1,6));
    }
    static int LinearSearch(int []arr,int target,int start ,int end) {
        if (arr.length ==0){
            return -15;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        } return -10;
    }
}
