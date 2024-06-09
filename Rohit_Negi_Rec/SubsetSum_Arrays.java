package Rohit_Negi_Rec;

public class SubsetSum_Arrays {
    public static void main(String[] args) {
        int []arr = {3,4,5};
        SubsetSum(arr,0,0);
    }
    static void SubsetSum(int[]arr,int index,int sum){
        if (index== arr.length){
            System.out.println(sum);
            return ;
        }
        SubsetSum(arr,index+1,sum);
        sum+=arr[index];
        SubsetSum(arr,index+1,sum);
    }
}
