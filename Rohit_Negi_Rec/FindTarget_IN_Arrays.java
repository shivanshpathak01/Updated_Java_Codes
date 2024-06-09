package Rohit_Negi_Rec;

public class FindTarget_IN_Arrays {
    public static void main(String[] args) {
        int arr [] = {3,6,4,5};
        System.out.println(FindTarget(arr,0,500));
    }
    static boolean FindTarget(int arr[],int index,int target){
        // Base Condition
        if (target ==0) return true;
        if (index== arr.length || target<0) return false;
        //Not take Condition
        return FindTarget(arr,index+1,target)||FindTarget(arr,index+1,target- arr[index]);//Take Condition

    }
}
