package Rohit_Negi_Rec;

public class Rec_BS {
    public static void main(String[] args) {

    }
    static int BS(int []arr,int index,int start,int end,int target){
        if (start>end){
            return 0;
        }
        int mid  = start+(end-start)/2;
        if (arr[mid] ==target){
            return index;
        } else if (arr[mid]<target) {
            return BS(arr,index,mid+1,end,target);
        }
        else if (arr[mid]>target) {
            return BS(arr,index,mid-1,end,target);
        }
        return index;
    }
}
