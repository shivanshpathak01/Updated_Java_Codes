package Hashing_CW;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("keen","knee"));
    }
    static HashMap<Character,Integer> makeFreq (String str){
        HashMap<Character,Integer>mp  = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!mp.containsKey(c)){
                mp.put(c,1);
            }else {
                 int currentFreq = mp.get(c);
                 mp.put(c,currentFreq+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer>mp1 = makeFreq(s);
        HashMap<Character,Integer>mp2 = makeFreq(t);
        return mp1.equals(mp2);
    }
}
