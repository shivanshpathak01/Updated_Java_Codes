package Recursion2_Lvl_1_Ques;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(countZero(1010));
    }
    static int countZero(int n){
        return helper(n,0);
    }
    static int helper (int n, int c){
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem ==0){
            helper(n/10,c++);
        }
        return helper(n/10,c);
    }

}
