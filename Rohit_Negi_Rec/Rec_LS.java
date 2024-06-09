package Rohit_Negi_Rec;

public class Rec_LS {
    public static void main(String[] args) {
        int []arr = {2,5,3,8,9,10,11,12};
        System.out.println(Rec(arr,50,0));
    }
    static boolean Rec(int []arr,int target,int index){
        if (arr[index] == target){
            return true;
        }
        if (index== arr.length) return false;
        return Rec(arr,target,index+1);
    }
}