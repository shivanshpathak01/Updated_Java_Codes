package Patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        Pattern5(10);
    }
    static void Pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalcolinRow = row>n ? 2*n-row : row;
            for (int col = 1; col <= totalcolinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
