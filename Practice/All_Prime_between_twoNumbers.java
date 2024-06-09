package Practice;

import java.util.Scanner;

public class All_Prime_between_twoNumbers {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        int a = ch.nextInt();
        System.out.printf("Enter the numbers %d ",a);
        if (a<=1){
            System.out.println("Not prime");
        }
        for (int i = 2; i <=a; i++) {
            if (a%i ==0){
                System.out.println("Not Prime");
            }else {
                System.out.println("Prime");
            }
        }
    }
}