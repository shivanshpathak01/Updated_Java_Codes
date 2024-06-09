package Recursion2_Lvl_1_Ques;

// Java program to create Special triangle.

public class Q1 {
    public static void main(String[] args) {
        fuRev(5);
    }
    static void fu(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fu(n-1);
    }
    static void fuRev(int n){
        if (n==0){
            return;
        }
        fuRev(n-1);
        System.out.println(n);
    }
}