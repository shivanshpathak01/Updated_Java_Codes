package Java_CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("shivansh",10);
        hm.put("rahul",50);
        hm.put("nope",null);
        hm.putIfAbsent("nope",70);
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
        }
    }
}
