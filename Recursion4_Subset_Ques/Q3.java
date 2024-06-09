package Recursion4_Subset_Ques;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bcappncapple"));
    }
    static String skipAppNotApple(String up){
    if (up.isEmpty()){
        return "";
    }
    if (up.startsWith("app") && !up.startsWith("apple")){
        return skipAppNotApple(up.substring(3));
    }else{
        return up.charAt(0)+up.substring(1);
    }
    }
}
