package Recursion4_Subset_Ques;

import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(SubseRet("","abc"));
    }
    static ArrayList<String> SubseRet(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubseRet(p+ch,up.substring(1));
        ArrayList<String> right =SubseRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
