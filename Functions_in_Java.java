import java.util.Scanner;

//import static sun.security.ssl.Utilities.swap;

public class Functions_in_Java {
    public static void main(String[] args) {
       swap();
    }

    static void swap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a+" "+b);


    }
}
