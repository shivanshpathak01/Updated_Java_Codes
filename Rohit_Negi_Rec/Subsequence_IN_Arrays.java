package Rohit_Negi_Rec;

//import java.util.ArrayList;
import java.util.*;

public class Subsequence_IN_Arrays {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Subseq(arr,0, arr.length,ans,temp);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    static void Subseq(int []arr,int index,int n,List<List<Integer>> ans,ArrayList<Integer> temp){
        if (index==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        Subseq(arr,index+1,n,ans,temp);
        temp.add(arr[index]);
        Subseq(arr,index+1,n,ans,temp);
        temp.remove(temp.size()-1); // remove the last element after the recursive call
    }
}
