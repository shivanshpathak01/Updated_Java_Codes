package Rohit_Negi_Rec;

public class TargetSum_RepetitiveNumber {
    public static void main(String[] args) {
        int []arr = {2,3,4};
        System.out.println(TargetRepetitiveSum(arr,0,6));
    }
    static int TargetRepetitiveSum(int []arr,int index,int sum){
        if (sum==0) return 1;
        if (index == arr.length || sum<0) return 0;
        return TargetRepetitiveSum(arr,index+1,sum) + TargetRepetitiveSum(arr,index,sum-arr[index]);
    }
}
