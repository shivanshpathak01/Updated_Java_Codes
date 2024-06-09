package Rec_Striver;

import java.util.ArrayList;

public class Re6 {
    public static void main(String[] args) {
            int arr[] = {1, 5, 6};
            int n = 3;
            ArrayList<Integer> list = new ArrayList<>();
            Subseq(0,list,arr,n);
    }
    static void Subseq(int index, ArrayList<Integer> list ,int arr[],int n){
        if (index==n){
            ArrayList<Integer> hi = new ArrayList<>();
            for (int num:hi) System.out.println(num);
            if (list.size()==0){
                System.out.println("{}");
            }
            return;
        }
        list.add(arr[index]);
        Subseq(index+1,list,arr,n);
        list.remove(index);
        Subseq(index+1,list,arr,n);

    }
}
