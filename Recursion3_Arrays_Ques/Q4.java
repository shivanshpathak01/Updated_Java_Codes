package Recursion3_Arrays_Ques;

import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args) {
        int []arr = {2,3,5,8,4,4,10,15};
    ArrayList<Integer> ans = findIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findIndex(int arr[],int target,int index,ArrayList<Integer>list){
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return findIndex(arr,target,index+1,list);
    }
}
