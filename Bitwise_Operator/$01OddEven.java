package Bitwise_Operator;

public class $01OddEven {
    public static void main(String[] args) {
        int n= 20;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1)==1;
    }
}
