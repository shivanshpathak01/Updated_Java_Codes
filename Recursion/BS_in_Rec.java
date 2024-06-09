package Recursion;

public class BS_in_Rec {
    public static void main(String[] args) {
    int []sum = {3,5,15,18,60,95,100,101,108,132,153,199};
    int target = 3;
        System.out.println(search(sum,target,0, sum.length-1));
    }
    static int search(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (target<arr[m]){
            search(arr,target,s,e=m-1);
        }
        return search(arr,target,s= m+1,e);
    }
}
