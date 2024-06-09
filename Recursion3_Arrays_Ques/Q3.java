package Recursion3_Arrays_Ques;

import java.util.ArrayList;

public class Q3 {
    //Linear seach on multiple occurences >>>
    public static void main(String[] args) {
        int arr[] = {1, 2 ,5 ,8 ,9 ,10 ,10 ,15};
        find(arr,10,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list= new ArrayList<>();
    static void find(int []arr, int target ,int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        find(arr,target,index+1);
    }
}
