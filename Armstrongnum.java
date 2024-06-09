import java.util.Scanner;
public class Armstrongnum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int rem;
        int sum =0;
        while (a>0){
            rem = a%10;
            sum +=sum +rem*rem*rem;
             a=a/10;

        }if(sum==a){
            System.out.println("The given number is Armstrong");
        }else {
            System.out.println("The given number is not armstrong");
        }
    }
}
