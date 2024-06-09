package Recursion3_Arrays_Ques;
import java.util.ArrayList;
public class Q5 {
    public static void main(String[] args) {
        int arr[] = {1, 5 ,7 ,7, 9 ,10};
        System.out.println(find(arr,7,0));
    }
    static ArrayList<Integer> find(int[]arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> Belowcalls = find(arr,target,index+1);
        list.addAll(Belowcalls);
        return list;

    }
}
