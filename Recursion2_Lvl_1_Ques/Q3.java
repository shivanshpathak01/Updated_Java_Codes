package Recursion2_Lvl_1_Ques;

public class Q3 {
    public static void main(String[] args) {
        int ans = Sum(1342);
        System.out.println(ans);
    }
    static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n%10) +  Sum(n/10);
    }
    static int Product(int n) {
        if (n %10== n) {
            return n;
        }
        return (n%10) *  Product(n/10);
    }
}
