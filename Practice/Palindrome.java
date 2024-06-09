package Practice;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome(2882));
    }

    static int Palindrome(int x) {
        int a = 0;
        while(x>0) {
            int remainder = x % 10;
            a = a * 10 + remainder;
            x = x / 10;
        }
        return a;
    }
}
