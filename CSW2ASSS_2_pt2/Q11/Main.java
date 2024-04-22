package CSW2ASSS_2_pt2.Q11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array ={4,5,2,1,6,9,3,5,7,10};

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int a :array) {
            map.put(a,1);
        }

        for (int i = 1; i <=10; i++) {
            if(!map.containsKey(i)){
                System.out.println("smallest positive number missing in the array is: "+i);
                break;
            }
        }
    }
}
