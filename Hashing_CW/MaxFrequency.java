package Hashing_CW;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static void main(String[] args) {
        int arr[] = {2,6,1,5,1,5,1,2,1,5,4,1,1,1,121,1,1,121,1,5,2,5,2,3,5,5,2,3,6};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int ele : arr){
            if (!mp.containsKey(ele)){
                mp.put(ele,1);
            }else{
                mp.put(ele,mp.get(ele)+1);
            }
        }
        System.out.println();
//        System.out.println(mp.entrySet());
        int max = 0;
        int ansKey = -1;
        for (Map.Entry<Integer,Integer> e : mp.entrySet()){
            if (e.getValue()>max){
                max = e.getKey();
                ansKey = e.getKey();
            }
            System.out.println(ansKey);
        }
    }
}
