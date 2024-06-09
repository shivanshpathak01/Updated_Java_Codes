package Rohit_Negi_Rec;

public class CheckPalin_IN_Strings {
    public static void main(String[] args) {
        String str = "naman";
        System.out.println(CheckPalindrome(str,0,4));
    }
    static int CheckPalindrome(String str,int start,int end) {
        if (start >= end) {
            return 1;
        }
        if (str.charAt(start)!= str.charAt(end)) {
            return 0;
        } else {
            return CheckPalindrome(str, start + 1, end - 1);
        }
    }
}
