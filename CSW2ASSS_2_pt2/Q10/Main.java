package CSW2ASSS_2_pt2.Q10;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "this is a test. this is only a test. testing, this one, two, three.";
        Hashtable<String,Integer> table = new Hashtable<>();

        for (String s:str.split("\\s+")) {
            if(table.containsKey(s)){
                int i = table.get(s);
                table.put(s,i+1);
            }else
                table.put(s,1);
        }

        String maxOccWord= "";
        int maxOcc = 0;

        Iterator<Map.Entry<String,Integer>> iter = table.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Integer> set = iter.next();
            if(set.getValue()>maxOcc){
                maxOccWord=set.getKey();
                maxOcc = set.getValue();
            }
        }

        System.out.println("The max Occurring word from the string is \""+maxOccWord+"\" and it has occurred for "+maxOcc+" times.");
    }
}
