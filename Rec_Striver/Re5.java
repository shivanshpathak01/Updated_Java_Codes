package Rec_Striver;

// Multiple Recursion calls Illustration using Fibonacci Sequence Problem --->>>

public class Re5 {
    public static void main(String[] args) {
        System.out.println(Fun(4));
    }
    static int Fun(int n){
        if (n<=1)return n;
        int last = Fun(n-1);
        int Slast = Fun(n-2);
        return last + Slast;
    }


}
