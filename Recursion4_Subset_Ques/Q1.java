package Recursion4_Subset_Ques;

public class Q1 {
    public static void main(String[] args) {
        skip("","baccdh");
    }
        static void skip(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch  = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1)); //substring(1) ->> To remove (1) one element
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
}