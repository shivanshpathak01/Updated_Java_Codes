package Strings;

public class Palindrome_Ques {
    public static void main(String[] args) {
        String str = "a,b,c,d,b,a";
        System.out.println(isPalin(str));
    }
    static  boolean isPalin (String str){
        if (str.length() ==0 || str == null){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) { // here .length () is a function
            char start = str.charAt(i);
            char end  = str.charAt(str.length() -i-1);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
