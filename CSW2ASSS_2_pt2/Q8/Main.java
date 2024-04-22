package CSW2ASSS_2_pt2.Q8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "arc";

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c: str1.toCharArray()){
            if(map1.containsKey(c)) {
                int i = map1.get(c);
                map1.put(c,i+1);
            }else {
                map1.put(c,1);
            }
        }

        for(char c: str2.toCharArray()){
            if(map2.containsKey(c)) {
                int i = map2.get(c);
                map2.put(c,i+1);
            }else {
                map2.put(c,1);
            }
        }

        int counter= 0;
        if(str1.length()==str2.length()){
            Iterator<Map.Entry<Character,Integer>> iter1 = map1.entrySet().iterator();
            Iterator<Map.Entry<Character,Integer>> iter2 = map2.entrySet().iterator();

            while(iter1.hasNext()){
                Map.Entry<Character,Integer> set1 = iter1.next();
                Map.Entry<Character,Integer> set2 = iter2.next();
                if(set1.getValue()==set2.getValue() && set1.getKey()==set2.getKey())
                    counter++;
                else
                    break;
            }
        }
        if (counter==str1.length()) {
            System.out.println("The Strings are anagrams.");
        } else{
            System.out.println("The Strings are not anagrams.");
        }
    }
}
