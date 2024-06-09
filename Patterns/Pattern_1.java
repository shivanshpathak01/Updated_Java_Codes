package Patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        Pattern1(6);
    }
    static void Pattern1(int n){
        for (int row=1;row<=n;row++){
            for (int col = 1;col <=5;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
