package Patterns;

public class Pattern_2 {
    public static void main(String[] args) {
        Pattern2(3);
    }
    static void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
