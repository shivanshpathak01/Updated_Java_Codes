package Patterns;

public class Pattern_4 {
    public static void main(String[] args) {
        Pattern4(5);
    }
    static void Pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }
}
