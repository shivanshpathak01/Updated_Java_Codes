package Recursion4_Subset_Ques;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(SubseRetAscii("","ab"));
    }
    static void ASCII(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ASCII(p+ch,up.substring(1));
        ASCII(p,up.substring(1));
        ASCII(p+(ch +0),up.substring(1));
    }

    static ArrayList<String> SubseRetAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = SubseRetAscii(p+ch,up.substring(1));
        ArrayList<String> second =SubseRetAscii(p,up.substring(1));
        ArrayList<String> third =SubseRetAscii(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
