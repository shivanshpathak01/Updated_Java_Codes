import java.util.Scanner;

public class Assign01Q2 {
    public static void main(String[] args) {
        //table
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i=1;i<=10;i++){
            int b = a*i;
            int c=b;
            System.out.println(c);
        }


    }
}
