import java.util.Scanner;

public class Assign01Q1 {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%4==0){
            System.out.println("this is leap year");

        }
        else if (a%100 !=0 && a%400==0) {
            System.out.println("this is leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
}
