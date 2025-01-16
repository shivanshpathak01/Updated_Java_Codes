package Hashing_CW;

import java.util.HashMap;
import java.util.Map;

public class Basic {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Shivansh",10);
        mp.put("Rajeev",50);
        System.out.println();
        for(Map.Entry<String ,Integer> w : mp.entrySet()){
            System.out.printf("%s %d \n ",w.getKey(),w.getValue());
        }
    }
}
