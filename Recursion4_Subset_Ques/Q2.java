package Recursion4_Subset_Ques;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("bcdapplefgh");
    }
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));  //substring(1) ->> To remove (1) one element
        }
        else{
            return up.charAt(0) + skipApple (up.substring(1));
        }
    }
}
