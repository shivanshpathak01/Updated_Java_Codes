package Bitwise_Operator;

public class $02Unique {
    public static void main(String[] args) {
        int [] arr={2,5,3,4,2,5,3};
        System.out.println(ans(arr));
    }

     static int ans(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
