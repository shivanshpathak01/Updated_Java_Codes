package Arrays;

public class $09MinValue {
    public static void main(String[] args) {
        int [] arr = {2,5,0,-5,88,90,48,8,-15};
        System.out.println(min(arr));
    }
    // Assuming the array is not empty
    static int min(int nums[]){
        int ans = 0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]<ans){
                ans = nums[i];
            }
        }return ans;


    }
}
