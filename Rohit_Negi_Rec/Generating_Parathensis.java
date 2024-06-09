package Rohit_Negi_Rec;

import java.util.ArrayList;
import java.util.List;

public class Generating_Parathensis {
    public static void main(String[] args) {
        List<String>ans = new ArrayList<>();
        String str = new String();
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans);
        }
    }
    static void Paranthesis(int n, int left, int right, List<String> ans,String temp){
        if (left+right ==2*n){
            ans.add(temp);
            return;
        }

        if (left<n){
            ans.add(String.valueOf('('));
            Paranthesis(n,left+1,right,ans,temp);
            ans.remove(String.valueOf('('));
        }
        if (right<left){
            ans.add(String.valueOf(')'));
            Paranthesis(n,left,right+1,ans,temp);
            ans.remove(String.valueOf(')'));
        }
    }
}
