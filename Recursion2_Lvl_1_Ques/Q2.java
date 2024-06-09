package Recursion2_Lvl_1_Ques;

public class Q2 {
    public static void main(String[] args) {
       int ans =fac(0);
        System.out.println(ans);
    }
    static int fac(int n){
        if (n==1 || n==0){
            return 1;
        }
        return n * fac(n - 1);
    }
}
