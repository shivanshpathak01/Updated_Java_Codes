package Recursion3_Arrays_Ques;

public class Q2 {
    public static void main(String[] args) {
        int []arr = {1,3,4,2,32,34};
        System.out.println(Find(arr,32,0));
    }
    static boolean Find(int []arr, int target ,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index]==target || Find(arr,target,index+1);
    }
}
